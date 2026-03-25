public class CountNumbers {
    public static void main(String[] args) {

        //count number of 5's
        int n=4535599;
        int count=0;
        while (n>0){
            int rem=n%10;
            if(rem==5){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
