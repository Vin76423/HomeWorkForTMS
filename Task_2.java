import java.util.Arrays;

public class Task_2 {
    public static void main(String[] args) {
        int a,b,c;

        a=(int) (Math.random()*10);
        b=(int) (Math.random()*10);
        c=(int) (Math.random()*10);
        System.out.println("Имеем величины сторон предпологаемого треугольника: "+a+" "+b+" "+c);

        if (a+b>c && a+c>b && b+c>a) System.out.println("Да, такой треугольник может существовать");
        else System.out.println("Это не может являться треугольником");
    }
}
