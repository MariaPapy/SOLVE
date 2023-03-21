package org.example;

public class Main {
    public static void main(String[] args) {
        LinkedList1 l1 = new LinkedList1();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        System.out.print("Размер односвязного списка без generic = ");
        System.out.println(l1.size());
        System.out.println((Integer) l1.get(0));
        System.out.println((Integer) l1.get(1));
        System.out.println((Integer) l1.get(2));

        LinkedListGeneric <String> l2 = new LinkedListGeneric();
        l2.add("10");
        System.out.print("Размер односвязного списка c generic =  ");
        System.out.println(l2.size());
        System.out.println((String) l2.get(0));

    }
}