package Task_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Введите что-либо: ");
            String string = reader.readLine();
            if (string.equals(""))
                throw new RuntimeException("Пустая строка. Ошибка!");
            System.out.println(string);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
