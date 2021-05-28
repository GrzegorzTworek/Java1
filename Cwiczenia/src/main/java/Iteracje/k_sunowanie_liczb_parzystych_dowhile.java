package Iteracje;

public class k_sunowanie_liczb_parzystych_dowhile {
    public static void main(String[] args){
        int x=0;
        int i=0;
        do{
            if(i%2==0){
                x=x+i;
            }
            i++;
        }while(i<=100);
            System.out.println("Suma liczb parzystych wynosi " + x);
    }
}
