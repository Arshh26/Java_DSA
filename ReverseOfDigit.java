import java.util.Scanner;
class ReverseOfDigit {
    public static void main(String[] args) {
        greetings();
        Scanner input = new Scanner(System.in);
        System.out.println("Please, Enter Your Number: ");
        int num = input.nextInt();
        int reverse = reversed(num);
        System.out.println("Your Reversed number is: "+ reverse);

    }

    public static void greetings() {
        System.out.println("Welcome to Reversing the digit\n");
    }

    public static int reversed(int num) {

        int newNum = 0;
        while (num > 0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }

}
