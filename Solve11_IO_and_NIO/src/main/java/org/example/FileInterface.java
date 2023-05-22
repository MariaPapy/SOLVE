package org.example;

public interface FileInterface {
    void writeToFile(String fileName, String data);
    String readFromFile(String fileName);
}