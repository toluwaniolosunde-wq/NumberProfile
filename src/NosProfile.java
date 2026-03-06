import java.util.Scanner;

public class NosProfile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a natural number greater than 0.");
            return;
        }

        System.out.println("Even: " + isEven(number));
        System.out.println("Prime: " + isPrime(number));
        System.out.println("Perfect: " + isPerfect(number));
        System.out.println("Square: " + isSquare(number));
        System.out.println("Cube: " + isCube(number));
        System.out.println("Palindrome: " + isPalindrome(number));


        input.close();
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int index = 2; index <= number / 2; index++) {
            if (number % index == 0) {
                return false;
            }
        }

        return true;

    }
//    public static boolean isComposite(int number){
//        if (number<=1){
//            return false;
//        }
//            for (int index=4; index<=number/2; index++){
//
//            }
//
//    }

    public static boolean isPerfect(int number) {

        int sum = 0;

        for (int index = 1; index < number; index++) {
            if (number % index == 0) {
                sum += index;
            }
        }

        if (sum == number) {
            return true;
        }

        return false;
    }

    public static boolean isSquare(int number) {

        int sqrt = (int) Math.sqrt(number);

        if (sqrt * sqrt == number) {
            return true;
        }

        return false;
    }

    public static boolean isCube(int number) {

        int cbrt = (int) Math.cbrt(number);

        if (cbrt * cbrt * cbrt == number) {
            return true;
        }

        return false;
    }

    public static boolean isPalindrome(int number) {

        int original = number;
        int reversed = 0;

        while (number != 0) {

            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;

        }

        if (original == reversed) {
            return true;
        }

        return false;
    }

    }
