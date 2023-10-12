import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        printMessage(name, age);
        getName(scanner);
        getAge(scanner);
        getNameAndAge(name, age);
        printWelcomeMessage(name);
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        double number = getNumber(scanner);
        double squareRoot = getSquareRoot(number);
        System.out.println("The Square root of" + number + " is " + squareRoot);
        int firstNumber = getFirstNumber(scanner);
        int secondNumber = getSecondNumber(scanner);
        boolean isGreaterThan = isGreaterThan(firstNumber, secondNumber);
        System.out.println(firstNumber + "is greater than" + secondNumber + ":" + isGreaterThan);

        if (age >= 18) {
            System.out.println("You are old enough to vote");
        } else {
            System.out.println("You are not old enough to vote");
        }
    }

    public static String getName(Scanner scanner) {
        System.out.println("Enter your name: ");
        return scanner.nextLine();
    }

    public static int getAge(Scanner scanner) {
        System.out.println("Enter your age: ");
        return scanner.nextInt();
    }

    public static void getNameAndAge(String name, int age) {
        System.out.println("Name:" + name);
        System.out.println("Age" + age);
    }

    public static void printVotingEligibility(int age) {
        if (age >= 18) {
            System.out.println("You are old enough to vote");
        } else {
            System.out.println("You are not old enough to vote");
        }
    }

    public static void printMessage(String name, int age) {
        System.out.println("Hello" + name + "You are " + age + " Years old.");
    }

    public static void printWelcomeMessage(String name) {
        switch (name.toLowerCase()) {
            case "alice":
                System.out.println("Welcome, Alice");
                break;
            case "bob":
                System.out.println("Welcome, Bob");
                break;
            case "default":
                System.out.println("Welcome, stranger!");
                break;
        }
    }

    public static void printDrinkEligibility(String name, int age) {
        if (name.equalsIgnoreCase("bob") && age >= 21) {
            System.out.println("You are eligible to drnik ");
        } else {
            System.out.println("You are not eligible to drink");
        }
    }

    public static double getNumber(Scanner scanner) {
        System.out.println("Enter a number ");
        return scanner.nextDouble();
    }

    public static double getSquareRoot(double number) {
        return Math.sqrt(number);
    }

    public static int getFirstNumber(Scanner scanner) {
        System.out.println("Enter first number:");
        return scanner.nextInt();
    }

    public static int getSecondNumber(Scanner scanner) {
        System.out.println("Enter second number:");
        return scanner.nextInt();
    }

    public static boolean isGreaterThan(int firstNumber, int secondNumber) {
        return firstNumber > secondNumber;
    }

}



