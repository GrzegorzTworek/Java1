package Iteracje;

public class t_tabliczka_mnożenia {
    public static void main(String[] args){
    int k;
        for(int i=1; i<=10;i++){
            for(int j=1;j<=10;j++){
               k=i*j;
                System.out.print(k +" \t" );
            }
            System.out.println();
        }
    }
}
