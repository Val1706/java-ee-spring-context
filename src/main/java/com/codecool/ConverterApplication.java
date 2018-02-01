package com.codecool;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class ConverterApplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        SimpleCsvConverter csvConverter = (SimpleCsvConverter) ctx.getBean("simpleCsvConverter");
        startActionByRequest(csvConverter, args);

    }

    public static void startActionByRequest(SimpleCsvConverter csvConverter, String[] args){

        if (args.length > 1 && args[1].endsWith(".csv")) {

            String formatName = args[0];
            String fileName = args[1];
            File file = new File("src/main/java/com/codecool/files/" + fileName);

            csvConverter.convert(file, OutputType.valueOf(formatName.toUpperCase()));

        } else if(args.length == 1 && args[0].endsWith(".csv")) {

            String fileName = args[0];
            File file = new File("src/main/java/com/codecool/files/" + fileName);

            csvConverter.convert(file);

        } else {

            System.out.println("No file defined");
            System.exit(0);
        }

    }
}
