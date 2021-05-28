package Iteracje;

public class j_sumowanie_liczb_parzystych {
    public static void main(String[] args){
        int x=0;
        for(int i=0; i<=100;i++){
            if(i%2==0){
                x=x+i;

            }

        }
        System.out.println("Suma liczb parzystych wynosi " + x);
    }
}
