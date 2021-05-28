package Iteracje;

public class v_tabliczka_mnozenia_while {
    public static void main(String[] args){
        int i=1;
    while(i<=10){
        int j=1;
        while(j<=10){
            int k = i*j;
            System.out.print(k + "\t");
            j++;
        }
        System.out.println();
        i++;
    }
    }
}
