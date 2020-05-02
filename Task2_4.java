import java.util.Arrays;

public class Task2_4 {
    public static void main(String[] args) {
        System.out.println("произведение 2 и 6 равняется "+Task2_4.product(2,6));
        System.out.println("произведение 3 и 9 равняется "+Task2_4.product(3,9));
        System.out.println("произведение 0 и 5 равняется "+Task2_4.product(0,5));
        System.out.println("произведение 2 и 0 равняется "+Task2_4.product(2,0));
    }

    public static int product(int a, int b){
        int sum=a;
        if (b==0) sum=0;
        while (b-->1){
            sum+=a;
        }
        return sum;
    }
}
