import java.util.Scanner;

public class NestedSwitch {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter employee Id:");
        int empId=in.nextInt();
        
        switch(empId){
           case 1-> System.out.println("Prathima");
           case 2-> System.out.println("Anu");
           case 3->{
               System.out.println("emp number 3");
               
               String department=in.next();
               switch(department){
                   case "Management"->System.out.println("Management department");
                   case "IT"->System.out.println("IT Department");
                   default->System.out.println("No department entered");
               }
           }
            default -> System.out.println("Enter correct empId");
        }
    }
}
