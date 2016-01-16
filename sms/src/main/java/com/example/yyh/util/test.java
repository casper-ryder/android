package com.example.yyh.util;

import org.json.JSONException;

/**
 * Created by Administrator on 2016/1/11.
 */
public class test {
    public static void main(String[] args) throws JSONException {

        String jsonString = JsonUtil.readFile("./info.json");
        System.out.println(jsonString);
    }
}
