package lessonsJava;

public class Lesson7 {

    static class Human {
        int age = 20;

        public static void main(String[] arge) {
            Human human = new Human();
            System.out.println(human.getAge(5, 0.2, true, human));
        }

        double getAge(int i, double d, boolean bool, Human human) {
            int k = 5;
            return human.age;
        }
    }
}
