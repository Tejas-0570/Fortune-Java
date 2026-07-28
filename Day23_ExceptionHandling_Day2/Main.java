public class Main {
    public static void main(String[] args) {
        try {
            // Code that might cause an error
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            // Code that runs if the error occurs
            System.out.println("Error caught: " + e.getMessage());
        } finally {
            // Code that always runs
            System.out.println("Execution finished.");
        }
    }
}
