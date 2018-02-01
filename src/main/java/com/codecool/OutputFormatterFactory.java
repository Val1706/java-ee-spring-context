package com.codecool;


import org.springframework.stereotype.Component;

@Component
public class OutputFormatterFactory {

    public OutputFormatter createByFormat(OutputType outputFormat) {

        switch (outputFormat) {

            case JSON:
                return new JsonOutputFormatter();
            case XML:
                return new XmlOutputFormatter();
            case TABLE:
                return new TableOutputFormatter();

            default:
                return new TableOutputFormatter();
        }
    }
}
