import java.util.Scanner;

public class Xbox implements IGameController{
    // Xbox sınıfı interface'den implement edildi.
    Scanner input = new Scanner(System.in);

    private boolean onSituation = false; // cihazın açıklık durumu false yani kapalı yapıldı.
    @Override
    public void addController(){ // addControler metodu oluşturuldu.
        System.out.println("Xbox cihazı seçildi");
    }

    @Override
    public void playGame() { //PlayGame metodu oluşturuldu.
        System.out.println("Oyun Başladı.");

    }
    public boolean open(){ // sistemi açan metod yazıldı.
        System.out.println("Xbox sistemi açık");
        this.setOnSituation(true);
        return this.getOnSituation();
    }
    public boolean shutdown(){ // sistemi kapatan metod yazıldı.
        System.out.println("Xbox sistemi kapatılıyor.");
        this.setOnSituation(false);
        return this.getOnSituation();
    }

    public void setOnSituation(boolean onSituation) { // getter ve setter metotları yazıldı.
        this.onSituation = onSituation;
    }

    public boolean getOnSituation() {
        return this.onSituation;
    }
    public void controlSystem(){ // bu metod kullanıcıya cihazlar hakkında ne yapmak istediğini soruyor.
        this.addController();    // eğer sistem açıksa tekrardan kullanıcı sistemi açamıyor ve cihaz zaten açık ya da
        while(true){            // cihaz zaten kapalıdır mesajları fırlatılıyor.
            System.out.println("1 - Open the XBOX.");
            System.out.println("2 - Close the XBOX");
            System.out.println("3 - Cihazdan çıkış");
            System.out.print("Seçiminiz: ");
            int choiceSituation = input.nextInt();
            if (choiceSituation>=1 && choiceSituation<=3){
                if (choiceSituation == 1){
                    if (!this.getOnSituation()){
                        System.out.println("Xbox açılıyor.");
                        this.open();
                        this.playGame();
                        continue;
                    }
                    else {
                        throw new RuntimeException("Cihaz zaten açık");
                    }
                } else if (choiceSituation == 2) {
                    if (this.getOnSituation()){
                        System.out.println("Xbox kapatılıyor.");
                        this.shutdown();
                        continue;
                    }
                    else{
                        throw new RuntimeException("Xbox zaten kapalı.");
                    }

                }
                else{
                    break;
                }

            }
            else{
                System.out.println("Hatalı seçim. Tekrar seçim yapınız.");
                continue;
            }

        }

    }
}
