package mi;

import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

import mi.Product.Seasonality;

public class Writer {
  
  ArrayList<Product> produce = new ArrayList<Product>() ;

  public Writer() {
    
  }
  
  
  //Prints start of application, choose between admin and normal user 
  //No parameters, doesn't return anything
  public void loginScreen() {
    System.out.println("Are you logging in as a user? Please enter 'u', otherwise enter 'a' to login as an admin.");
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    if(input.equals("u")) {
      userStart();
    } else if (input.equals("a")) {
      adminStart();
    } else {
      loginScreen();
    }
  }
 
  //Prints the search by season
  //No parameters, doesn't return anything
  
  public void searchSeason() {
    System.out.println("Which season are you checking in? '1-12'");
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    switch(input) {
      case 1:
        System.out.println("None of the products currently are in season for January. We are expanding our data, soon there will be more. :)");
        break;
      case 2:
        System.out.println("None of the products currently are in season for Febuary. We are expanding our data, soon there will be more. :)");
        break;
      case 3:
        System.out.println("Products that are at their best during march: ");
        System.out.println("Avocados");
        break;
      case 4:
        System.out.println("Products that are at their best during april: ");
        System.out.println("Artichokes");
        System.out.println("Asparagus");
        break;
      case 5:
        System.out.println("None of the products currently are in season for May. We are expanding our data, soon there will be more. :)");
        break;
      case 6:
        System.out.println("Products that are at their best during June: ");
        System.out.println("Apricotes");
        break;
      case 7:
        System.out.println("Products that are at their best during July: ");
        System.out.println("Arugula");
        break;
      case 8:
        System.out.println("None of the products currently are in season for August. We are expanding our data, soon there will be more. :)");
        break;
      case 9:
        System.out.println("Products that are at their best during September: ");
        System.out.println("Pears");
        break;
      case 10:
        System.out.println("Products that are at their best during October: ");
        System.out.println("Apples");
        break;
      case 11:
        System.out.println("Products that are at their best during November: ");
        System.out.println("Bananas");
        break;
      case 12:
        System.out.println("None of the products currently are in season for August. We are expanding our data, soon there will be more. :)");
        break;
      default:
        userStart();
    }
    userStart();
  }
  
  //Prints list of products, let's you chose one and prints info
  //No parameters, doesn't return anything
  
  public void searchProduct() {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    switch(input) {
      case 1:
        System.out.println(produce.get(input-1).getName()+ " are best during " + produce.get(input-1).getMonth());
        break;
      case 2:
        System.out.println(produce.get(input-1).getName()+ " are best during " + produce.get(input-1).getMonth());
        break;
      case 3:
        System.out.println(produce.get(input-1).getName()+ " are best during " + produce.get(input-1).getMonth());
        break;
      case 4:
        System.out.println(produce.get(input-1).getName()+ " is best during " + produce.get(input-1).getMonth());
        break;
      case 5:
        System.out.println(produce.get(input-1).getName()+ " are best during " + produce.get(input-1).getMonth());
        break;
      case 6:
        System.out.println(produce.get(input-1).getName()+ " are best during " + produce.get(input-1).getMonth());
        break;
      case 7:
        System.out.println(produce.get(input-1).getName()+ " are best during " + produce.get(input-1).getMonth());
        break;
      case 8:
        System.out.println(produce.get(input-1).getName()+ " are best during " + produce.get(input-1).getMonth());
        break;
      default:
        userStart();
    }
    userStart();
  }
  
  //Prints users options for the application
  //No parameters, doesn't return anything
  
  public void userStart() {
    fillProduce();
    System.out.println("Are you checking for products 'p' or seasons 's'?");
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    if(input.equals("p")) {
    System.out.println("What Product would you like to check out today? '1-8' ");
    for(int i = 0; i < produce.size(); i++) {
      System.out.print(i + 1 + " ");
      System.out.println(produce.get(i).getName());
    }
    searchProduct();
    } else if (input.equals("s")) {
      searchSeason();
    } else {
      userStart();
    }
  }
  
  //Prints admins options for the application
  //No parameters, doesn't return anything
  
  public void adminStart() {
    System.out.println("Secret admin password? ;)");
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    if(input.equals("1234")) {
      System.out.println("Would you like to add products 'a'?");
      input = null;
      input = sc.nextLine();
      if(input.equals("a")) {
        addProduct();
      }
    }
  }
  
  //Creates new Product from adminview
  //No parameters, doesn't return anything adds new product to ArrayList "produce"
  
  public void addProduct() {
    System.out.println("What is the name and Season of the new Product?");
    System.out.println("Name: ");
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    Product p = new Product(null, null);
    p.setName(input);
    System.out.println("Season: ");
    input = null;
    input = sc.nextLine();
    switch(input) {
      case "January":
        p.setMonth(Seasonality.January);
        break;
      case "Febuary":
        p.setMonth(Seasonality.Febuary);
        break;
      case "March":
        p.setMonth(Seasonality.March);
        break;
      case "April":
        p.setMonth(Seasonality.April);
        break;
      case "May":
        p.setMonth(Seasonality.May);
        break;
      case "June":
        p.setMonth(Seasonality.June);
        break;
      case "July":
        p.setMonth(Seasonality.July);
        break;
      case "August":
        p.setMonth(Seasonality.August);
        break;
      case "September":
        p.setMonth(Seasonality.September);
        break;
      case "October":
        p.setMonth(Seasonality.October);
        break;
      case "November":
        p.setMonth(Seasonality.November);
        break;
      case "December":
        p.setMonth(Seasonality.December);
        break;
        default:
      addProduct();
    }
    produce.add(p);
    loginScreen();
  }
  
  //Fills ArrayList "produce" with Products
  //No parameters, doesn't return anything
  
  public void fillProduce() {
    produce.add(new Product("Apples", Seasonality.October));
    produce.add(new Product("Apricotes", Seasonality.June));
    produce.add(new Product("Artichokes", Seasonality.April));
    produce.add(new Product("Arugula", Seasonality.July));
    produce.add(new Product("Pears", Seasonality.September));
    produce.add(new Product("Asparagus", Seasonality.April));
    produce.add(new Product("Avocados", Seasonality.March));
    produce.add(new Product("Bananas", Seasonality.November));
  }
  
}
