import java.util.Scanner;

public class leapyear {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to New year Calculator");
        System.out.println("Please Enter the year that you want to check leap year");
        int year = input.nextInt();

        if(year % 400 == 0 || (year % 4 == 0 && year % 4== 0)){
            System.out.println("Your year is a leap year");
        }
        else{
            System.out.println("Your year is not leap year");
        }
    }
}
