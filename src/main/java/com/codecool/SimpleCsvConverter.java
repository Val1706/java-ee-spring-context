package com.codecool;

import org.springframework.stereotype.Component;

import java.io.File;
import java.util.List;

@Component
public class SimpleCsvConverter {

    private FileReader fileReader;
    private OutputFormatterFactory factory;

    public SimpleCsvConverter(FileReader fileReader, OutputFormatterFactory factory) {

        this.fileReader = fileReader;
        this.factory = factory;
    }

    void convert(File file, OutputType outputFormat){

        List<String[]> data = this.fileReader.readData(file);
        OutputFormatter outputFormatter = this.factory.createByFormat(outputFormat);
        outputFormatter.printToConsole(data);

    }

    void convert(File file){

        convert(file, TABLE);
    }
}
