package com.codecool;

import java.util.List;

public class TableOutputFormatter implements OutputFormatter{

    public void printToConsole(List<String[]> data) {
            for(String[] el : data) {
                for(String string : el) {
                    System.out.println(string);
                }
            }
    }
}
