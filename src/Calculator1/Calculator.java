package Calculator1;

public interface  Calculator {

    public void addCalculation(MathFunction function); //Hangi işlemlerin olduğunu ekle.
    public void listMathFunction(); // Hangi işlemlere sahibim.

    public double doCalculation(String functionName , double arg );  //işlemimi yap.

}

