public class Main {
    public static void main(String[] args) {
        // PhoneApp sınıfından p1 nesnesi üretildi.
        PhoneApp p1 = new PhoneApp();

        //  p1 nesnesi kullanılarak toplam telefon fiyatı konsola bastırıldı.
        System.out.println("Toplam telefon fiyatları: " + (p1.calculateTotalPrice(p1.smartPhoneArray)) + " TL.");
    }
}
