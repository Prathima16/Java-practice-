public class FunctionsExample {

        /*syntax
        returnType methodName(parameters){
        //method body

        ex: int add(int a, int b){
        return a+b;
        }

        1.method with return value

        int square(int x){
        return x*x;
        }

        2.void method(no return)

        void greet(){
        s.o.p("Hello");
        }
         */

        //Method with Parameters and Return
        static int multiply(int a, int b){
            return a * b;
    }

    public static void main(String[] args) {
        int result = multiply(3,4);
        System.out.println(result);
    }

}
