package Operacje_wejscia_wyjscia;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Prostokat {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Podaj bok a ");
        double a = input.nextDouble();
        System.out.println("Podaj bok b ");
        double b = input.nextDouble();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double wynik = a*b;
        System.out.println(wynik);
    }
}
