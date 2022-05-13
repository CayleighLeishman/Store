
import java.util.Scanner; //allows us to get user input


public class hello { //class name matches title name
    
    public static void main(String[] args) { //I've learned after multiple attempts that this line is just as important as the class name.
    

    Scanner grocery = new Scanner(System.in); //puts question on screen
    System.out.print("What's in your grocery list? ");
    String groceryList = grocery.nextLine();  //it read the line of input and includes the space and separeators


    // String[] list = groceryList; 
    

    System.out.print("Your grocery list is: " + groceryList);
    
    
    }

}
