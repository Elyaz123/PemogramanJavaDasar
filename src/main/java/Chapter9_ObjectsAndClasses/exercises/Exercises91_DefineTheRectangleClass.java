package Chapter9_ObjectsAndClasses.exercises;

import java.awt.*;

public class Exercises91_DefineTheRectangleClass {
    double width;
    double height;

    Rectangle() {
        width = 1;
        height = 1;
    }

    Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }

    double getArea() {
        return width * height;
    }
}
