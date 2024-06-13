package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void cekString(String kata) {
        int uppercase = 0;
        int lowercase = 0;
        int angka = 0;
        int symbol = 0;
        for (int i = 0; i < kata.length(); i++) {
            if (Character.isDigit(kata.charAt(i))) {
                angka++;
            }
            else if (Character.isLetter(kata.charAt(i))) {
                if (Character.isUpperCase(kata.charAt(i))) {
                    uppercase++;
                } else if (Character.isLowerCase(kata.charAt(i))) {
                    lowercase++;
                }
            }
            else {
                symbol++;
            }
        }
        System.out.println("uppercase : " + uppercase);
        System.out.println("lowercase : " + lowercase);
        System.out.println("angka : " + angka);
        System.out.println("symbol : " + symbol);
    }

    public static void main(String[] args) {
        String pilihan = "";
        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("Masukkan kata : ");
            String word = scan.nextLine();
            cekString(word);

            System.out.println("Ingin Mengulangi ? ");
            System.out.println("Tekan x/X untuk berhenti.");
            pilihan = scan.nextLine();
        } while (!pilihan.equals("x") && !pilihan.equals("X"));
    }
}