package ciklusok;

public class Szamok {

    public static void main(String[] args) {
        int szam3 = 2;
        for (int index = 0; index < 2; index++) {
            int szam2 = 2;
            for (int j = 0; j < 2; j++) {
                int[] szamok = new int[3];
                int szam = 2;
                for (int i = 0; i < szamok.length; i++) {
                    szamok[i] += szam;
                    szam++;
                    System.out.println(szam3+""+szam2 + "" + szamok[i]);
                }
                szam2++;
            }
            szam3++;
        }
    }

}
