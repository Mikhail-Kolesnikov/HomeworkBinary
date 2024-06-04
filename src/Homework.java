import java.util.Arrays;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        int[] array = new int[10];
        int result = searchNumber(array,11);
        System.out.println(result);

    }


    public static int searchNumber(int[] array, int n) {

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            boolean sort = false;
            for (int j = 0; j < array.length - 1; j++) {
                int buffer;
                if (array[j] > array[j + 1]) {
                    buffer = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buffer;
                    sort = true;
                }
            }

            if (!sort) {
                break;
            }
        }
        System.out.println(Arrays.toString(array));


        int number = scanner.nextInt();
        int start = 0;
        int finish = array.length - 1;
        int median = (start + finish) / 2;
        while (start <= finish) {
            if (array[median] == number) {
                return median;
            }
            if (array[median] > number) {
                finish = median - 1;

            }
            if (array[median] < number) {
                start = median + 1;
            }
        }
        return -1;
    }
}

//1.Пользователь вводит в консоль 10 чисел.
//2.Соберите их в массив и отсортируйте (любым способом, кроме заложенных в джава)
//3. Бинарным поиском найдите число в этом массиве, которое пользователь введет 11ым. Выведите его индекс на экран

//1. Пользователь вводит два числа - начальное и конечное число.
//2. Выведите на экран все числа в этом промежутке, НО решите задание обязательно через реккурсию