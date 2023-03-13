
public class Food {
  String foodName;
  String calories;


  public Food(String foodName, String calories) {
    this.foodName = foodName;
    this.calories = calories;

  }

  public String eatSmth() {
    return String.format("Вы употребили \"%s\" на \"%s\" калорий", foodName, calories);
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
