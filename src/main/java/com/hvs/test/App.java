package com.hvs.test;

import org.apache.commons.io.FilenameUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) throws IOException {
        if (args.length > 0) {
            readFile(args[0]);

            readFile(args[0]);
        }

        File file = new File("./myfiles", "test.txt");

        BufferedReader br
                = new BufferedReader(new FileReader(file));

        // Declaring a string variable
        String st;
        // Condition holds true till
        // there is character in a string
        while ((st = br.readLine()) != null)

            // Print the string
            System.out.println(st);


        br.close();


    }

    public static void readFile(String filename) throws IOException {
        Path path = Paths.get("./location", filename);
        System.out.println(Files.readAllLines(path));
    }

    public static void writeFile(String filename, byte[] bytes) throws IOException {
        Path path = Paths.get(filename);
        System.out.println(Files.write(path, bytes));
    }

    private static void removeFile(String location, String filename) {
        Path filePath = Paths.get(location, filename);

        if (!Files.exists(filePath)) {
            return;
        }

        try {
            Files.delete(filePath.getFileName());
        } catch (Exception e) {
            String excMessage = "some info";
            System.out.println(excMessage);
        }
    }

}
