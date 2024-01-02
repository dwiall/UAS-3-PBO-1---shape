package shape;

import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Dwi Ayu Lestari
 * PRODI    : PBO1
 * NIM      : 22166030
 * Deskripsi program :
 * 
 */
public class Shape { // superclass
    private final String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return 0;
    }

    // subclass Circle inheritance shape
    class Circle extends Shape {
        private final double radius;

        public Circle(String color, double radius) {
            super(color);
            this.radius = radius;
        }

        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }
    }

    // subclass Rectangle inheritance shape
    class Rectangle extends Shape {
        private final double length;
        private final double width;

        public Rectangle(String color, double length, double width) {
            super(color);
            this.length = length;
            this.width = width;
        }

        @Override
        public double getArea() {
            return length * width;
        }
    }
// metode untuk menjalankan program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inputan Lingkaran dimulai
        System.out.println("Perhitungan Luas Lingkaran");
        System.out.println("==================================");
        System.out.println("Masukkan warna lingkaran: ");
        String colorCircle = scanner.nextLine();
        System.out.println("Masukkan radius Lingkaran: ");
        double radius = scanner.nextDouble();
        
        // Membuat instance class luar Shape
        Shape shape = new Shape(colorCircle);
        
        // Membuat instance class Circle menggunakan instance kelas luar
        Shape.Circle circle = shape.new Circle(colorCircle, radius);

        // Menampilkan hasil perhitungan luas lingkaran
        System.out.println("Luas Lingkaran: " + circle.getArea());
        System.out.println("");

        // Input Persegi Panjang dimulai
        System.out.println("Perhitungan Luas Persegi Panjang");
        System.out.println("====================================");
        System.out.println("Masukkan warna persegi panjang: ");
        
        // Membuang newline character dari buffer
        scanner.nextLine();
        
        String colorRectangle = scanner.nextLine();
        System.out.println("Masukkan Panjang Persegi Panjang: ");
        double length = scanner.nextDouble();
        System.out.println("Masukkan lebar persegi panjang: ");
        double width = scanner.nextDouble();
        
        // Membuat instance class Rectangle menggunakan instance kelas luar
        Shape.Rectangle rectangle = shape.new Rectangle(colorRectangle, length, width);
        
        // Menampilkan hasil perhitungan luas persegi panjang
        System.out.println("Luas Persegi Panjang: " + rectangle.getArea());

        // input scanner ditutup
        scanner.close();
    }
}