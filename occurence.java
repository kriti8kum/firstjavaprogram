package challenges;
// create a program to find number of occurences of an element in an array

import java.util.Scanner;

class occurences {
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
       System.out.println("Welcome to Array Occurrences\n");
       int[] numArr = arrayutility.inputArray();
       System.out.println("Now enter the number you want to find: ");
        int num = input.nextInt();
        int occurences = noOfOccurrence(numArr, num);
        System.out.println("Your element was found " + occurences + " times in the array");
    }

    public static int noOfOccurrence(int[] numArr, int num){
       int occ = 0;
       int i = 0;
       while (i < numArr.length) {
        if(numArr[i]==num){
            occ++;
        }
        i++;
       }
        return occ;
    }
}
