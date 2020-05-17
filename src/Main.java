import java.util.Random;
import java.util.Scanner;

public class Main {

    static Random random = new Random();

    public static void main(String[] args) {
        ygadaiNumber();
    }


    public static void ygadaiNumber() {

        Scanner scanner = new Scanner(System.in);
            do {
                int randomNumb = random.nextInt(10);
                    System.out.println("Угадайте число от 0 до 9. У Вас есть 3 попытки.");
            for (int i = 3; i > 0; i--) {
                    System.out.println("Введите ответ: (для выхода из игры, просто нажмите Enter)");
                int answerNumb = scanner.nextInt();
            if (answerNumb == randomNumb) {
                    System.out.println("Вы угадали число!");
                break;
        }
                    System.out.println(answerNumb > randomNumb ? "Введенное число больше " : "Введенное число меньше ");
                    System.out.println((i-1) > 0 ? " у вас осталось " + (i-1) + " попыток." : "Попытки закончились, вы проиграли.");
                    }
                    System.out.println("Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)");
                    }
                while (scanner.nextInt() == 1);
        }

        }
