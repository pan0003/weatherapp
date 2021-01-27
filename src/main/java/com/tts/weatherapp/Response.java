package com.tts.weatherapp;

import java.util.List;
import java.util.Map;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Creates a lot of getters, setters, 2string, and other code
@NoArgsConstructor //Generates a no arguments constructor
public class Response {
   private Map<String, String> coord;
   private List<Map<String, String>> weather;
   private String base;
   private Map<String, String> main;
   private Map<String, String> wind;
   private Map<String, String> clouds;
   private String dt;
   private Map<String, String> sys;
   private String id;
   private String name;
   private String cod;
}
