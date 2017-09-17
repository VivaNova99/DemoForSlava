
public class MeatDirector {

    void doMeatPie(){
        System.out.println("ДМ: Я позвал закупщика мяса Кирилла");
        MeatBuyer kirill = new MeatBuyer();
        System.out.println("ДМ: И сказал ему купить мяса");
        boolean haveMeat = kirill.buyMeat();

        System.out.println("ДМ: Я позвал пекаря Максима");
        Baker maxim = new Baker();
        System.out.println("ДМ: И сказал ему печь пирожки с мясом");
        boolean haveMeatPie = maxim.bakePie(haveMeat,"мясо");

        System.out.println("ДМ: Я закончил производство пирожков с мясом");
    }

}
