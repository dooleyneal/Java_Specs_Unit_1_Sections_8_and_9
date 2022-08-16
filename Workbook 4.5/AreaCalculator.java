public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println("Thank you for using the area calculator");
        System.out.println("This calculator lets you get the area of: ");
        System.out.println("1 - Square\n2 - Rectangle\n3 - Triangle\n4 - Circle\n");

        
        //Task 5 – Call area functions.

        // double square = area of square with a side of 2.
        // double rectangle = area of rectangle with a length of 1, and a width of 2. 
        // double triangle = area of triangle with a base of 1, and a width of 2. 
        // double circle = area of circle with a radius of 2.

        areaSquare(2);
        areaRectangle(1, 2);
        areaTriangle(1,2);
        areaCircle(2);


        //Task 7 – Call a function that prints all the areas.
        printAreas(2,1,2,1,2,2);

    }

    //Task 1 - Write a function that calculates the area of a square. 


    /**
     * Function name: areaSquare - returns the area of a square.
     * @param side (double)
     * @return the area (double)
     * 
     * Inside the function: 
     *  1. If the side is negative, prints "Error: impossible" and terminates the java program.
     *  2. Calculates the area of the square. A = side²
     */
    public static double areaSquare(double side) {
        if( side < 0 ) {
            System.out.println("Error: impossible");
            System.exit(0);
        }


        return Math.pow(side, 2);

    }


    //Task 2 - Write a function that calculates the area of a rectangle. 


    /**
     * Function name: areaRectangle – returns the area of a rectangle.
     * @param length (double).
     * @param width  (double).
     * @return the area (double)
     * 
     * Inside the function: 
     *  1. If the length OR width is negative, prints "Error: impossible" and terminates the program.
     *  2. Calculates the area of the rectangle. A = length * width
     */
    public static double areaRectangle(double length, double width) {
        if (length < 0 || width < 0) {
            System.out.println("Error: impossible");
            System.exit(0);
        }
        return length*width;
    } 

    //Task 3 - Write a function that calculates the area of a triangle. 

    /**
     * Function name: areaTriangle – it returns the area of a triangle.
     * @param base: (double).
     * @param height: (double).
     * @return the area (double)
     * 
     * Inside the function: 
     *  1. If the base OR height is negative, prints "Error: impossible" and terminates the program.
     *  2. Calculates the area of the triangle. A = (base * height)/2
     */ 
    public static double areaTriangle(double base, double height) {
        if (base < 0 || base < 0) {
            System.out.println("Error: impossible");
            System.exit(0);
        }
        return (1/2)*base*height;
    }

    //Task 4 - Write a function that calculates the area of circle. 


    /**
     * Function name: areaCircle – it returns the area of a circle.
     * @param radius (double).
     * @return area (double)
     * 
     * Inside the function: 
     *  1. If the radius is negative, prints "Error: impossible" and terminates the program.
     *  2. Calculates the area of the circle. 
     */ 
    public static double areaCircle(double radius) {
        if( radius < 0 ) {
            System.out.println("Error: impossible");
            System.exit(0);
        }


        return Math.PI*Math.pow(radius, 2);

    }



    //Task 6: Write a function that prints every area.


    /**
     * Function name: printAreas – it prints four areas
     * @param square – square area (double)
     * @param rectangle – rectangle area (double)
     * @param triangle – triangle area (double)
     * @param circle – circle area (double)
     * 
     * Inside the function:
     *  1. print: ("Square area: <square area>")
     *  2. print: ("Rectangle area: <rectangle area>")
     *  3. print: ("Triangle area: <triangle area>")
     *  4. print: ("Circle area: <circle area>")
     * 
     */
    public static void printAreas(double side, double length, double width, double base, double height, double radius) {
        System.out.println("Square area: " + areaSquare(side));
        System.out.println("Rectangle area: " + areaRectangle(length, width));
        System.out.println("Triangle area: " + areaTriangle(base, height));
        System.out.println("Circle area: " + areaCircle(radius));
    }

}
