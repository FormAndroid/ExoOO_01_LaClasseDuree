package be.bxl.formation;

import be.bxl.formation.models.Duree;

public class Main {

    public static void main(String[] args) {

        Duree d1 = new Duree(3666);
        Duree d2 = new Duree(0, 0, 1, 5);
        Duree d3 = new Duree(0, 36, 0, 0);

        System.out.println(" - Valeur initial ");
        System.out.println(d1.getDuree());
        System.out.println(d2.getDuree());
        System.out.println(d3.getDuree());
        System.out.println();

        System.out.println(" - Operation : d1 - d2");
        d1.subDuree(d2);
        System.out.println(d1.getDuree());
        System.out.println();

        System.out.println(" - Operation : d3 + d1");
        d3.addDuree(d1);
        System.out.println(d3.getDuree());
        System.out.println();

        System.out.println(" - Valeur final ");
        System.out.println(d1.getDuree());
        System.out.println(d2.getDuree());
        System.out.println(d3.getDuree());
        System.out.println();
    }
}
