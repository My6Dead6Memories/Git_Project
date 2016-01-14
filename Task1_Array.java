package Task;

import java.util.Random;

/**
 * Created by Александр on 08.01.2016.
 *                                              Задача:
 * В массиве А, состоящем из 20 элементов (сгенерированных случайным образом), подсчитать количество нулей.
 * Вывести количество нулей на экран.
 * <p/>
 * Получать случайные числа можно таким образом:
 * 1) Создать объект класса Random: Random random = new Random();
 * 2) Вызывать метод nextInt() у этого объекта и получать целые числа
 * так же как и там было twoD[i][j] = k;
 * то же самое и с рандомными числами A[i] = random.nextInt();
 */

public class Task1_Array {
    public static void main(String[] args) {
        int a[] = new int[20];
        Random random = new Random();
        int i;
        int b = 0;
        int c = 0;
        int d = 0;
        int min = 0;

        System.out.print("20 случайных элементов: ");
        for (i = 0; i < 20; i++) {                      //Вводим в массив
            a[i] = random.nextInt(10) - 5;              //случайные числа, с минимум: -5
            System.out.print(a[i] + " ");               //выводим и делаем отступ числа от числа

            if (a[i] == 0)
                b++;                //Определяем количество нулей
            else if (a[i] > 0)
                c++;                //Определяем количество положительных чисел
            else
                d++;                //определяем количество отрицательных чисел
        }
        System.out.println("\nКоличество нулей: " + b);
        System.out.println("Количество положительных: " + c);
        System.out.println("Количество отрицательных: " + d);

        for (int k : a)             //Ищем минимальный элемент. Перебираем цикл
            if (k < min) {          //сравниваем текущий элемент с минимальным (min = 0)
                min = k;            //меньшее значение записываем в min
            }
        System.out.println("Минимальное: " + min);
    }
}