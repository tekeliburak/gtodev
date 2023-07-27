import java.util.Scanner;

public class Main { // main metodu programın çalıştırıldığı metottur.
    public static void main(String[] args) {
        boolean value = true;
        Xbox xbox = new Xbox();
        PlayStation ps = new PlayStation();
        Computer pc = new Computer();
        Scanner input = new Scanner(System.in);
        System.out.println("Oyun salonumuza hoş geldiniz.");
        while(value){
            System.out.println("1 - XBOX");
            System.out.println("2 - PlayStation");
            System.out.println("3 - Computer");
            System.out.println("4 - Çıkış");
            System.out.print("Oyunu oynamak istediğiniz cihazı seçiniz: ");
            int choice = input.nextInt();
            if (choice>=1 && choice<=4 ){
                switch (choice){
                    case 1:
                        xbox.controlSystem(); // oluşturulan metotlar çağrılıyor.
                    break;
                    case 2:
                        ps.controlSystem(); // oluşturulan metotlar çağrılıyor.
                        break;
                    case 3:
                        pc.controlSystem(); // oluşturulan metotlar çağrılıyor.
                        break;
                    case 4:
                        System.out.println("Sistemden çıkılıyor.");
                        value = false;
                        break;
                }
            }
            else{
                System.out.println("Hatalı seçim yaptınız. Tekrar seçiniz.");
                continue;
            }
        }
    }
}
