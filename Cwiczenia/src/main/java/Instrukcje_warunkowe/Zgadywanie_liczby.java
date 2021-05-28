package Instrukcje_warunkowe;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.round;

public class Zgadywanie_liczby {
    public static void main(String[] args){
        double losuj_liczbe, zgadnij_liczbe;
        Scanner input = new Scanner(System.in);
        System.out.println("Program losuje liczve od 0 do 9");
        System.out.println("Zgadnij liczbe");

        Random r = new Random();
        losuj_liczbe = round(10*(r.nextDouble()));
        zgadnij_liczbe = input.nextDouble();
        if (zgadnij_liczbe == losuj_liczbe){
            System.out.println("Brawo ! Zgadłeś liczbe");

        }
        else {
            System.out.print("Niestety ale wylosowana liczba to ");
            System.out.println((int)losuj_liczbe);
        }
    }

}
