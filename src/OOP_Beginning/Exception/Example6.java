package OOP_Beginning.Exception;

public class Example6 {

        public static void main(String[] args) {
            try {
                bolmeIslemi(10, 0);
            } catch (ArithmeticException e) {
                System.err.println("Hata yakalandı: " + e.getMessage());
            }
        }

        public static int bolmeIslemi(int pay, int payda) {
            if (payda == 0) {
                throw new RuntimeException("Payda sıfır olamaz");
            }
            return pay / payda;
        }
    }

