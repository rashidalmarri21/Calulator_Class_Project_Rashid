public class Main {

    public static void main(String[] args) {

        // Calling instance of the Calculator Class
        Calculator calculator = new Calculator("Rashid");

        // Generating two random numbers
        double num1 = Math.random();
        double num2 = Math.random();

        // Using method "addTwoNumbers" to add two random numbers
        double add = calculator.addTwoNumbers(num1 , num2);

        // Output for "addTwoNumbers" method
        System.out.println("Add Two Random Numbers");
        System.out.println(num1);
        System.out.println("+");
        System.out.println(num2);
        System.out.println("=");
        System.out.println(add);
        System.out.println();

        // Generating two "new" random numbers
        num1 = Math.random();
        num2 = Math.random();

        // Using method "subtractTwoNumbers" to subtract two random numbers.
        double sub = calculator.subtractTwoNumbers(num1 , num2);

        // Output for "subtractTwoNumbers" method
        System.out.println("Subtract Two Random Numbers");
        System.out.println(num1);
        System.out.println("-");
        System.out.println(num2);
        System.out.println("=");
        System.out.println(sub);
        System.out.println();

        // Generating two "new" random numbers
        num1 = Math.random();
        num2 = Math.random();

        // Using method "multiplyTwoNumbers" to multiply two random numbers.
        double multi = calculator.multiplyTwoNumbers(num1 , num2);

        // Output for "multiplyTwoNumbers" method
        System.out.println("Multiply Two Random Numbers");
        System.out.println(num1);
        System.out.println("*");
        System.out.println(num2);
        System.out.println("=");
        System.out.println(multi);
        System.out.println();

        // Generating two "new" random numbers
        num1 = Math.random();
        num2 = Math.random();

        // Using method "divideTwoNumbers" to divide two random numbers.
        double divide = calculator.divideTwoNumbers(num1 , num2);

        // Output for "divideTwoNumbers" method
        System.out.println("Divide Two Random Numbers");
        System.out.println(num1);
        System.out.println("/");
        System.out.println(num2);
        System.out.println("=");
        System.out.println(divide);
        System.out.println();

        // Declaring new variable intTotal to equal runningTotal multiplied by 10 to get an integer.
        int intTotal = (int) (calculator.getRunningTotal() * 10);

        // Running Total output
        System.out.println("Running Total:");

        // Using method "getCurrentStatus" to output the current user's running total.
        String currentStatus = calculator.getCurrentStatus();
        System.out.println(currentStatus);

       // Using method "checkIsEven" to check if the "intTotal" sum is even or odd then outputting the running total.
        boolean evenOrOdd = calculator.checkIsEven(intTotal);
        if(evenOrOdd) {
            System.out.println(calculator.getRunningTotal() + " is even");
        } else {
            System.out.println(calculator.getRunningTotal() + " is odd");
        }

    }

}
