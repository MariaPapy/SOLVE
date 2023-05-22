package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите данные файлов: ");
        String data = scanner.nextLine();
        System.out.print("Введите имя первого файла: ");
        String fileName1 = scanner.nextLine();
        System.out.print("Введите имя второго файла: ");
        String fileName2 = scanner.nextLine();

        FileInterface ioFile = new IOFile();
        ioFile.writeToFile(fileName1, data);
        String ioData = ioFile.readFromFile(fileName1);
        System.out.println("Данные из первого файла (IO):");
        System.out.println(ioData);

        FileInterface nioFile = new NIOFile();
        nioFile.writeToFile(fileName2, data);
        String nioData = nioFile.readFromFile(fileName2);
        System.out.println("Данные из второго файла (NIO):");
        System.out.println(nioData);

        System.out.println("Результаты совпадают: " + ioData.equals(nioData));
    }
}