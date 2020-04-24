package lessonsJava;

public class Lesson6 {
    byte b = 0; // 1 byte(256) //размер 8 бит //от -128 до 127 //Целые числа
    short s = 1234; //2 byte //размер 16 бит //от -32768 до 32767 //Целые числа
    int i = 2342342; //4 byte //размер 32 бит //от -2147483648 до 2147483647 //Целые числа
    long l = 234234234; //8 byte //размер 64 бит //от -9223372036854775808L до 9223372036854775807L //Целые числа

    float f = 12.324f; //размер 32 бит //от 1.4e-45f до 3.4e+38f //Числа с плавающей точкой (вещественные)
    double d = 1234.23423; //размер 64 бит //от 4.9e-324 до 1.7e+308 //Числа с плавающей точкой (вещественные)
    boolean bool = false; //размер 8 (в массивах), 32 (не в массивах используется int) //true или false //Логический
    char c = 'c'; //Символьный

    Lesson4.Human friend = new Lesson4.Human(); //Типы, которые являються класами
    Lesson4.Human mom;
    Lesson4.Human dad;

    Car car = new Car();

    public static void main(String[] arge) {


        // https://ru.wikibooks.org/wiki/Java/Типы_данных
    }
}
