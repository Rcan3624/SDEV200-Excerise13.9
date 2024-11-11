public class TestCircle {

        /** Main method */
        public static void main(String[] args) {
            // Declare and initialize two circle objects
            Circle circle1 = new Circle(5);
            Circle circle2 = new Circle(5);

            System.out.println("Circle 1 is: " + circle1.getRadius());
            System.out.println("Circle 2 is: " + circle2.getRadius());
            if (circle1.equals(circle2)) {
                System.out.println("The two circle objects are equal");
            } else {
                System.out.println("The two circle objects are not equal");
            }


            Circle circle3 = new Circle(3);
            Circle circle4 = new Circle(2);
            System.out.println("Circle 3 is: " + circle3.getRadius());
            System.out.println("Circle 4 is: " + circle4.getRadius());

            if (circle3.equals(circle4)) {
                System.out.println("The two circle objects are equal");
            } else {
                System.out.println("The two circle objects are not equal");
            }

            // Display circle
            displayGeometricObject(circle3);

            // Display circle
            displayGeometricObject(circle4);
        }


//        public static boolean equalArea(GeometricObject object1,
//                                        GeometricObject object2) {
//            return object1.getArea() == object2.getArea();
//        }




        public static void displayGeometricObject(GeometricObject object) {
//            System.out.println();
//            System.out.println("The area is " + object.getArea());
//            System.out.println("The perimeter is " + object.getPerimeter());
        }
    }


