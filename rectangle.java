public class rectangle {
    double width;
    double height;

    public rectangle() {

    }

    public rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getwidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }
    public void display(){
        System.out.println(this.getArea());
        System.out.println(this.getPerimeter());
    }
    public static void main(String[] args) {
        rectangle Rectangle = new rectangle(10, 20);
     Rectangle.display();
    }
}


