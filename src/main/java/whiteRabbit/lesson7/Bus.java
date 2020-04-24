package whiteRabbit.lesson7;

public static void main(String[]args){

public class Bus { //Класс (содержит два поля и один метод)
    public String model; // Переменная или поле
    public String color; // Переменная или поле

    public void showColor() { //Метод (или функция в других языках программирования)
        System.out.println(color); //Метод

        Bus ourBus = new Bus();
        Bus firstBus = new Bus();
        Bus secondBus = new Bus();

        ourBus.color = "Green";
        firstBus.color = "Red";
        secondBus.color = "Grey";

        ourBus.showColor();
        firstBus.showColor();
        secondBus.showColor();
    }
}
}

/**
 * Обьекты
 * Все обьекты обладают свойствами
 * Свойства обьекта - это его поля или переменные (как в классе)
 *
 * Все обьекты могут проявлять свое поведение (то что обьект может делать)
 * Поведение - это методы обьекта
 *
 * Все обьекты являються разными
 * Для того, чтобы описать группу схожих обьектов ввели понятие класса
 * Класс - это описание обьекта, его общая схема или макет
 */
