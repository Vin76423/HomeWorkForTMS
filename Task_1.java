import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {
        int order=(int) (1+Math.random()*10);
        double value=1-Math.random()*2;
        int number=(int) (value * Math.pow(10,order));
        System.out.println("Исходное число: "+number);

        if (number>0) {
            System.out.println("Имеем положительное, "+Task_1.length(number)+"-значное число");
        } else  if (number<0) {
            System.out.println("Имеем отрицательное, "+Task_1.length(number)+"-значное число");
        } else  System.out.println("Нам ,черт побери, попался 0");
    }

    public static int length(int number){
        if (number<0) number=-number;

        int counter=0;
        do {
            counter++;
            number/=10;
        }while (number>0);
        return  counter;
    }
}
