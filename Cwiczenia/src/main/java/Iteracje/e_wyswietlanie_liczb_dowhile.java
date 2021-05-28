package Iteracje;

public class e_wyswietlanie_liczb_dowhile {
    public static void main(String[] args){
        int x,y;
        x=0;
        do{
            if(x<20)
                System.out.print( x + ", ");
            else
                System.out.print( x + ". ");
            x++;
        }while (x<=20);
    }
}
