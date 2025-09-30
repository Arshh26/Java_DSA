import java.util.Scanner;

public class NestedSwitchCases {
    public static void main(String[] args) {
        System.out.println("Welcome to Nested Switch cases\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Please, Enter Your employee Id: ");
        int num = input.nextInt();
        System.out.println("Now Enter Your Department: ");
        String department = input.next();

        switch(num) {
            case 1:
                System.out.println("Arshad");
                break;
            case 2:
                System.out.println("Abrar");
                break;
            case 3:
                System.out.println("Nishat");
                break;
            default:
                System.out.println("Employee Id not found");

                switch (department) {
                    case "Technical":
                        System.out.println("Technical Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("Department not found");
                }
                break;

        }

    }
}
