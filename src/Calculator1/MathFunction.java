package Calculator1;

public interface MathFunction {
    public String getName();
    public double calculate(double arg);
}

 class SinFunction implements MathFunction{
    private String name = "Sin";
    public String getName(){
        return name;
    }

    @Override
    public double calculate(double arg) {
        return Math.sin(arg);
    }

}

 class CosFunction implements MathFunction{
    private String name = "Cos";
    public String getName(){
        return name;
    }

    @Override
    public double calculate(double arg) {
        return Math.cos(arg);
    }
}


class LogFunction implements MathFunction{
    private String name="Log";
    public String getName(){
        return name;
    }
    @Override
    public double calculate(double arg) {
        return Math.log(arg);
    }
}
