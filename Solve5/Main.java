public class Main {
    public static void main(String[] args) {
        genericPair<Integer, String> genericPair = new genericPair(100, "golden key");
        System.out.println((int)genericPair.getKey());
        System.out.println((String)genericPair.getData());
        genericPair.setKey(10);
        genericPair.setData("silver key");
        System.out.println((int)genericPair.getKey());
        System.out.println((String)genericPair.getData());
    }
}