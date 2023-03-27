package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadText {
    public String resetText(String name) {
        String s = "Not Found";
        try {
            Path path = Paths.get(name);
            s = Files.readString(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return s;
    }
}

