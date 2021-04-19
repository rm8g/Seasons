package mi;

import java.util.ArrayList;

public class Product {

  private String name;
  private ArrayList produce;
  public enum Seasonality {
    January,
    Febuary,
    March,
    April,
    May,
    June,
    July,
    August,
    September,
    October,
    November,
    December
  }
  
  private Seasonality month;
  
  public Product(String name, Seasonality month) {
    super();
    this.name = name;
    this.month = month;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Seasonality getMonth() {
    return month;
  }

  public void setMonth(Seasonality month) {
    this.month = month;
  }
  

  
}
