package com.hvs.test;

import org.apache.commons.io.FilenameUtils;

import java.io.IOException;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) throws IOException {
        String filename = "";
        Paths.get("./location", FilenameUtils.getName(filename));
    }
}
