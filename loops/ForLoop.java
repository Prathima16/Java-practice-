import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        /*syntax
        for(initialization;condition;+/-){
        //body
        }*/

     1. //print 1-5 numbers
        for(int num=1;num<=5;num++){
            System.out.println(num);
        }

    2. //print 1 to n numbers

        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for (int num=1;num<=n;num++){
            System.out.println(num+" ");
        }
    }
}
