
public class FishDirector {
    void doFishPie(){
        System.out.println("ДР: Я позвал закупщика рыбы Ашота");
        FishBuyer ashot = new FishBuyer();
        System.out.println("ДР: И сказал ему купить рыбы");
        boolean haveFish = ashot.buyFish();

        System.out.println("ДР: Я позвал пекаря Машу");
        Baker masha = new Baker();
        System.out.println("ДР: И сказал ей печь пирожки с рыбой");
        boolean haveFishPie = masha.bakePie(haveFish,"рыба");

        System.out.println("ДР: Я закончил производство пирожков с рыбой");
    }
}
