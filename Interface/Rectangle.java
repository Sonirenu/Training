package Interface;

class Rectangle implements Polygon {
    public void getArea(int length, int breadth) {
        System.out.println("The area of the rectangle is " + (length * breadth));
    }
    public void getPerimeter(double length, double width) {
        System.out.println("Perimeter: "+2 * (length + width));
    }

}

