import java.util.Scanner;

public class NumberProfile {
    public static void main(String [] args){

Scanner input = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = input.nextInt();

if (number <= 0) {
System.out.println("Please enter a natural number greater than 0.");
 return;
                }

// Even or odd
 if (number % 2 == 0)
System.out.println("It is an Even number.");
else
    System.out.println("It is an Odd number.");


boolean isPrime = true;

if (number == 1) {
isPrime = false;
} else {
for (int i = 2; i <= number / 2; i++) {
    if (number % i == 0) {
    isPrime = false;
    break;
    }
    }
    }
// prime number or composite number
if (isPrime) {
    System.out.println("It is a Prime number.");
}
else if (number != 1)
    System.out.println("It is a Composite number.");

// Perfect number
int sum = 0;
for (int i = 1; i < number; i++) {
    if (number % i == 0) {
        sum += i;
            }
        }

    if (sum == number) {
        System.out.println("It is a Perfect number.");
    }

        // Square Number
        int square = (int) Math.sqrt(number);
        if (square * square == number) {
            System.out.println("It is a Perfect Square.");
        }
        // Cube Number
        int cube = (int) Math.cbrt(number);
        if (cube * cube * cube == number) {
            System.out.println("It is a Perfect Cube.");


        }
        // Palindrome

        int numbers= number;
        int reverse=0;
        while (number> 0) {
        int digit= number % 10;
        reverse= (reverse * 10 )+ digit;
        number/=10;
        if ( reverse==numbers){
            System.out.println("It is a Palindrome.");
        }


        }

        // Armstrong number
        int original_number= number;
        String nos = String.valueOf(number);
        int len= nos.length();
        int addititon =0;





    }
}





