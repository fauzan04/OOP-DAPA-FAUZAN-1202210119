public class Calculation implements Runnable{
    private double radius;
    private double side;
    private double area;
    private double phi = 3.14;

    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getSide() {
        return side;
    }
    
    public void setSide(double side) throws IllegalArgumentException {
        if (side < 1) {
            throw new IllegalArgumentException("illegal argument exception");
        }
        this.side = side;
    }

    public void setCircle() throws IllegalArgumentException{
        if (this.radius < 1) {
            throw new IllegalArgumentException("illegal argument exception");
        }
        this.area = this.phi * this.radius * this.radius;
    }
}
