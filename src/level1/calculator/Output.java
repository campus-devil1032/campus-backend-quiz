package level1.calculator;

class Output {
    public void printResult(double result) {
        System.out.println((int)result);
    }

    public void resetMessage() {
        System.out.println("The calculator has been reset.");
    }

    public void invalidInputMessage() {
        System.out.println("Invalid input. Please enter a number or \"AC\" to reset the calculator.");
    }
}
