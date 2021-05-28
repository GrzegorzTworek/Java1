package Iteracje;

public class x_alfabet_duze_litery {
    public static void main(String[] args){
        char znak;
        System.out.println("Program wyświetla duze litery od A do Z");

        for(znak= 'A'; znak<='Z'; znak++){
            if (znak<'Z')
            System.out.print(znak + ", ");
            else
                System.out.print(znak + ". ");
        }
        System.out.println();
        for(znak= 'Z'; znak>='A'; znak--){
            if (znak>'A')
                System.out.print(znak + ", ");
            else
                System.out.print(znak + ". ");
        }

    }
}
