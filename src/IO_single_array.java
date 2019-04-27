import java.util.Scanner;

public class IO_single_array {

    public static void main (String [] arg){

                //Program info

        System.out.println("Произведите ввод данных с клавиатуры в массив, а после этого произведите вывод массива на экран, где каждый элемент массива умножается на 2.");

                //Var

        int counter_i;
        int array_bound = 0;
        int to_print;
        boolean success_flag = true;

                //Input array's bound

        while (success_flag) {

            try {

                Scanner in = new Scanner(System.in);
                System.out.print("Введите желаемую размерность массива: ");
                array_bound = in.nextInt();
                success_flag = !success_flag;

            }
            catch (java.util.InputMismatchException e) {

                System.out.println("Ошибочный ввод: введите натуральное число");

            }

        }

                //Input data in array

        double [] array = new double[array_bound];

        for (counter_i = 0; counter_i < array_bound; counter_i++) {

            success_flag = true;

            while (success_flag) {

                try {

                    Scanner in = new Scanner(System.in);
                    to_print = counter_i +1;
                    System.out.print("Введите " + to_print + " элемент массива: ");
                    array[counter_i] = in.nextDouble();
                    success_flag = !success_flag;

                } catch (java.util.InputMismatchException e) {

                    System.out.println("Ошибочный ввод: введите действительное число формата n,m");

                }

            }

        }
                //Output data in array

        System.out.println("Ваш массив умноженный на 2:");

        for (counter_i = 0; counter_i < array_bound; counter_i++) {

            System.out.print("| "+ array [counter_i] * 2 + " |");

        }

    }
}
