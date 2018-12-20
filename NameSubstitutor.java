package yo;
import java.util.Scanner;

public class NameSubstitutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name:");
        String name = sc.next();
        String out = "Hi, my name is ${name}";
        System.out.print(out.replaceAll("\\$\\{name\\}", name));

    }
}
