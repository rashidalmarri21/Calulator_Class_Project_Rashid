public class Calculator {
    private final String userName;
    private double runningTotal;


    public Calculator(String getUserName){
        userName = getUserName;

    }

    public double getRunningTotal(){
        return runningTotal;
    }

    public double addTwoNumbers(double num1, double num2) {
        double sum = num1 + num2;
        runningTotal += sum;
        return sum;


    }
    public double subtractTwoNumbers(double num1, double num2) {
        double sum = num1 - num2;
        runningTotal += sum;
        return sum;

    }
    public double multiplyTwoNumbers(double num1, double num2) {
        double sum = num1 * num2;
        runningTotal += sum;
        return sum;
    }
    public double divideTwoNumbers(double num1, double num2) {
        double sum = num1 / num2;
        runningTotal += sum;
        return sum;


    }
    public boolean checkIsEven(int checkNum) {
        return checkNum % 2 == 0;

    }
    public String getCurrentStatus() {
        return userName + "'s running total is " + runningTotal;



    }





}
