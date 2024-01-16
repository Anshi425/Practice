public class sum {
    public static void main(String[] args) {
        int num1 = 10, num2 = 25, num3 = 18; // Initialize three integers
        int largest = Math.max(Math.max(num1, num2), num3); // Find the largest
        System.out.println("Sum of the largest number: " + (largest + largest)); // Print sum of largest doubled
    }
}