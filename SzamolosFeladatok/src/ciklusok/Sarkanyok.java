package ciklusok;

public class Sarkanyok {

    public static void main(String[] args) {
        int osszes = 145;
        int[] adatok = new int[20];
        for (int i = 1; i < 20; i++) {
            for (int x = 1; x < 10; x++) {
                for (int y = 1; y < 10; y++) {
                    int elso = 7 * x;
                    int masodik = 11 * y;
                    adatok[i] += elso + masodik;
                    System.out.println(adatok[i]);
                }
            }
        }
    }
}
