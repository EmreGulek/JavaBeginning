package OOP_Beginning.Exception;

public class Example7 {

        public static void main(String[] args) {
            try {
                kullaniciYasiniKontrolEt(-5);
            } catch (IllegalArgumentException e) {
                System.err.println("Hata yakalandı: " + e.getMessage());
            }
        }

        public static void kullaniciYasiniKontrolEt(int yas) {
            if (yas < 0) {
                throw new IllegalArgumentException("Geçersiz yaş: " + yas);
            }
            System.out.println("Kullanıcı yaşınız: " + yas);
        }
    }


