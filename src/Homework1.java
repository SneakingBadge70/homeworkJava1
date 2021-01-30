public class Homework1 {

    //1. Создать пустой проект в IntelliJ IDEA и прописать метод main;

    public static void main(String[] args) {

        //2. Создать переменные всех пройденных типов данных, и инициализировать их значения;

        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 1244342342L;
        float f = 100.55f;
        double d = 105.22;
        char g = 'Y';

        Boolean bb = false;
        String ScoobeDoo = "Scoobe Doo!";

       //Значение результата задания 2
       System.out.println("Инициализированное значение");
       System.out.println("byte b = " + b);
       System.out.println("short s = " + s);
       System.out.println("int i = " + i);
       System.out.println("long l = " + l);
       System.out.println("float f = " + f);
       System.out.println("float d = " + d);
       System.out.println("char g = " + g);

       //вывод 3
        System.out.println("Рез-т задания 3");
        System.out.println(calculate(1, 2,3,5));

        // Вывод 4
        System.out.println("Занчение рез-та задания 4");
        System.out.println(beetwean10and20(20, 7));

        // 5
        System.out.println("Занчение рез-та задания 5");
        NegOrPos(7);

        // задание 6
        System.out.println("Задание 6");
        System.out.println(MoreThenZero(7));

        //задание 7
        System.out.println("Задание 7");
        doSeven("Dovakin");


    }



    // 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //где a, b, c, d – аргументы этого метода, имеющие тип float.

    public static float calculate(float a, float b, float c, float d) {

         return (a * (b + (c / d)));
    }

    // 4. Написать метод, принимающий на вход два целых числа и проверяющий
    // что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.

    public static boolean beetwean10and20 (int x, int y) {
        int sum = x + y;
        return sum >= 10 && sum <= 20;
    }

    // Задание 5 Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.
    public static void NegOrPos (int x) {
        if (x>=0) {
            System.out.println("Циферка положительная");
        }

        else {
            System.out.println("Циферка отрицательная");
        }

    }

    // Задание 6Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
    // если число отрицательное, и вернуть false если положительное.
    static boolean MoreThenZero(int a) {
        return a < 0;

    }

    //задание 7 Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    // Метод должен вывести в консоль сообщение «Привет, указанное_имя!».

    public static void doSeven (String name) {
        System.out.println("Привет," + name +"!");
    }



}





























