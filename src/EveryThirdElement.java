import java.util.Scanner;

//3. Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
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