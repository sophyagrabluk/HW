import java.util.Arrays;
import java.util.Scanner;

public class HW_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     //Массив заполняется рандомными числами
     double[] arrayrandom = new double[scanner.nextInt()];
        for (int i = 0; i < arrayrandom.length; i++) {
            arrayrandom[i] = Math.random();
            System.out.println(arrayrandom[i]);
        }

        // Массив заполняется пользователем вручную
        System.out.println("Введите размер массива:" + " ");
        int[] array = new int[scanner.nextInt()];
        System.out.println("Введите значение в каждый элемент:" + " ");
        for (int j = 0; j < array.length; j++) {
            array[j] = scanner.nextInt();
        }

        // 1. Все элементы в прямом порядке.
        for (int any : array) {
            System.out.println(any);
            }
            // или
            System.out.println(Arrays.toString(array));

        // 1. Все элементы в обратном порядке
        for (int vv = array.length - 1; vv >= 0; vv--) {
            System.out.println(array[vv]);
        }

        // 2. Найти минимальный-максимальный элементы и вывести
        // максимальный
        int maxValue = array[0];
        for (int max = 0; max < array.length; max ++) {
            if (array[max] > maxValue) {
                maxValue = array[max];
            }
        }
                System.out.println(maxValue);
        // минимальный
        int minValue = array[0];
        for (int min = 0; min < array.length; min ++) {
            if (array [min] < minValue) {
                minValue = array[min];
            }
        }
        System.out.println(minValue);

        // 3. Найти индекс минимального-максимального элементов и вывести
        // максимальный
        int m = array[0];
        int indexMax = 0;
        for (int max = 0; max < array.length; max ++) {
            if (array[max] > m) {
                m = array[max];
                indexMax = max;
            }
        }
        System.out.println(indexMax);

        // минимальный
        int n = array[0];
        int indexMin = 0;
        for (int min = 0; min < array.length; min ++) {
            if (array [min] < n) {
                n = array[min];
                indexMin = min;
            }
        }
        System.out.println(indexMin);

        // 4. Найти и вывести количество нулевых элементов.
        // Если нулевых элементов нет - вывести сообщение, что их нет
        int zero = 0;
        for (int z = 0; z < array.length; z++)
            if (array[z] == 0) {
                zero++;}
                System.out.println(zero);
                if (zero == 0) {
            System.out.println("Нулевых элементов нет"); // как убрать "0" в консоли
        }

        // 5. Пройти по массиву и поменять местами первый и последний, второй и предпоследний и т.д.
        for (int a = 0, b = array.length - 1; a < array.length / 2 && b / 2 >= 0; a++, b--)
        {
            int vice = array[a];
            array[a] = array[b];
            array[b] = vice;
        }
        System.out.println(Arrays.toString(array));

        // 6. Проверить, является ли массив возрастающей последовательностью
        // (каждое следующее число больше предыдущего)

    }
}
