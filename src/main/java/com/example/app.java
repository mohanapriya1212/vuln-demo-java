package com.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.collections.MapUtils;

public class App {
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) throws Exception {
        logger.info("Starting vulnerable demo app");
        ObjectMapper om = new ObjectMapper();
        String json = "{\"hello\":\"world\"}";
        System.out.println("Parsed: " + om.readTree(json).toString());
    }
}
