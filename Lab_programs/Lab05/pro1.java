abstract class Shape3D {
    abstract void calculateVolume();
    abstract void calculateSurfaceArea();
}

class Sphere extends Shape3D {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateVolume() {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("Sphere Volume: " + volume);
    }

    @Override
    void calculateSurfaceArea() {
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
        System.out.println("Sphere Surface Area: " + surfaceArea);
    }
}

class Cube extends Shape3D {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    void calculateVolume() {
        double volume = Math.pow(side, 3);
        System.out.println("Cube Volume: " + volume);
    }

    @Override
    void calculateSurfaceArea() {
        double surfaceArea = 6 * Math.pow(side, 2);
        System.out.println("Cube Surface Area: " + surfaceArea);
    }
}

public class pro1 {
    public static void main(String[] args) {
        Shape3D sphere = new Sphere(5); // Radius of 5
        sphere.calculateVolume();        // Prints volume
        sphere.calculateSurfaceArea();   // Prints surface area

        Shape3D cube = new Cube(3);     // Side length of 3
        cube.calculateVolume();          // Prints volume
        cube.calculateSurfaceArea();     // Prints surface area
    }
}
