import java.util.Scanner;

public class PlayStation implements IGameController{
    Scanner input = new Scanner(System.in);
    private boolean onSituation = false;
    @Override
    public void addController() {
        System.out.println("Playstation cihazı seçildi");
    }

    @Override
    public void playGame() {
        System.out.println("Oyun Başladı.");
    }
    public boolean open(){
        System.out.println("PlayStation sistemi açık");
        this.setOnSituation(true);
        return this.getOnSituation();
    }
    public boolean shutdown(){
        System.out.println("PlayStation sistemi kapatılıyor.");
        this.setOnSituation(false);
        return this.getOnSituation();
    }
    public void setOnSituation(boolean onSituation) {
        this.onSituation = onSituation;
    }
    public boolean getOnSituation() {
        return onSituation;
    }
    public void controlSystem(){
        this.addController();
        while(true){
            System.out.println("1 - Open the PlayStation.");
            System.out.println("2 - Close the PlayStation");
            System.out.println("3 - Cihazdan çıkış");
            System.out.print("Seçiminiz: ");
            int choiceSituation = input.nextInt();
            if (choiceSituation>=1 && choiceSituation<=3){
                if (choiceSituation == 1){
                    if (!this.getOnSituation()){
                        System.out.println("PlayStation açılıyor.");
                        this.open();
                        this.playGame();
                        continue;
                    }
                    else {
                        throw new RuntimeException("Cihaz zaten açık");
                    }
                } else if (choiceSituation == 2) {
                    if (this.getOnSituation()){
                        System.out.println("PlayStation kapatılıyor.");
                        this.shutdown();
                        continue;
                    }
                    else{
                        throw new RuntimeException("PlayStation zaten kapalı.");
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
