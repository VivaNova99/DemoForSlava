import java.util.Scanner;

public class FishBuyer {
    public boolean buyFish() {
        System.out.println("ЗР: Сколько килограмм рыбы нужно купить?");
        Scanner scanner = new Scanner(System.in);
        int fish = scanner.nextInt();
        System.out.println("ЗР: Я поехал за рыбой");
        System.out.println("ЗР: Я купил " + fish + " килограмм(а) рыбы");
        return true;
    }
}
