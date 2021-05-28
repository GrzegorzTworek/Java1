package Iteracje;

public class n_sumowanie_liczb_nieparzystych_dowhile {
    public static void main(String[] args){
        int x=0;
        int i=0;
        do {
            if(!(i%2==0)){
                x=x+i;

            }i++;
        }while(i<=100);
        System.out.println("Suma liczb nieparzystych wynosi " + x);
    }
}
