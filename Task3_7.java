import java.util.Arrays;

public class Task3_7 {
    public static void main(String[] args) {
        System.out.println("Если взять ссуду под 20% на сумму 12000 - " +
                "то сумма долга привысит отметку в 58000 через "+Task3_7.perCent(12000,58000));
    }

    public static int perCent(int m, double s){
        int counter=0;
        for (double sum=m; sum<=s; sum+=0.2*m, counter++);
        return counter;
    }
}
