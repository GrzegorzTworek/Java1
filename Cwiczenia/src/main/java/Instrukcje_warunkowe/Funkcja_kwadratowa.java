package Instrukcje_warunkowe;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Funkcja_kwadratowa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe a funkcji ");
        double a = input.nextDouble();



        if (a == 0) {
            System.out.println("Niedozwolona wartość współczynnika a");
        }
        else
            { System.out.println("Podaj liczbe b funkcji ");
                double b = input.nextDouble();
                System.out.println("Podaj liczbe c funkcji ");
                double c = input.nextDouble();
                double x1;
                double x2;
                double x;
                double delta = b*b-4*a*c;
                System.out.println("Delta wynosi " + delta);

            if (delta < 0) {
                System.out.println("Delta jest ujemna nie można policzyc pierwiastków");

            } else if (delta == 0) {
                x = (-b) / (2 * a);
                System.out.printf("Pierwiasek rówanania wynosi %2.2f", x);
            } else {
                x1 = (-b - sqrt(delta)) / (2 * a);
                System.out.printf("Pierwiasek rówanania wynosi %2.2f\n", x1);
                x2 = (-b + sqrt(delta)) / (2 * a);
                System.out.printf("Drugi pierwiasek rówanania wynosi %2.2f\n", x2);
            }

        }
    }
}
