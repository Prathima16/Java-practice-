import java.util.Scanner;

public class SwitchExample1 {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
  1. //Fruits example
        String fruit=in.next();

        switch(fruit){
            case"Mango"->System.out.println("King of fruits");
            case"Apple"-> System.out.println("A Sweet red fruit");
            case"Orange"-> System.out.println("Round fruit");
            case"Grapes"->System.out.println("Small fruit");
            default->System.out.println("Please enter a valid fruit");
        }

   2. //Days example
      System.out.println("Enter the day:");
      int day=in.nextInt();
        switch(day){
            case 1->System.out.println("Monday");
            case 2-> System.out.println("Tuesday");
            case 3-> System.out.println("Wednesday");
            case 4->System.out.println("Thursday");
            case 5->System.out.println("Friday");
            case 6->System.out.println("Saturday");
            case 7->System.out.println("Sunday");
        }


    }
}
