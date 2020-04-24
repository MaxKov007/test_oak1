package lessonsJava;

public class Lesson4 {
    public static class Human { //Обьект
        int age; //параметры описывают состояние
        double weight;

        public static void main(String[] arge) { //метод мейн является входной точкой в программу, запускает код)
            Human human1 = new Human();
            human1.byBred();
            human1.byMilk();
            System.out.println("Hello world");
        }

        void birthday() {
            age = age + 1;
        }

        void byMilk() { //методы описывают поведение (то, что мы можем сделать). Методы работают с параметрами
            System.out.println("By milk");
        }

        void byBred() {
            System.out.println("by bred");
        }
    }
}
