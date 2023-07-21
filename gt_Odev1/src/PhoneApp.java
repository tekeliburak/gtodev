public class PhoneApp {
    // phone sınıfı oluşturuldu ve SmartPhone sınıfından 5 nesne üretildi.
    SmartPhone s1 = new SmartPhone("001", "IPhone 14", 43899, "+905055555555", "128GB", "8GB", "32MP");
    SmartPhone s2 = new SmartPhone("002", "IPhone 11", 24599, "+905077777777", "128GB", "4GB", "12MP");
    SmartPhone s3 = new SmartPhone("003", "Galaxy S20 FE", 13698, "+905366666666", "256GB", "6GB", "12MP");
    SmartPhone s4 = new SmartPhone("004", "Galaxy S23", 30999, "+905388888888", "256GB", "8GB", "50MP");
    SmartPhone s5 = new SmartPhone("005", "Xiaomi 13 Pro", 41999, "+905433333333", "512GB", "12GB", "50MP");

    // Bu nesneler bir arraye atıldı.
    SmartPhone[] smartPhoneArray = {this.s1, this.s2, this.s3, this.s4, this.s5};

    // toplam telefon miktarını hafızada tutacak sum değişkeni oluşturuldu.
    double sum = 0.0;

    //calculateTotalPrice metodu ile bu telefon fiyatlarının toplamını veren metod olşturuldu.
    public double calculateTotalPrice(SmartPhone[] smartPhoneArray) {
        for (int i = 0; i < smartPhoneArray.length; i++) {
            sum = sum + smartPhoneArray[i].price;
        }
        return sum;

    }
}

