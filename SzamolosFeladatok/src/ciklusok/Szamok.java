package ciklusok;

import java.util.Scanner;

public class Szamok {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ismetlessel legyen? (1 = igen/0 = nem): ");
        int valasz = input.nextInt();
        int szam3 = 2;
        for (int index = 0; index < 3; index++) {
            int szam2 = 2;
            for (int j = 0; j < 3; j++) {
                int szam1 = 2;
                for (int i = 0; i < 2; i++) {
                    szam1++;
                    if (valasz == 1) {
                        System.out.println(szam3 + "" + szam2 + "" + szam1);
                    } else if (valasz == 0) {
                        if (szam3 != szam2 && szam3 != szam1 && szam1 != szam2) {
                            System.out.println(szam3 + "" + szam2 + "" + szam1);
                        }
                    }
                }
                szam2++;
            }
            szam3++;
        }
    }
}
