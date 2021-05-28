package Iteracje;

public class i_sumoawanie_liczb_while {
    public static void main(String[] args){
        int x=0;
        int i=0;
        while(i<=100){
            x=x+i;
            i++;
        }
        System.out.println("Suma wynosi " + x);
    }
}
