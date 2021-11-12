package com.poc.dynamicjsonparsing.jsonparsingpoc.controller;

import com.google.gson.Gson;
import com.poc.dynamicjsonparsing.jsonparsingpoc.entity.*;
import com.poc.dynamicjsonparsing.jsonparsingpoc.entity.template.modifcation.MainModificationTemplate;
import com.poc.dynamicjsonparsing.jsonparsingpoc.repository.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;

@RestController
public class JsonController {

    @Autowired
    JsonMappingController jsonMappingController;

    @Autowired
    FieldMasterController fieldMasterController;

    @Autowired
    JsonCustomizationController jsonCustomizationController;

    @Autowired
    private JsonCustomizationRepository jsonCustomizationRepository;

    @Autowired
    private JsonMappingRepository jsonMappingRepository;

    @Autowired
    private TabMasterRepository tabMasterRepository;

    @Autowired
    private FieldMasterRepository fieldMasterRepository;

    @Autowired
    private SectionMasterRepository sectionMasterRepository;

    public String createJson(String dataList) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] jsonData = dataList.split(",");
        Gson gson = new Gson();
        FieldMaster fieldMaster = fieldMasterController.getFieldMaster(jsonData[0]);
        stringBuilder.append(gson.toJson(fieldMaster));
        for (int i = 1; i < jsonData.length; i++) {
            fieldMaster = fieldMasterController.getFieldMaster(jsonData[i]);
            stringBuilder.append(",").append(gson.toJson(fieldMaster));
        }
        return stringBuilder.toString();
    }

    @GetMapping("/test")
    public String testing() throws ParseException {
        try {
            Gson gson = new Gson();
            JsonMapping jsonMapping = jsonMappingRepository.findById(1);
            JSONObject mainObject = new JSONObject(jsonMapping.getMasterJson());
            JsonCustomization jsonCustomization = jsonCustomizationRepository.findByCustomerId("cust_1");
//            CustomJson customJson = gson.fromJson(jsonCustomization.getCustomJson(), CustomJson.class);
            JsonMappingTemplate jsonMappingTemplate = gson.fromJson(jsonMapping.getMasterJson(), JsonMappingTemplate.class);
            String tabFieldJson = "{ \"root\": [ ";
            for (int j = 0; j < jsonMappingTemplate.getRoot().size(); j++) {
                TabMaster tabMaster = tabMasterRepository.findByTabId(jsonMappingTemplate.getRoot().get(j).getTab_id());
                tabFieldJson = tabFieldJson + "{ \"name\" : \"" + tabMaster.getTabLabel() + "\", \"isDisplayMobile\": false, \"section\": [";
                List<SectionTabs> sectionTabsList = jsonMappingTemplate.getRoot().get(j).getSections();
                for (int sectionIndex = 0; sectionIndex < sectionTabsList.size(); sectionIndex++) {
                    SectionMaster sectionMaster = sectionMasterRepository.findBySectionId(sectionTabsList.get(sectionIndex).getSectionId());
                    tabFieldJson +=
                            "{\n" +
                                    " \"section_name\": \"" + sectionMaster.getSectionLabel() + "\",\n" +
                                    " \"fields\": [";

                    List<String> fields = sectionTabsList.get(sectionIndex).getFields();
                    for (int i = 0; i < fields.size(); i++) {
                        FieldMaster fieldMaster = fieldMasterRepository.findByFieldId(fields.get(i));
//                        JSONObject dummyObject = new JSONObject(gson.toJson(fieldMaster));
//                        mainObject.put("root", dummyObject);

                        if (fields.size() == (i + 1))
                            tabFieldJson = tabFieldJson + gson.toJson(fieldMaster);
                        else
                            tabFieldJson = tabFieldJson + gson.toJson(fieldMaster) + ",";
                    }
                    if (jsonMappingTemplate.getRoot().size() == (j + 1))
                        tabFieldJson = tabFieldJson + "]}";
                    else
                        tabFieldJson = tabFieldJson + "]},";
                }
                tabFieldJson += "},";
            }
            tabFieldJson = tabFieldJson + "]}";
//            JsonMappingRootList jsonMappingRootList = gson.fromJson(tabFieldJson, JsonMappingRootList.class);

//            JSONObject person = new JSONObject(tabFieldJson);
//            person.get("root");
//            JSONObject fieldObject = person.getJSONArray("root").getJSONObject(0).getJSONArray("fields").getJSONObject(0);
//            fieldObject.put(person.getJSONArray("root").getJSONObject(0).getJSONArray("fields").getJSONObject(0).get("dbObjectMapping").toString(), "generalDetails");
            return createCustomJson(tabFieldJson, "cust_1");
//            return tabFieldJson;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String createCustomJson(String defaultJson, String customerId) {
        JsonCustomization jsonCustomization = jsonCustomizationRepository.findByCustomerId(customerId);
        Gson gson = new Gson();
        String customJason = gson.toJson(jsonCustomization.getCustomJson(), MainModificationTemplate.class);
        return customJason;
    }

    public static boolean solve(JSONArray jsonArray, String after, String tabName, String sectionName, String field, int count, char ch) {
        try {
            for (int first = 0; first < jsonArray.length(); first++) {
                if (jsonArray.getJSONObject(first).get("name").equals(tabName)) {
                    JSONArray jsonArray1 = jsonArray.getJSONObject(first).getJSONArray("section");
                    System.out.println("Aa gaya 1 me");
                    try {
                        for (int second = 0; second < jsonArray1.length(); second++) {
                            if (jsonArray1.getJSONObject(second).get("section_name").equals(sectionName)) {
                                JSONArray jsonArray2 = jsonArray1.getJSONObject(second).getJSONArray("fields");
                                System.out.println("Aa gaya 2 me");
                                for (int third = 0; third < jsonArray2.length(); third++) {
                                    if (jsonArray2.getJSONObject(third).getString("fieldId").equals(after)) {
                                        if (ch == 'a') {
//                                            addAfter(jsonArray1, jsonArray2, third, second);
                                        }
                                        if (ch == 'd') {
                                            delete(jsonArray1, jsonArray2, third, second);
                                        }
                                        if (ch == 'u') {
                                            update(jsonArray2.getJSONObject(third));
                                        }
                                        System.out.println("Aa gaya 3 me");
                                        break;
                                    }
                                }
                                break;
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean delete(JSONArray jsonArray1, JSONArray jsonArray2, int third, int second) throws JSONException {
        try {
            jsonArray2.remove(third);
            jsonArray1.getJSONObject(second).put("fields", jsonArray2);
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean update(JSONObject jsonObject) {
        try {
            jsonObject.put("fieldId", "tej");
            jsonObject.put("validationType", "dat1");
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return false;
    }


    public String updateDataInJson(CustomJson customizeJson, String[] jsonData) {
        return null;
    }
}
