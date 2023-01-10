//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
import java.util.Scanner;

public class Task4 {
    public void CheckNullString(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку символов: ");
        String string = scanner.next();
        if (!string.isEmpty()) {
            throw new RuntimeException("Вы ввели пустую строку. Пустые строки вводить нельзя!");
        }
        System.out.println("Введенная строка: " + string);
    }
}
