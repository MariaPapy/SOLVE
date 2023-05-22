package org.example;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIOFile implements FileInterface {
    @Override
    public void writeToFile(String fileName, String data) {
        Path path = Paths.get(fileName);
        try {
            Files.write(path, data.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String readFromFile(String fileName) {
        Path path = Paths.get(fileName);
        StringBuilder result = new StringBuilder();
        try {
            Files.lines(path, StandardCharsets.UTF_8).forEach(line -> result.append(line).append("\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result.toString();
    }
}