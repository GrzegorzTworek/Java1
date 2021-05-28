package Iteracje;

public class c_y_dla_3x_z_while {
    public static void main(String[] args){
        int x,y;
        x=0;
        while (x<=10){
            y=3*x;
            System.out.println("Dla " + x + '\t'+ " funkcja wynosi 3x " + y );
            x++;
        }
    }
}
