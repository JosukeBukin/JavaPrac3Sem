package ru.mirea.praс7.task3;

public class Test {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle();
        rectangle.moveDown(5.55);
        rectangle.moveRight(4.56);
        System.out.println(rectangle);
        System.out.println("is speed equal? " + rectangle.SpeedTest());
    }
}
