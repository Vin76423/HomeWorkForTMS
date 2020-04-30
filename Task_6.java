import java.util.Arrays;

public class Task_6 {
    public static void main(String[] args) {
        int order1 = (int) (1 + Math.random() * 10);
        double value1 = Math.random();
        int number1 = (int) (value1 * Math.pow(10, order1));

        int order2 = (int) (1 + Math.random() * 10);
        double value2 = Math.random();
        int number2 = (int) (value2 * Math.pow(10, order2));

        System.out.println("Есть два числа: "+number1+" и "+number2);

        if (number1>number2) {
            System.out.println("Число "+number1+" - больше");
        } else  if (number2>number1) {
            System.out.println("Число "+number2+" - больше");
        } else {
            System.out.println("Число "+number1+" ровняется числу "+number2);
        }
    }
}
