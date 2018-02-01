package com.codecool;

import com.thoughtworks.xstream.XStream;

import java.util.List;

public class XmlOutputFormatter implements OutputFormatter{

    public void printToConsole(List<String[]> data) {


        XStream xstream = new XStream();
        String x = xstream.toXML(data);

        System.out.println(x);
    }
}
