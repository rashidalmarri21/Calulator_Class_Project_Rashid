public class Calculator {

    // Declaring userName and runningTotal variables.
    private final String userName;
    private double runningTotal;

    // Method for getUserName **Not sure what this does**
    public Calculator(String getUserName){
        userName = getUserName;

    }
    // Method for outputting the current running total of all the calculations up to that point.
    public double getRunningTotal(){
        return runningTotal;
    }

    //Method for adding two numbers (num1,num2) together then adding and replacing the running total with the "sum".
    public double addTwoNumbers(double num1, double num2) {
        double sum = num1 + num2;
        runningTotal += sum;
        return sum;
    }

    //Method for subtracting two numbers (num1,num2) together then adding and replacing the running total with the "sum"
    public double subtractTwoNumbers(double num1, double num2) {
        double sum = num1 - num2;
        runningTotal += sum;
        return sum;
    }

    //Method for multiplying two numbers (num1,num2) together then adding and replacing the running total with the "sum"
    public double multiplyTwoNumbers(double num1, double num2) {
        double sum = num1 * num2;
        runningTotal += sum;
        return sum;
    }

    //Method for dividing two numbers (num1,num2) together then adding and replacing the running total with the "sum".
    public double divideTwoNumbers(double num1, double num2) {
        double sum = num1 / num2;
        runningTotal += sum;
        return sum;
    }

    /* Method using boolean to check if a number (checkNum) is even or odd (true or false) by using mod to see if the
     number is divisible by 2 therefore is even.
     */
    public boolean checkIsEven(int checkNum) {
        return checkNum % 2 == 0;
    }

    // Method that takes current users name and displays their running total with it.
    public String getCurrentStatus() {
        return userName + "'s running total is " + runningTotal;
    }

}
