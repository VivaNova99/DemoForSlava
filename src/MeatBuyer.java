import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MeatBuyer {
    boolean buyMeat() throws IOException {
        System.out.println("ЗМ: Сколько килограмм мяса купить?");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int meat = Integer.parseInt(bufferedReader.readLine());
        System.out.println("ЗМ: Я поехал за мясом");
        System.out.println("ЗМ: Я купил " + meat + " килограмм(а) мяса");
        return true;
    }
}
