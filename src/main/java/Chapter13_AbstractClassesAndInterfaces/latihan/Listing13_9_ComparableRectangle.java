package Chapter13_AbstractClassesAndInterfaces.latihan;

public class Listing13_9_ComparableRectangle extends Listing13_3_Rectangle {
    implements Comparable<Listing13_9_ComparableRectangle>

    {
         public Listing13_9_ComparableRectangle( double width, double height){
        super(width, height);
    }

        @Override
        public int compareTo (Listing13_9_ComparableRectangle o){
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return −1;
             else
        return 0;
    }

        @Override
        public String toString () {
        return "Width: " + getWidth() + " Height: " + getHeight() +
                "Area: " + getArea();
         }
    }
}
