package Iteracje;

public class h_sumowanie_liczb_dowhile {
    public static void main(String[] args){
        int x=0;
        int i=0;
        do{
            x=x+i;
            i++;
        }while (i<=100);
        System.out.println("Suma liczb wynosi " + x);
    }
}
