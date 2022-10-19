package edu.bsu.cs222;

import netscape.javascript.JSObject;
import com.jayway.jsonpath.JsonPath;


public class JSONReader {

    public String parseName(Object name){
        Object result = JsonPath.read(name, "$..User");
        String finalResult = result.toString().replace("[", "");
        String finalR = finalResult.replace("\"", "");

        return finalR.replace("]", "");
    }

    public String parseEmail(Object email) {
        Object result = JsonPath.read(email, "$..Email");
        String finalResult = result.toString().replace("[", "");
        String finalR = finalResult.replace("\"", "");

        return finalR.replace("]", "");
    }

    public String parsePhoneNumber(Object phoneNumber) {
        Object result = JsonPath.read(phoneNumber, "$..PhoneNumber");
        String finalResult = result.toString().replace("[", "");
        String finalR = finalResult.replace("\"", "");

        return finalR.replace("]", "");
    }
}
