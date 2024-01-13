import java.util.Scanner;


//1.Составить алгоритм: если введенное число больше 7, то вывести “Привет”
public class Hello {
    public void outputHello() {
        System.out.println("Введите число: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if (number > 7) {
            System.out.println("Привет");

        }
    }
}

