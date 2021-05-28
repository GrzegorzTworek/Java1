package Iteracje;

import java.util.Random;

import static java.lang.Math.round;

public class s_najwiek_najmniej_ze_zbioru_wylos_while {

    public static void main(String[] args){
        double suma = 0;
        double liczba;
        double min;
        double max;
        int x = 1;
        int ilosc_liczb =2;
        System.out.println("Program losuje " + ilosc_liczb + " ze stu");
        Random r = new Random();
        min = round(100*(r.nextDouble()));
        System.out.print("Wylosowane liczby to " + min);
        max =min;
        suma = max;
        while(x<=ilosc_liczb-1){
            liczba = round(100*(r.nextDouble()));
            System.out.print(", " + liczba);
            if (liczba<min) min=liczba;
            if (liczba>max) max=liczba;
            suma =suma+liczba;
            x++;

        }
        System.out.println();
        System.out.println("Najmniejsz liczba to " + min);
        System.out.println("Największa liczba to " + max);
        System.out.println("Srednia to " + suma/ilosc_liczb);


    }
}
