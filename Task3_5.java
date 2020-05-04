import java.util.Arrays;

public class Task3_5 {
    public static void main(String[] args) {
        int number=(int) (Math.random()*100);
        System.out.println("Колличество натуральных чисел не делящихся" +
                "на цело на 2, 3, 5 до "+number+" равняется: "+Task3_5.counter(number));
    }

    public static int counter(int number){
        int counter=0;
        for (int i=1; i<=number; i++){
            if (i%2==0) continue;
            else if (i%3==0) continue;
            else if (i%5==0) continue;
            counter++;
        }
        return counter;
    }
}
