import java.util.Scanner;

//2.Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
public class HelloSlava {
    public void nameVerification() {
        Scanner scan = new Scanner(System.in);
//        while (true) {
        System.out.println("Введите имя: ");
        String input_name = scan.nextLine();
            if (input_name.equals("Вячеслав")) {
                System.out.println("Привет, Вячеслав");
//                break;
            } else {
                System.out.println("Нет такого имени");
            }
//        }
    }
}