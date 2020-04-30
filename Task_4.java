import java.util.Arrays;

public class Task_4 {
    public static void main(String[] args) {
        int[] intArray=new int[3];
        System.out.print("Имеем набор чисел: ");
        for (int i=0; i<3; i++)
        {
            intArray[i]=(int) (10-Math.random()*20);
            System.out.print(intArray[i]+" ");
        }

        int result=Task_4.find(intArray);
        System.out.println("\nВ этом наборе содержится "+result+" положительных чисел");
    }

    public static int find(int[] someArray){
        int counter=0;
        for (int x=0; x<someArray.length; x++){
            if (someArray[x]>0) counter++;
        }
        return counter;
    }
}
