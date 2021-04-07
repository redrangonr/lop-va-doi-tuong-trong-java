public class Fan {
    int speed;
    boolean status;
    private double radius;
    String color;

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.status = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + speed +
                ", status=" + status +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Fan fan1= new Fan(3 ,true ,10 ,"yeloow");
        fan1.setSpeed(2);
        System.out.println(fan1.toString());
        Fan fan2= new Fan(1 ,false ,5 ,"blue");
        System.out.println(fan2.toString());
    }
}


