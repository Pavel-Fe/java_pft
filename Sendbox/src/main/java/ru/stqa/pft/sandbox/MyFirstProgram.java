package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Pavel");

        Square s = new Square(5);
        System.out.println("Площадь квадрата Со Стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь прЯмоугольника Со Сторонами " + r.a + " и " + r.b + " = " + r.area());
    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }


}