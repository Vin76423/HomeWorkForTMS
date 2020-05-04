import java.util.Arrays;

public class Task3_2 {
    public static void main(String[] args) {
        System.out.println("Если положить в сберкассу на 3-ех процентный " +
                "вклад 5р. на 14 лет, по итогу получим: "+Task3_2.function(5,14)+" р.");
        System.out.println("Если 7р. на 12 лет: "+Task3_2.function(7,12)+" р.");
    }

    public static double function(int S, int N){
        double result=S;
        for (int x=0; x<N; result+=0.03*S, x++);
        return result;
    }
}
