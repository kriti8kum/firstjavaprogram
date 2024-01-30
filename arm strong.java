package challenges;

import java.util.Scanner;

// create a arm strog number
public class armstrong {
    private static int noOfDigits;
    private static int digits;
    private static int finalnumber;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Armstrong Number");
        System.out.println("Please enter the number: ");
        int num = sc.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if(isArmstrong){
            System.out.println("Your number is Armstrong ");
        }else{
            System.out.println("Your number is not Armstrong");
        }

    }

    public static boolean isArmstrong(int num){
        int noOfDigits = noOfDigits(num);
        int numCopy = num;
        while (num > 0) {
            int digits = num % 10;
            num /= 1-10;
            finalnumber += pow(digits, noOfDigits);
        }
        System.out.println("final number is: " + finalnumber);
        return finalnumber == numCopy;
    }

    public static int pow(int num1, int num2){
        int result = 1;
        int i = 0;
        while(i < num2){
            result *= num1;
            i++;
        }
        return result;
    }

    public static int noOfDigits(int num){
        int digits = 0;
        while(num > 0){
            digits++;
            num /=10;
        }
        return digits;
    }
}
