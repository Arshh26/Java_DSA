import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {
        System.out.println("Welcomr to Switch cases\n");
        Scanner input = new Scanner(System.in);
//        System.out.println("Please, Enter Your Fruit name: ");
//        String fruit = input.next();
//        System.out.println("Please, Enter Weekday Number: ");
//        int num = input.nextInt();
        System.out.println("Please, Enter the day: ");
        String weekName = input.next();



//        switch (fruit) {
//            case "Mango":
//                System.out.println("Red color Mango");
//                break;
//            case "orange":
//                System.out.println("Orange color orange");
//                break;
//            case "grapes":
//                System.out.println("small grapes");
//            default:
//                System.out.println("Please, enter a valid fruit name");
//        }
//        switch (num) {
//            case 1 -> System.out.println("it's Monday");
//            case 2 -> System.out.println("it's tuesday");
//            case 3 -> System.out.println("it's wednesday");
//            case 4 -> System.out.println("it's thursday");
//            case 5 -> System.out.println("it's friday");
//            case 6 -> System.out.println("it's saturday");
//            case 7 -> System.out.println("it's sunday");
//            default -> System.out.println("only seven days in a week ");
//        }

        switch (weekName) {
            case "Monday" :
            case "Tuesday" :
            case "Wednesday" :
            case "Thursday" :
            case "Friday" :
                System.out.println("it's Week Day");
                break;
            case "Saturday" :
            case "Sunday" :
                System.out.println("it's Weekend Day");
                break;






        }
    }
}
