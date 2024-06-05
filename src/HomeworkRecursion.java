import java.util.Arrays;

public class HomeworkRecursion {
    public static void main(String[] args) {
        String string = "10 39 21 6 73 10 25 67 11 39";
        String[] numbers = string.split(" ");
//        System.out.println(Arrays.toString(numbers));
        int result = Integer.parseInt(Arrays.toString(numbers));
        System.out.println(result);


    }



    public static int searchIndex(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {

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



        int start = 0;
        int finish = array.length - 1;


        while (start <= finish) {
            int median = (start + finish) / 2;
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

//1. Вводится не 10 чисел, а строка содержащая числа, записанные через пробелы
//2. Бинарный поиск обязательно должен быть реккурсивным