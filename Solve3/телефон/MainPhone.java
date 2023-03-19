package org.example;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("+79991112233","iPhone", 100);
        phone.toString();
        phone.receiveCall("Мой номер");
        phone.sendMessage();
    }
}
