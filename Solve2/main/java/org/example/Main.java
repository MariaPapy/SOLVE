package org.example;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{3, 5, 1, 4, 2};
        BubbleSort BubblSort = new BubbleSort();
        int[] res = BubblSort.BubbleSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(res[i]);
        }

        qSort qSort = new qSort();
        int[] res2 = qSort.qSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(res2[i]);
        }
    }
}