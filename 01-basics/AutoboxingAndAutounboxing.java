package basics;

/* 1.public class AutoboxingAndAutounboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int x1=20;
      Integer x2=x1;//auto-boxing
      int x3=x2;//auto-unboxing
      
      System.out.println(x1);
      System.out.println(x2);
      System.out.println(x3);
      
	}

}*/

//2.
public class AutoboxingAndAutounboxing{

    public static void main(String[] args) {

        // Autoboxing (primitive → object)
        int num = 100;
        Integer obj = num;

        System.out.println("Primitive value: " + num);
        System.out.println("Wrapper object: " + obj);

        // Unboxing (object → primitive)
        Integer number = 200;
        int value = number;

        System.out.println("Wrapper value: " + number);
        System.out.println("Primitive value: " + value);

    }
}
