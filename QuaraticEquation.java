public class QuaraticEquation {
    int a, b, c;

    public QuaraticEquation() {
    }

    public QuaraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getDiscriminant() {
        double delta;
        return delta = b * b - 4 * a * c;
    }

    public double getRoot1() {
        double r1;
        return r1 = (-b + Math.pow(b * b - 4 * a * c, 0.5)) / 2;
    }

    public double getRoot2() {
        double r2;
        return r2 = (-b - Math.pow(b * b - 4 * a * c, 0.5)) / 2;
    }

    public double getRoot3() {
        double r3;
        return r3 = -b / a;
    }

    public void HaiNghiem() {
        System.out.println("Nghiem 1: " + this.getRoot1());
        System.out.println("Nghiem 2 :" + this.getRoot2());
    }

    public void MotNghiem() {
        System.out.println("mot nghiem duy nhat" + this.getRoot3());
    }

    public static void main(String[] args) {

        QuaraticEquation quaraticEquation = new QuaraticEquation(1, -7, 10);
        System.out.println(quaraticEquation.getDiscriminant());
        if (quaraticEquation.getDiscriminant() >= 0) {
            quaraticEquation.HaiNghiem();
        } else if(quaraticEquation.getDiscriminant()==0){
            quaraticEquation.MotNghiem();
        }else {
            System.out.println("Vo nghiem");
        }
    }
}