package circle;

import lombok.*;

public @Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Method to get the area of the circle
     * formula :  π*(r^2)
     * @return area of the circle instantiated
     */
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
