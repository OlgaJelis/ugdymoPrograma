package org.example;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Vaikas vaikas1 = new Vaikas(
                1, "Jonas", 5
        );

        Vaikas vaikas2 = new Vaikas (
              2, "Marija", 3
        );

        Dienorastis dienorastisv1 = new Dienorastis(
                3, 20, "guli ant pilvo", "šypsosi",
                "seka akimis mamą", 5,62, "juodai baltos kortelės"
        );

        Dienorastis dienorastisv2 = new Dienorastis(
                6, 17, "sedi", "bijo svetimu zmoniu",
                "domisi aplinka", 8, 72, "knyguciu vartymas"
        );

        Etapai etapai1 = new Etapai (
                1, 20, "judina rankas, kojas", "seka akimis",
                "menesio pabaigoje syspsosi", 4,60,
                "juodai baltos korteles"
        );

        Etapai etapai2 = new Etapai (
                2, 19, "trumpai guli ant plivo",
                "gali suimti zaisliuka", "patinka stebeti aplinka",
                5,65, "barskuciai");

        vaikas1.setMenesioPasiekimai(dienorastisv1);
        vaikas2.setMenesioPasiekimai(dienorastisv2);

ArrayList<Etapai>etapas = new ArrayList<>();
etapas.add(etapai1);
etapas.add(etapai2);

Scanner input = new Scanner (System.in);
        System.out.println("Pasirinkite, kurio vaiko informacija spausdinti");
        int myInt = input.nextInt();
        if (myInt == 1) {

        System.out.println(etapai1);
        System.out.println(vaikas1);
        vaikas1.getMenesioPasiekimai().forEach(System.out::println); }


        if (myInt == 2) {

        System.out.println(etapai2);
        System.out.println(vaikas2);
        vaikas2.getMenesioPasiekimai().forEach(System.out::println);}

        Scanner input1 = new Scanner(System.in);
        System.out.println("Pasirinkite menesi, kurio etapai jus domina.");
               input1.nextLine();
               int myInt1 = input1.nextInt();
               switch (myInt1)
               {case 1:
                   System.out.println(etapai1);
                   break;
               case 2:
                   System.out.println(etapai2);
                   break;}

    }
}