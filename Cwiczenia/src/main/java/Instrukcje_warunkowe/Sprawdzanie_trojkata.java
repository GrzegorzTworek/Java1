package Instrukcje_warunkowe;

import java.util.Scanner;

public class Sprawdzanie_trojkata {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj bok a trojkąta ");
        double a = input.nextDouble();
        System.out.println("Podaj bok b trojkąta ");
        double b = input.nextDouble();
        System.out.println("Podaj bok c trojkąta ");
        double c = input.nextDouble();

        if (a<0){
            System.out.println("Bok a nie może byc ujemny ");
        }
        else if(b<0){
            System.out.println("Bok b nie może byc ujemny ");
        }
        else if(c<0){
            System.out.println("Bok c nie może byc ujemny ");
        }
        else if(a*a+b*b==c*c){
            System.out.println("Boki trójkata tworz trojkąt prostokatny");
        }
        else {
            System.out.println("Boki są dodatnie mozna zbudowac z nich trójkąt ");
            }
        }
    }

