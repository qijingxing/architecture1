package com.sishuok.util.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by qi on 2018/11/27.
 */
public class JsonHelper {
    private  JsonHelper(){}
    public static String object2str(Object obj){
        String retStr ="";
        ObjectMapper mapper = new ObjectMapper();
        try {
            retStr = mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return  retStr;
    }

}
