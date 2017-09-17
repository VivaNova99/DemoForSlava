public class Baker {
    boolean bakePie(Boolean haveIngredient, String ingredient) {
        // Вместо if (haveIngredient == true) можно написать просто if (haveIngredient)
        // Правильно не (ingredient == "рыба"), а (Objects.equals(ingredient, "рыба")), но так пока проще
        if (haveIngredient == true){
            if (ingredient == "рыба") {
                System.out.println("П: Я испек пирожки с рыбой");
            }
            if (ingredient == "мясо") {
                System.out.println("П: Я испек пирожки с мясом");
            }

            return true;
        }

        else {
            System.out.println("Не из чего печь пирожки");
            return false;
        }

    }
}
