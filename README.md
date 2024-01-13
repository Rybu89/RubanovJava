//запуск программы

    public class ExecutionStarter {
        public static void main(String[] args) {
            Hello Task1 = new Hello();
            HelloSlava Task2 = new HelloSlava();
            EveryThirdElement Task3 = new EveryThirdElement();
            Task1.outputHello();
            Task2.nameVerification();
            Task3.outputEveryThirdElement();
        }
    }

//Задание1.Составить алгоритм: если введенное число больше 7, то вывести “Привет”

    public class Hello {
        public void outputHello() {
            System.out.println("Введите число: ");
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();
            if (number > 7) {
                System.out.println("Привет");
    
            }
        }

//Задание2.Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"

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
    
//Задание3. Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
    
    public class EveryThirdElement {
        public void outputEveryThirdElement() {
            //int [] test_arr = {5, 3, 5, 3, 4, 4, 3, 2, 5, 4};
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите размер массива: ");
            int size = scan.nextInt();
            int[] arr = new int[size];
            System.out.println("Введите элементы массива: ");
            for (int i = 0; i < size; i++) {
                arr[i] = scan.nextInt();}
            System.out.println("Вывод элементов кратных 3: ");
            for (int i = 0; i < size; i++) {
                if (arr[i] % 3 == 0) {
                    System.out.println(arr[i]);
                }
            }
        }
    }

Задание 4.Дана скобочная последовательность: [((())()(())]]
- Можно ли считать эту последовательность правильной?
- Если ответ на предыдущий вопрос “нет”, то что необходимо в ней изменить, чтоб она стала правильной?

Ответ:
Данная последовательнасть не верная т.к. присутствуют скобки без пары (не закрытые скобки).
Для того чтобы последовательность скобок стала верной небходимы пары, сделать это можно двумя способами
1. Изменить одну скобку с квадратной на круглую: [((())()(()))]
2. Добавить недостоющие открывающие и закрывающие скобки: [[((())()(()))]]
В первом способе сохраняется длина последовательности.

