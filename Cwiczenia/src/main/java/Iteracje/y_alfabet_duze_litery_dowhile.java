package Iteracje;

public class y_alfabet_duze_litery_dowhile {
    public static void main(String[] args){
        char znak;
        znak = 'A';
        do{

            System.out.print(znak + ", ");
            znak++;
        }while(znak<='Z');
        System.out.println();
        znak = 'Z';
        do{

            System.out.print(znak + ", ");
            znak--;
        }while(znak>='A');
    }
}
