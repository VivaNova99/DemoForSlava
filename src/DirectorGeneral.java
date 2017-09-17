
public class DirectorGeneral {
    public static void main(String[] args) {

        System.out.println("ГД: Я позвал директора по мясу Марата");
        MeatDirector marat = new MeatDirector();
        System.out.println("ГД: И сказал ему - запусти производство пирогов с мясом");
        marat.doMeatPie();

        System.out.println("ГД: Я позвал директора по рыбе Филиппа");
        FishDirector filipp = new FishDirector();
        System.out.println("ГД: И сказал ему - запусти производство пирогов с рыбой");
        filipp.doFishPie();

        System.out.println("ГД: Все пирожки готовы");
    }
}
