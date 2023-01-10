import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        inputFloat();
    }

    public static float inputFloat() {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите дробное число (вида: 00,000): ");
        while (!in.hasNextFloat()) {
            System.out.print("Не верный ввод повторите попытку: ");
            in.next();
        }
        return in.nextFloat();
    }
}


