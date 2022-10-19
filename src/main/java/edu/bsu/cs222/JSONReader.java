package edu.bsu.cs222;

import netscape.javascript.JSObject;
import com.jayway.jsonpath.JsonPath;


public class JSONReader {

    public String parseName(Object name){
        Object result = JsonPath.read(name, "$..User");
        String finalResult = result.toString().replace("[", "");


        return finalResult.replace("]", "");

    }



}
