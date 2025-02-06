public class Triangle {
    public static void main(String[] args) {
        // Define the number of rows (height of the triangle)
        int rows = 5; // You can change this value to adjust the size of the triangle

        // Outer loop for each row
        for (int i = 1; i <= rows; i++) {
            // Inner loop to print stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing each row of stars
            System.out.println();
        }
    }
}
