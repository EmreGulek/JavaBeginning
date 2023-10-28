package Calculator1;

import java.util.Scanner;

public class Test {
    private static Scanner in ;


    public static void main(String[] args) {
        in = new Scanner(System.in);

        CalculatorH1 calculator1 = new CalculatorH1(2);
        calculator1.addCalculation(new CosFunction());
        calculator1.addCalculation(new SinFunction());
        startCalculator(calculator1);


    }

    private static void startCalculator(CalculatorH1 calculator){
        calculator.listMathFunction();
        System.out.println("Please enter the name of the function:");
        String functionName = in.next();

        if(functionName.equalsIgnoreCase("end")) System.exit(0);
        System.out.println("Please enter the argument of the function:");
        double functionArg = in.nextDouble();
        double result = calculator.doCalculation(functionName, functionArg);
        System.out.println(functionName + " of " + functionArg + " is " + result + "\n");
        startCalculator(calculator);

    }

}
