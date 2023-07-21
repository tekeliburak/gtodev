public class SmartPhone extends Phone{
    // Phone sınıfı extends edilip SmartPhone sınıfı oluşturuldu ve nitelikler eklendi.
    String storage;
    String ram;
    String camera;

// default constructor oluşturuldu.
    public SmartPhone(){

    }
    // tüm nitelikleri barındıran constructor oluşturuldu.
    public SmartPhone(String id, String name, double price, String phoneNumber, String storage, String ram, String camera){
        this.id = id;
        this.name = name;
        this.price = price;
        this.phoneNumber = phoneNumber;
        this.storage = storage;
        this.ram = ram;
        this.camera = camera;
    }
}
