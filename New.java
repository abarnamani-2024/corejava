public class New {
    static int newno = 1234;

    public static void main(String[] args) {
        int r;

        // Loop until newno becomes 0
        while (newno > 0) {
            // Extract the last digit
            //r = newno % 10;
            // Print the digit
            System.out.print(newno);
            // Remove the last digit
            newno = newno / 10;
        }
    }
}