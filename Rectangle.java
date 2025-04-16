public class Rectangle {
    double width;
    double height;


    public double calculateArea (double width, double height) {
        return width * height;
    }

    public double calculatePerimeter(double width,double height) {
        return 2 * (width + height);
    }
    public static void main(String [] args){
        Rectangle r= new Rectangle();
         System.out.println(r.calculateArea(12,43));
         System.out.println(r.calculatePerimeter(12,43));

    }


    
}
