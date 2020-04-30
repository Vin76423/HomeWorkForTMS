import java.util.Arrays;

public class Task_7 {
    public static void main(String[] args) {
        int order=(int) (1+Math.random()*10);
        double value=Math.random();
        int number=(int) (value * Math.pow(10,order));

        System.out.println(number+" программист"+Task_7.ending(number));
    }

    public static int length(int number){
        int counter=0;
        do {
            counter++;
            number/=10;
        }while (number>0);
        return  counter;
    }

    public static String ending(int number){
        while (Task_7.length(number)>1){
            int x=Task_7.length(number);
            int a=(int) Math.pow(10,(x-1));
            number=number-a*(number/a);
        }

        String answer;
        if (number==1){
            answer="";
        }else if (number==2||number==3||number==4){
            answer="а";
        }else {
            answer="ов";
        }

        return answer;
    }
}
