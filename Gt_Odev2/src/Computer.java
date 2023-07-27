import java.util.Scanner;
public class Computer{
    Scanner input = new Scanner(System.in);
    private boolean onSituation = false;

    public boolean getOnSituation() {
        return onSituation;
    }

    public void setOnSituation(boolean onSituation) {
        this.onSituation = onSituation;
    }

    public void addController() {
        System.out.println("Computer cihazı seçildi");
    }
    public void playGame() {
        System.out.println("Oyun Başladı.");
    }
    public boolean open(){
        System.out.println("Computer sistemi açık");
        this.setOnSituation(true);
        return this.getOnSituation();
    }
    public boolean shutdown(){
        System.out.println("Computer sistemi kapatılıyor.");
        this.setOnSituation(false);
        return this.getOnSituation();
    }

    public void controlSystem(){
        this.addController();
        while(true){
            System.out.println("1 - Open the Computer.");
            System.out.println("2 - Close the Computer");
            System.out.println("3 - Cihazdan çıkış");
            System.out.print("Seçiminiz: ");
            int choiceSituation = input.nextInt();
            if (choiceSituation>=1 && choiceSituation<=3){
                if (choiceSituation == 1){
                    if (!this.getOnSituation()){
                        System.out.println("Computer açılıyor.");
                        this.open();
                        this.playGame();
                        continue;
                    }
                    else {
                        throw new RuntimeException("Cihaz zaten açık");
                    }
                } else if (choiceSituation == 2) {
                    if (this.getOnSituation()){
                        System.out.println("Computer kapatılıyor.");
                        this.shutdown();
                        continue;
                    }
                    else{
                        throw new RuntimeException("Computer zaten kapalı.");
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
