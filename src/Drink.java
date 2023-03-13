/*Задача 1
Создать класс Food (еда). В классе должны быть:

Создать класс Drink (напиток) - наследника класса Food. В классе должны быть дополнительно:

метод "открыть", который:
для газированного напитка печатает "пшш",
для негазированного - "скр",
а для алкогольного сначала спрашивает возраст и издаёт звук, только если возраст больше 18.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Drink extends Food {
  public Drink(String foodName, String calories, boolean sparkling, boolean alcoholic) {
    super(foodName, calories);
    this.sparkling = sparkling;
    this.alcoholic = alcoholic;
  }

  public static final int AGE = 18;
  boolean sparkling;
  boolean alcoholic;

  public String open() throws IOException {
    if (!alcoholic) {
      if (sparkling) {
        return "пшш";
      } else {
        return "скр";
      }
    } else {
      return alcoholicOpen();
    }
  }

  public String alcoholicOpen() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Age: ");
    int age = Integer.parseInt(br.readLine());
    if (age > AGE) {
      return "э рон дон дон";
    } else {
      return "Приходите позже";
    }
  }

  public void setAlcoholic(boolean alcoholic) {
    this.alcoholic = alcoholic;
  }

  public void setSparkling(boolean sparkling) {
    this.sparkling = sparkling;
  }

  //чегото get на булианы не подкинуло
}
