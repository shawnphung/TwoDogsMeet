package twodogsmeet;
import java.util.Scanner;

public class TwoDogsMeet {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    dog dog1 = new dog("Bowser", "German Shepherd");
    dog dog2 = new dog ("Meow Meow", "Husky");
    String choice;
    //some data for the dogs
    System.out.println(dog1.getName() + ": ");
    System.out.println("Aggression: " + dog1.getAggression());
    System.out.println("Hunger: " + dog1.getHunger());
    System.out.println("\n");
    //Prompts user with option to change dog1's aggression and hunger
    System.out.println("Would you like to change " + dog1.getName() + "'s aggression and hunger? \n"
      + "Enter YES to change \n"
      + "Enter NO to keep them");
    choice = input.nextLine();
    //Prompts user with stat changes
    if (choice.equals("YES")){
        System.out.println("Enter a value between 1 and 10 to set " + dog1.getName() + "'s aggression");
        dog1.setAggression (input.nextInt());
        System.out.println(dog1.getName() + "'s aggression set to " + dog1.getAggression());
        System.out.println("Enter a value between 1 and 10 to set " + dog1.getName() + "'s hunger");
        dog1.setHunger(input.nextInt());
        System.out.println(dog1.getName() + "'s hunger set to " + dog1.getHunger());
        System.out.println("________________________________________________");
    }else{
        //Keeps the stats the same
        dog1.setAggression(dog1.getAggression());
        dog1.setHunger(dog1.getHunger());
        System.out.println("Keeping " + dog1.getName() + "'s aggression and hunger the same");
        System.out.println("________________________________________________");
    }
    
    System.out.println(dog2.getName() + ": ");
    System.out.println("Aggression: " + dog2.getAggression());
    System.out.println("Hunger: " + dog2.getHunger());
    System.out.println("\n");
    //Prompts user with choice to change dog2's aggression and hunger
    System.out.println("Would you like to change " + dog2.getName() + "'s aggression and hunger? \n"
            + "Enter YES to change \n"
            + "Enter NO to keep them");
    choice = input.nextLine();
    if(choice.equals("YES")){
        System.out.println("Enter a value between 1 and 10 to set " + dog2.getName() + "'s aggression");
        dog2.setAggression (input.nextInt());
        System.out.println(dog2.getName() + "'s aggression set to " + dog2.getAggression());
        System.out.println("Enter a value between 1 and 10 to set " + dog2.getName() + "'s hunger");
        dog2.setHunger(input.nextInt());
        System.out.println(dog2.getName() + "'s hunger set to " + dog2.getHunger());
        System.out.println("_________________________________________________");
    }else{
        //Keeps the stats the same
        dog2.setAggression (dog2.getAggression());
        dog2.setHunger (dog2.getHunger());
        System.out.println("Keeping " + dog2.getName() + "'s aggression and hunger the same");
        System.out.println("________________________________________________");
    }

    //dog1 meets dog2
    if (dog1.getAggression() > 5) {
      //dog1 is aggressive
      System.out.print(dog1.getName() + ": ");
      dog1.barkAngry();
      //what if dog is cranky from hunger?
      if (dog1.getHunger() > 7) {
        System.out.println("Hungry dog bares teeth...");
        dog1.barkAngry();      }
    } else {
      //dog is friendly... so is the meeting
      System.out.print(dog1.getName() + ": ");
      dog1.barkFriendly();
    }
  //dog2 meets dog1
  if (dog2.getAggression() > 5) {
      //dog1 is aggressive
      System.out.print(dog2.getName() + ": ");
      dog2.barkAngry();
      //what if dog is cranky from hunger?
      if (dog2.getHunger() > 7) {
        System.out.println("Hungry dog bares teeth...");
        dog2.barkAngry();      }
    } else {
      //dog is friendly... so is the meeting
      System.out.print(dog2.getName() + ": ");
      dog2.barkFriendly();
    }
  }
  }

