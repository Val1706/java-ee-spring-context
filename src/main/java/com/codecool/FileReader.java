package com.codecool;

import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class FileReader {

    public List<String[]> readData(File file) {

        List<String[]> data = new ArrayList<String[]>();

        try {

            Scanner read = new Scanner(file);


            while (read.hasNextLine()) {

                String[] line = read.nextLine().split(",");
                data.add(line);
            }
            read.close();

        }
        catch(FileNotFoundException e)  {
            System.out.println("No file!");
        }
        return data;

    }
}
