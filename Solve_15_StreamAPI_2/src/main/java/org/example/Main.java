package org.example;

import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        StringToMap stringToMap = new StringToMap();
        System.out.println(stringToMap.convertStringToMap("-месяц 5 -май 27 -время 15"));
        System.out.println(stringToMap.convertStringToMap("-importkeystore true -srckeystore kafka.jks -destkeystore kafka.p12 -deststoretype PKCS12"));
        String s = "-importkeystore true -srckeystore kafka.jks -destkeystore kafka.p12 -deststoretype PKCS12";
        LinkedHashMap<String, String> map = stringToMap.convertStringToMap(s);
        System.out.println(s);
        System.out.println(stringToMap.convertMapToString(map));

        TableMult tableMulT = new TableMult();
        tableMulT.printTableMult();

    }
}