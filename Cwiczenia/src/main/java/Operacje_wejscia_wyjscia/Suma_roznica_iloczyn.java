package Operacje_wejscia_wyjscia;

import java.io.IOException;
import java.util.Scanner;

public class Suma_roznica_iloczyn {
    public static void main(String[] args){
       // throws IOException;
            Scanner input = new Scanner(System.in);
            System.out.println("Podaj liczbe x");
            float x = input.nextFloat();
            System.out.println("Podaj liczbe y");
            float y = input.nextFloat();

            float suma = x + y;
            float roznica = x - y;
            float iloczyn = x * y;
            float dzielenie = x / y;

            System.out.printf("Suma x i y wynosi %2.2f", suma);
            System.out.printf("Roznica x i y wynosi %2.2f", roznica);
            System.out.printf("Iloczyn x i y wynosi %2.2f", iloczyn);
            System.out.printf("Iloraz x i y wynosi %2.2f", dzielenie);

    }
}
