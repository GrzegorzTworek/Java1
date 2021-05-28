package Operacje_wejscia_wyjscia;

import java.util.Scanner;

public class Objetosc_kuli {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj promien kuli ");
        double promien = input.nextDouble();
        double objetosc = 4*Math.PI*promien*promien*promien/3 ;
        System.out.printf("Promien kuli wynosi ");
        System.out.printf("%2.2f\n",promien);
        System.out.printf("Objetos kuli inny format ");
        System.out.printf("%2.2f\n",objetosc);


        System.out.println("Objetos kuli wynosi " + objetosc);
    }
}
