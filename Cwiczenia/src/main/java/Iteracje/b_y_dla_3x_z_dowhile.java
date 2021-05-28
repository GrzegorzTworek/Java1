package Iteracje;

public class b_y_dla_3x_z_dowhile {
    public static void main(String[] args){
        int x,y;
        x=0;
        do {
            y=3*x;
            System.out.println("Dla " + x + '\t'+ " funkcja wynosi 3x " + y );
            x++;

        }while(x<=10);
    }
}
