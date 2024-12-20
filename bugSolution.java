public class MyClass {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5) {
                // Handle the condition if needed, no premature exit
                System.out.println("Reached condition at i=5");
            }
        }
    }
}