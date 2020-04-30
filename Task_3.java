import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args) {
        int x= (int) (10-Math.random()*20);
        System.out.println("Число до манипуляций над ним: "+x);

        if (x>0) x+=1;
        else if (x<0) x-=2;
        else x=10;

        System.out.println("Число после: "+x);
    }
}
