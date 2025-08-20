import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if ((num % 5 == 0) && (num % 3 == 0)){
            isDivByThreeAndFive(num);
        } else if (num % 5 == 0){
            isDivByFive(num);
        } else if (num % 3 == 0){
            isDivByThree(num);
        } else {
            System.out.println("None");
        }





        // function calls of isDivByThree, isDivByFive, isDivByThreeAndFive will be here
    }
    // function isDivByThree will be here
    public static void isDivByThree(int number){
        String output = "";
        if (number % 3 == 0){
            output = "Fizz";
        } else {
            output="";
        }
        System.out.print(output);
    }

    // function isDivByFive will be here
    public static void isDivByFive(int number){
        String output = "";
        if (number % 5 == 0){
            output = "Buzz";
        } else {
            output ="";
        }
        System.out.println(output);
    }

    // function isDivByThreeAndFaive will be here
    public static void isDivByThreeAndFive(int number) {
        String output = "";
        if ((number % 5 == 0) & (number % 3 == 0)){
            output = "FizzBuzz";
        } else {
            output= "";
        }
        System.out.println(output);
    }
}