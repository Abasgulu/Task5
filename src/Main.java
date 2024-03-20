

import java.util.Scanner;

            class RectangleArea {
                private double length;
                private double width;
                private double area;

                public void getData() {
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Enter length of the rectangle: ");
                    this.length = scanner.nextDouble();
                    System.out.print("Enter width of the rectangle: ");
                    this.width = scanner.nextDouble();
                }

                public void computeField() {
                    this.area = this.length * this.width;
                }

                public void fieldDisplay() {
                    System.out.println("Rectangle length: " + this.length);
                    System.out.println("Rectangle width: " + this.width);
                    System.out.println("Rectangle area: " + this.area);
                }
            }

            public class Main {
                public static void main(String[] args) {
                    RectangleArea rectangle = new RectangleArea();

                    rectangle.getData();       // Gets the data from the user
                    rectangle.computeField();  // Calculates the area of the rectangle
                    rectangle.fieldDisplay();  // Displays the area of the rectangle
                }
            }

