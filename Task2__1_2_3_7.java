import java.util.Arrays;

public class Task2__1_2_3_7 {
    public static void main(String[] args) {
        //Task2_1
        double counter1=0.0;
        double j=10.0;
        for (int i=0; i<7; i++, counter1+=j, j*=1.1);
        System.out.println(counter1);

        //Task2_2
        int counter2=1;
        for (int i=0; i<24; i+=3, counter2*=2);
        System.out.println(counter2);

        //Task2_3
        int counter3=1;
        for (int i=1; i<256; i*=2, counter3+=i);
        System.out.println(counter3);

        //Task2_7
        int counter4=1;
        for (int i=1; i<99; i+=2, counter4+=i);
        System.out.println(counter4);
    }
}
