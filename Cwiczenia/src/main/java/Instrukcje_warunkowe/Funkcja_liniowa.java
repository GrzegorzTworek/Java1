package Instrukcje_warunkowe;

import java.util.Scanner;

public class Funkcja_liniowa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe a funkcji ");
        double a = input.nextDouble();

        if (a == 0) {
            System.out.println("Niedozwolona wartość współczynnika a");
        } else {
            System.out.println("Podaj liczbe b funkcji ");
            double b = input.nextDouble();
            System.out.println("Podaj liczbe c funkcji ");
            double c = input.nextDouble();
            double x;
x=(c-b)/a;
System.out.printf("Dla a = %2.2f i b= %2.2f x wynosi x = %2.2f",a,b,x);
}
}
}


