import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


class GameHelper {
    public static String getUserInput(String prompt) {
        String inputLine = null;
        System.out.println(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in)
            );
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        } catch (IOException e) {
            System.out.println("IOException :" + e);
        }
        return inputLine;
    }
}


public class Task3_3 {
    public static void main(String[] args) {
        String answer;
        do {
            String valueLine=GameHelper.getUserInput("Введите верхнюю границу диапозона чисел, " +
                    "сумму квадратов которых мы будим считать:");
            System.out.println("Сумма квадратов задонного числового ряда равна - "+Task3_3.sumSquares(valueLine));
            answer =GameHelper.getUserInput("Желаете ли еще попытку (для продолжения наберите: Да) ?");
        } while (answer.equals("Да"));
    }

    public static int sumSquares(String valueLine) {
        int valueInt=Integer.parseInt(valueLine);
        int result=0;
        for (int i=1; i<=valueInt; result+=i*i, i++);
        return result;
    }
}


