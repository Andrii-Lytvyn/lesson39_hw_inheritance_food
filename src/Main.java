import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    Food food = new Food("Жаба", "800");
    System.out.println(food.eatSmth());
    System.out.println();

    Drink drink = new Drink("Кола ", "100", true, false);
    System.out.println(drink.open());
    System.out.println();

    Drink drink2 = new Drink("Kompot", "300", false, false);
    System.out.println(drink2.open());
    System.out.println();


    Drink drink3 = new Drink("Beer", "300", false, true);
    System.out.println(drink3.open());
    System.out.println();

  }
}