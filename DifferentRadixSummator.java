package yo;
import java.util.Scanner;

public class DifferentRadixSummator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        int z;
        System.out.println ("Enter X in Bin:");
        x = sc.nextInt(2);
        System.out.println ("Enter Y in Oct:");
        y = sc.nextInt ( 8);
        System.out.println ("Enter Z in Hex:");
        z = sc.nextInt(16);
        System.out.println ("X + Y + Z = " + (x+y+z));


    }
}
