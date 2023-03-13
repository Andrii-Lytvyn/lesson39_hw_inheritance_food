/*Задача 1
Создать класс Food (еда). В классе должны быть:

Создать класс Drink (напиток) - наследника класса Food. В классе должны быть дополнительно:

поле "газированный" (да/нет)
поле "алкогольный" (да/нет)
метод "открыть", который:
для газированного напитка печатает "пшш",
для негазированного - "скр",
а для алкогольного сначала спрашивает возраст и издаёт звук, только если возраст больше 18.*/
public class Food {
  String foodName;
  String calories;


  public Food(String foodName, String calories) {
    this.foodName = foodName;
    this.calories = calories;

  }

  public String eatSmth() {
    return  String.format("Вы употребили \"%s\" на \"%s\" калорий",foodName,calories);
  }


  public String getFoodName() {
    return foodName;
  }

  public String getCalories() {
    return calories;
  }

  public void setFoodName(String foodName) {
    this.foodName = foodName;
  }

  public void setCalories(String calories) {
    this.calories = calories;
  }
}
