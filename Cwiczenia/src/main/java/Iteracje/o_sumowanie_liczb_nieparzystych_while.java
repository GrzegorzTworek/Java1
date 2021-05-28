package Iteracje;

public class o_sumowanie_liczb_nieparzystych_while {
    public static void main(String[] args){
        int x=0;
        int i=0;
        while(i<=100){
            if(!(i%2==0)){
                x=x+i;
            }
            i++;
        }
        System.out.println("Suna liczb nieparzystych wynosi " + x);
    }
}
