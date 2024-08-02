import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader=new Scanner (System.in);
        int a,b;
        a = reader.nextInt();
        b = reader.nextInt();
        if (a>b) {
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }
}