import java.util.Arrays;

public class Task2_6 {
    public static void main(String[] args) {
        /*
        for (int i=2; i<=100;i+=2){
            System.out.println(i);
        }
        */

        for (int i=1; i<=100;i++){
            if (i%2!=0) continue;
            System.out.println(i);
        }
    }
}
