import java.util.*;

public class NaturalNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int n = sc.nextInt();
        System.out.println("THIS CODE IS TO FIND MULTIPAL OF 5 ");
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println(" This code for find  natural number ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("This code for find multipal of 3 and 5 ");

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {

                System.out.print(i+" ");
            }
            
        }
        System.out.println();
        System.out.println("This code for  find Multipal of n number ");

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i+" ");
            }
        }

    }
}
