import java.util.Arrays;

public class Task3_4 {
    public static void main(String[] args) {
        System.out.println("Бригада из 5-и сенокосилок, перввая проработала 1 час. " +
                "Вся бригада работала: "+Task3_4.publicCounter(5,1)+" часов");

        System.out.println("Бригада из 3-и сенокосилок, перввая проработала 3 час. " +
                "Вся бригада работала: "+Task3_4.publicCounter(3,3)+" часов");

    }

    public static double publicCounter(int N, int m) {
        int resultMinutes=0;
        for (int i=0, j=m*60 ; i<N; resultMinutes+=j, j+=10, i++);
        double resultHours=resultMinutes/60.0;
        return resultHours;
    }
}
