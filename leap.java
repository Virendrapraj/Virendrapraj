import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        System.out.println("Enter year to find Year in leap year or not leap year -->");
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        if(year%4==0 && year%100 !=0 || year %400==0){
            System.out.println(year+ " is leap year");
        }else{
            System.out.println(year + " is not leap year");
        }
    }
}