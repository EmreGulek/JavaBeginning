package Calculator1;

public class CalculatorH1 implements Calculator {
    private int functionCount; // Hesap makinemde kaç işlem yer alıcak.
    private int currentCount = 0; ///////

    private MathFunction[] functions; // Hesap makinemde içinde işlemleri içeren dizi.
    private double argument; // Kullanıcıdan işlem yapmak için istediğim sayı.

    public CalculatorH1(int functionCount) {
        this.functionCount = functionCount;
        functions = new MathFunction[functionCount];

    }

    @Override
    public void addCalculation(MathFunction function) {
        functions[currentCount] = function; //
       // Aslında burda
        // MathFunction function = new SinFunction() oluşturdum.
        // bu function u da funcitons[0] a eleman olarak verdim.
        // funcitons[0] = function;
        currentCount++;
    }

    @Override
    public double doCalculation(String functionName, double arg) {
        double result = 0.0;
        boolean isFunctionFound=false;
        for (MathFunction function : functions) {
            if (functionName.equalsIgnoreCase(function.getName())) {
                result = function.calculate(arg);
                isFunctionFound = true;
            }
        }
        if (!isFunctionFound) System.out.println("No such function found!");
        return result;
    }


    @Override
    public void listMathFunction() {
        System.out.println("Avaiable Functions : ");
        for (MathFunction function : functions) {
            System.out.println(function.getName());
        }
    }


}
