import java.util.Arrays;

public class Task3_6 {
    public static void main(String[] args) {
        int money=(int) (Math.random()*100);
        int cost=(int) (Math.random()*10);
        System.out.println("Имея "+money+" р. и при стоимости одной порции в "+cost+" р." +
                " мальчик сможет купить "+Task3_6.boyBank(money,cost)[0]+" порций мороженого" +
                " , и при этом у него останется "+Task3_6.boyBank(money,cost)[1]+" р.");
    }

    public static int[] boyBank(int m, int k){
        //result[0] - колличетво порций мороженного;
        //result[1] - оставшиеся деньги.

        int[] result={0,m};
        while (result[1]>=k){
            result[1]-=k;
            result[0]++;
        }
        return result;
    }
}
