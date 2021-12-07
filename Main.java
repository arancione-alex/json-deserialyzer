package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {

        String JSON_TEXT =  """
                 {
                    "books": [
                       {
                          "name": "…",
                          "pages": 100,
                          "author": "xxx"
                       },
                       {
                          "name": "…",
                          "pages": 200,
                          "author": "yyyy"
                       }
                    ]
                  }
                """;




        Gson gson = new GsonBuilder().create();
        Books books = gson.fromJson(JSON_TEXT, Books.class);
        System.out.println(books);
    }
}