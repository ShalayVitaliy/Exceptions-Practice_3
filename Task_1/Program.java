package Task_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
// вместо этого, необходимо повторно запросить у пользователя ввод данных.


public class Program {
    public static void main(String[] args) throws IOException {
        boolean work = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        
        while(work){
            System.out.print("Введите дробное число: ");
            try {      
                float number = Float.parseFloat(reader.readLine());      
                System.out.printf("Введенное число равно %f\n", number);
                work = false;
                
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод. Введите дробное число!!!");
            }
    }
       

    }
}


