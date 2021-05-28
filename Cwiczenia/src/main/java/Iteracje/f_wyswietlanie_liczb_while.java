package Iteracje;

public class f_wyswietlanie_liczb_while {
    public static void main(String[] args){
        int x,y;
        x=0;
        while (x<=20){

            if(x<20)
                System.out.print( x + ", ");
            else
                System.out.print( x + ". ");
            x++;
        }
    }
}
