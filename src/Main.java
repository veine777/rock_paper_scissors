import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String [] choices ={"Камень","Ножницы","Бумага"};
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("Выберите вариант:");
            System.out.println("""
                1.Камень
                2.Ножницы
                3.Бумага
                4.Выход
                """);
            int playerChoice = scanner.nextInt() - 1;
            if (playerChoice == 3) {
                break;
            }
            int compChoice = random.nextInt(3);//Генерирует случайный индекс от 0 до размера массива
            System.out.println("Выбор игрока: " + choices[playerChoice] + "<->" + "Выбор компьютера: " + choices[compChoice]);

            if (playerChoice == compChoice) {
                System.out.println("Ничья");
            } else if (playerChoice == 0 && compChoice == 1 || playerChoice == 1 && compChoice == 2 || playerChoice == 2 && compChoice == 0) {
                System.out.println("Победил игрок");
            } else {
                System.out.println("Победил компьютер");
            }
        }

    }
}