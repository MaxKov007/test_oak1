package whiteRabbit.lesson6;

public class Numbers {
    //x+3=5

    //Переменные могут быть обьявлены как в классе, так и в методе
    //Переменными экземпляра класса или переменными класса
    //Переменные обьявленные в методе являються локальными переменными
    //Литералы - это любое число, символ или строка

    static byte a = 126; // 1 byte(2^8=256) //размер 8 бит //от -128 до 127 //Целые числа
    static short b = 777; //2 byte(2^16=65.538) //размер 16 бит //от -32768 до 32767 //Целые числа
    static int c = 35_000; //4 byte(2^32=4.294.967.296) //размер 32 бит //от -2147483648 до 2147483647 //Целые числа
    static long d = 1_000_000_000_000_000L; //8 byte(2^64=18.446.744.073.709.551.616) //размер 64 бит //от -9223372036854775808L до 9223372036854775807L //Целые числа

    static char e = 'c'; //2 byte(2^16=65.538) //размер 16 бит //от 0 до 65537 (кодировка Unicode) //Символьный

    static float f = 7.1f; //4 byte(2^32=4.294.967.296) //размер 32 бит //от -1.4*10^45 до 3.4*10^38 //Числа с плавающей точкой (вещественные)
    static double g = 6.3; //8 byte(2^64=18.446.744.073.709.551.616) //размер 64 бит //от -4.9*10^324 до 1.7*10^308 //Числа с плавающей точкой (вещественные)

    static boolean h = true; //размер 8 бит(в массивах), 32бит (не в массивах (используется int)) //true или false //Логический

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }

}