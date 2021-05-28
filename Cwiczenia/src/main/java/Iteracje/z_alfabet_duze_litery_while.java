package Iteracje;

public class z_alfabet_duze_litery_while {
    public static void main(String[] args){
        char znak;
        znak='A';
        while (znak<='Z'){
            if(znak<'Z')
            System.out.print(znak + ", ");
            else
                System.out.print(znak + ". ");
            znak++;
        }
        System.out.println();
        znak='Z';
        while (znak>='A'){
            if(znak>'A')
                System.out.print(znak + ", ");
            else
                System.out.print(znak + ". ");
            znak--;
        }
    }
}
