public class Task_5 {
    public static void main(String[] args) {
        int[] intArray=new int[3];
        System.out.print("Имеем набор чисел: ");
        int i;
        for (i=0; i<3; i++)
        {
            intArray[i]=(int) (10-Math.random()*20);
            System.out.print(intArray[i]+" ");
        }

        int resultPositive=0;
        int resultNegative=0;

        while (i-->0){
            if (intArray[i]>0) resultPositive++;
            else if (intArray[i]<0) resultNegative++;
        }

        System.out.println("\nВ этом наборе содержится "+resultPositive+" положительных чисел; и "
                +resultNegative+" - отрицательных");
    }
}
