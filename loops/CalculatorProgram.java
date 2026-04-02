import java.util.Scanner;

public class CalculatorProgram {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        // take the operator from user until user doesn't press x or X
          int ans=0;
        while (true){
            System.out.print("Enter the operator: ");
            //take the operator as input
            char op=in.next().trim().charAt(0);

            if(op=='+' || op=='-' || op=='*' || op=='/' || op=='%'){
                //input 2 no's
                System.out.println("Enter two numbers:");
                int num1=in.nextInt();
                int num2=in.nextInt();

                if(op=='+'){
                    ans= num1+num2;
                }

                if(op=='-'){
                    ans= num1-num2;
                }

                if(op=='*'){
                    ans= num1*num2;
                }

                if(op=='/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if(op=='%'){
                    ans=num1%num2;
                }
            } else if (op=='x' || op=='X') {
                break;
            }else{
                System.out.println("Invalid operator");
            }
            System.out.println(ans);
        }
    }
}

