package Iteracje;

import java.util.Random;

import static java.lang.Math.round;

public class p_najwiek_najmniej_ze_zbioru_wylos {
    public static void main(String[] args){
        int ilosc_liczb = 5;
        double liczba;
        double suma=0;
        double min;
        double max;
        System.out.println("Program losuje " + ilosc_liczb + " liczb całkowitych z przedziału od 0 do 99");
        Random r = new Random();
        min = round(100*(r.nextDouble()));
        System.out.println();
        System.out.print("Wylosowano liczby " + min + ", ");
        max = min;
        suma = max;

        for(int i=1;i<=ilosc_liczb-1;i++){
            liczba = round(100*(r.nextDouble()));
            System.out.print(liczba + ". " );

            if (max < liczba) max = liczba;
            if (liczba < min) min = liczba;

            suma = suma+liczba;
        }
        System.out.println();
        System.out.println("największa liczba to " + max + ". ");

        System.out.println("najmniejsza liczba to " + min + ". ");
        System.out.println("srednia to " + suma/ilosc_liczb + ". ");


//        r_najwiek_najmniej_ze_zbioru_wylos_dowhile yx = new r_najwiek_najmniej_ze_zbioru_wylos_dowhile();
//
//        yx.x();

    }
}



