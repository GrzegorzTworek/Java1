package Iteracje;

public class u_tabliczka_mnozenia_dowhile {
    public static void main(String[] args) {

        int i = 1;
        do {
            int j = 1;
            do {
                int k = j * i;
                System.out.print(k + "\t");
                j++;

            } while (j <= 10);
            i++;
            System.out.println();
        } while (i <= 10);
    }
}

