package OOP_Beginning.Exception;



public class Example5 {

    public static void main(String[] args) {
        try {
            islemYap(-5);
        } catch (CustomException e) {
            System.err.println("Özel hata yakalandı: " + e.getMessage());
        }
    }

    public static void islemYap(int parametre) throws CustomException {
        if (parametre < 0) {
            throw new CustomException("Geçersiz parametre: " + parametre);
        }
        System.out.println("Parametre geçerlidir: " + parametre);
    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
