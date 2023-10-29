package OOP_Beginning.Exception;

public class Example8 {

        public static void main(String[] args) {
            try {
                hesapBakiyesiniKontrolEt(-100);
            } catch (BakiyeNegatifException e) {
                System.err.println("Hata yakalandı: " + e.getMessage());
            }
        }

        public static void hesapBakiyesiniKontrolEt(int bakiye) throws BakiyeNegatifException {
            if (bakiye < 0) {
                throw new BakiyeNegatifException("Hesap bakiyesi negatif olamaz: " + bakiye);
            }
            System.out.println("Hesap bakiyesi: " + bakiye);
        }
    }

    class BakiyeNegatifException extends Exception {
        public BakiyeNegatifException(String message) {
            super(message);
        }
    }


