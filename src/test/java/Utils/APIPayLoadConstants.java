package Utils;

import netscape.javascript.JSObject;
import org.json.JSONObject;

public class APIPayLoadConstants {
    //we will pass the body in multiple formats, for this we have created this class

    public static String createEmployeePayload(){
        String createEmployeePayload="{\n" +
                "  \"emp_firstname\": \"Herry\",\n" +
                "  \"emp_lastname\": \"Miller\",\n" +
                "  \"emp_middle_name\": \"J.\",\n" +
                "  \"emp_gender\": \"M\",\n" +
                "  \"emp_birthday\": \"2023-05-24\",\n" +
                "  \"emp_status\": \"self\",\n" +
                "  \"emp_job_title\": \"Engineer\"\n" +
                "}";
        return createEmployeePayload;
    }

    // we can use either this up or that below
    public static String createEmployeePayloadJson(){
        JSONObject obj=new JSONObject();
        obj.put("emp_firstname","Tom");
        obj.put("emp_lastname","Hanks");
        obj.put("emp_middle_name","J.");
        obj.put("emp_gender","M");
        obj.put("emp_birthday","2012-05-20");
        obj.put("emp_status","Confirmed");
        obj.put("emp_job_title","Engineer");
        return obj.toString();
    }

    public static String createEmployeePayloadDynamic
            (String emp_firstname, String emp_lastname,
             String emp_middle_name, String emp_gender, String emp_birthday,
             String emp_status, String emp_job_title){

        JSONObject obj=new JSONObject();
        obj.put("emp_firstname",emp_firstname);
        obj.put("emp_lastname",emp_lastname);
        obj.put("emp_middle_name",emp_middle_name);
        obj.put("emp_gender",emp_gender);
        obj.put("emp_birthday",emp_birthday);
        obj.put("emp_status",emp_status);
        obj.put("emp_job_title",emp_job_title);

        return obj.toString();
    }

    public static String updateEmployeePayloadJson(){
        JSONObject obj=new JSONObject();
        obj.put("employee_id","57565A");
        obj.put("emp_firstname","Terry");
        obj.put("emp_lastname","John");
        obj.put("emp_middle_name","M");
        obj.put("emp_gender","M");
        obj.put("emp_birthday","2010-05-20");
        obj.put("emp_status","Retired");
        obj.put("emp_job_title","Manager");
        return obj.toString();
    }
}
