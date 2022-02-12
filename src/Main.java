public class Main {

    public static void main(String[] args) {
        double num1 = Math.random();
        double num2 = Math.random();

        Calculator calculator = new Calculator("Rashid");
        double add = calculator.addTwoNumbers(num1 , num2);
        System.out.println("Add Two Random Numbers");
        System.out.println(num1);
        System.out.println("+");
        System.out.println(num2);
        System.out.println("=");
        System.out.println(add);
        System.out.println();


        num1 = Math.random();
        num2 = Math.random();


        double sub = calculator.subtractTwoNumbers(num1 , num2);
        System.out.println("Subtract Two Random Numbers");
        System.out.println(num1);
        System.out.println("-");
        System.out.println(num2);
        System.out.println("=");
        System.out.println(sub);
        System.out.println();


        num1 = Math.random();
        num2 = Math.random();


        double multi = calculator.multiplyTwoNumbers(num1 , num2);
        System.out.println("Multiply Two Random Numbers");
        System.out.println(num1);
        System.out.println("*");
        System.out.println(num2);
        System.out.println("=");
        System.out.println(multi);
        System.out.println();

        num1 = Math.random();
        num2 = Math.random();


        double divide = calculator.divideTwoNumbers(num1 , num2);
        System.out.println("Divide Two Random Numbers");
        System.out.println(num1);
        System.out.println("/");
        System.out.println(num2);
        System.out.println("=");
        System.out.println(divide);
        System.out.println();

        int intTotal = (int) (calculator.getRunningTotal() * 10);

        System.out.println("Running Total:");

        String currentStatus = calculator.getCurrentStatus();
        System.out.println(currentStatus);

        boolean evenOrOdd = calculator.checkIsEven(intTotal);
        if(evenOrOdd) {
            System.out.println(calculator.getRunningTotal() + " is even");
        } else {
            System.out.println(calculator.getRunningTotal() + " is odd");
        }











    }

}
