package org.videoEditor;

public class Main {
    public static void main(String[] args) {
        ShapePrinter printer = new ShapePrinter();

        printer.printShape(new Circle());
        printer.printShape(new Quad());
        printer.printShape(new Hexagon());
        printer.printShape(new Rectangle());
        printer.printShape(new Triangle());
    }
}
