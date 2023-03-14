package Chapter13_AbstractClassesAndInterfaces.latihan;

public class Listing13_4_TestGeometricObject {
    public static void main(String[] args) {
        Listing13_1_GeometricObject geoObject1 = new Listing13_2_Circle(5);
        Listing13_1_GeometricObject geoObject2 = new Listing13_3_Rectangle(5, 3);

        System.out.println("The two objects have the same area? " +
                 equalArea(geoObject1, geoObject2));


         displayGeometricObject(geoObject1);

         displayGeometricObject(geoObject2);
        }

        public static boolean equalArea(Listing13_1_GeometricObject object1,
        Listing13_1_GeometricObject object2) {
         return object1.getArea() == object2.getArea();
         }


        public static void displayGeometricObject(Listing13_1_GeometricObject object) {
        System.out.println();
        System.out.println("The area is " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());

     }
}
