package Task;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Александр on 09.01.2016.
 * Задача
 * Дартс
 * Есть цель, у которой размеры Y (-10; 10) и Х (-10, 10). У цели есть центр с размерами Y (-1; 1) и Х (-1, 1).
 * Сделайте бросок и определите координаты попадания дротика. Может Вы попали в центр?
 */
public class Task2_Darts {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        int point = 0;

        int yVert = random.nextInt(30) - 15;
        int xGor = random.nextInt(30) - 15;

        System.out.println("Введите 1, чтобы сделать бросок в мишень: ");
        int vvod = scan.nextInt();
        scan.close();

        if (vvod == 1) {
            if (yVert == -1 && xGor == -1) {
                System.out.println("Вы попали в мишень!");
            } else if (yVert == 1 && xGor == 1) {
                System.out.println("Вы попали в мишень!");
            } else if (yVert == 1 && xGor == -1) {
                System.out.println("Вы попали в мишень!");
            } else if (yVert == -1 && xGor == 1) {
                System.out.println("Вы попали в мишень!");
            } else if (yVert == 0 && xGor == 0) {
                System.out.println("Вы попали в мишень!");
            } else if (yVert == 0 && xGor == 1) {
                System.out.println("Вы попали в мишень!");
            } else if (yVert == 0 && xGor == -1) {
                System.out.println("Вы попали в мишень!");
            } else if (yVert == -1 && xGor == 0) {
                System.out.println("Вы попали в мишень!");
            } else if (yVert > 10 && xGor > 10 || yVert < -10 && xGor < -10) {
                System.out.println("Зачем дырявить стены???");
            } else
                System.out.print("Эх, Вы не попали в центр.");
        }


        System.out.println("\nКоординаты броска - Y: " + yVert);
        System.out.println("Координаты броска - X: " + xGor);
    }
}


       /* if (vvod == 1) {
            if (yVert == -1 && xGor == -1 || yVert == 1 && xGor == 1 || yVert == 1 && xGor == -1 ||
                    yVert == -1 && xGor == 1 || yVert == 0 && xGor == 0 || yVert == 0 && xGor == 1 ||
                    yVert == 0 && xGor == -1 || yVert == -1 && xGor == 0) { System.out.println("Вы попали в мишень!");}
        } else {System.out.println("Эх, Вы не попали в мишень :(");} **/




