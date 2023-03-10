/*1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
        2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        3. Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат, где a, b, c, d – входные параметры этого метода;
        4. Написать метод, принимающий на вход два числа, и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false;
        5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное число передали или отрицательное (Замечание: ноль считаем положительным числом.);
        6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
        7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
        8. *Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        9. *Не набирая код в IDE, ответьте на следующий вопрос. Есть два метода:
        void myMethod(int a, String b) {}
        void myMethod(String b, int a) {}
        - Один и тот же метод.

        Это две разных сигнатуры одного метода или один и тот же метод?
*/
public class Main {

    public static void main(String[] args) {
        //2
        byte a0 = 8;
        int a = 100;
        short b = 1045;
        long c = 1296421983L;

        double d = 5.6;
        float e = 5.60f;

        boolean Flag = true;

        char hello = 'H';
        //3
        System.out.println(countPoly(2, 5, 4, 2));
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false
        isPositive(5);
        isPositive(-3);
        isNegative(-10);
        isNegative(56);
        printHello("Настя");
        isLeapYear(2000);
        isLeapYear(1998);
    }

    //
    public static double countPoly(double a, double b, double c, double d) {
        // метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат
        return (a * (b + (c / d)));
    }

    private static boolean isSumBetween10And20(int a, int b) {
        //4. Написать метод, принимающий на вход два числа, и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
        // если да – вернуть true, в противном случае – false;
        if ((a + b >= 10) && (a + b <= 20)) {
            return true;
        }
        return false;
    }

    private static void isPositive(int x) {
        //5. метод, которому в качестве параметра передается целое число,
        //метод должен напечатать в консоль положительное число передали или отрицательное (Замечание: ноль считаем положительным числом.)
        if (x >= 0) {
            System.out.println(x);
        }
    }


    private static boolean isNegative(int x) {
        //метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
        if (x < 0) {
            return true;
        }
        return false;
    }

    private static void printHello(String name){
        // метод, которому в качестве параметра передается строка, обозначающая имя,
        // метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
        System.out.printf("Привет, %s!", name);
    }

    private static void isLeapYear(int year){
            if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                System.out.printf("Год %d является високосным!", year);
            }
            else{
                System.out.printf("Год %d не является високосным!", year);
            }

    }
}

