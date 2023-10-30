import java.util.*;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    this.name = name; 
    this.earnings = 0; 
    itemList = new ArrayList(); 
    storeList.add(this); 
  }
  
  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    if (index > itemList.size() || index < 0) {
        System.out.println("Invalid index. There are only " + itemList.size() + " items in the store.");
    } 
    else {
        this.earnings += itemList.get(index).getCost(); 
        System.out.println(itemList.get(index).getName() + " was sold for " + itemList.get(index).getCost()); 
    }
  }
  public void sellItem(String name){
    boolean inArray = false; 
    for (Item i : itemList) {
        if (name.equals(i.getName())) {
            earnings += i.getCost();
            inArray = true; 
        }
    }
    if (!inArray) {
        System.out.println(this.getName() + " does not sell " + name); 
    }
    else {
        System.out.println(name + " was sold."); 
    }
  }
  public void sellItem(Item i){
    if (itemList.contains(i)) {
        earnings += i.getCost(); 
        System.out.println(i.getName() + " was sold."); 
    }
    else {
        System.out.println(this.getName() + " does not sell " + i.getName()); 
    }
  }
  
  public void addItem(Item i){
    this.itemList.add(i); 
  }
  public void filterType(String type){
    System.out.println("filterType was used. Items with type " + type + " are: "); 
    for (Item i : itemList) {
        if (i.getType().equals(type)) {
            System.out.println(i.getName()); 
        }
    }
    System.out.println(); 
  }
  public void filterCheap(double maxCost){
    System.out.println("filterCheap was used. Items cheaper than " + maxCost + " are: "); 
    for (Item i : itemList) {
        if (i.getCost() <= maxCost) {
            System.out.println(i.getName() + " with cost of " + i.getCost()); 
        }
    }
    System.out.println(); 
  }
  public void filterExpensive(double minCost){
    System.out.println("filterExpensive was used. Items more expensive than " + minCost + " are: "); 
    
    for (Item i : itemList) {
        if (i.getCost() >= minCost) {
            System.out.println(i.getName() + " with cost of " + i.getCost()); 
        }
    }
    System.out.println(); 
  }
  public static void printStats(){
    System.out.println("----- STORE STATS -----"); 
    for (Store i : storeList) {
        System.out.print("Store "); 
        System.out.print(i.getName()); 
        System.out.print(" had earnings of: "); 
        System.out.println(i.getEarnings()); 
    }
    System.out.println(); 
  }
}
