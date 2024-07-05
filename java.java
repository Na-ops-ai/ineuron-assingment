public class java {
    public static void main(String[] args) {
        int rows = 7;
        int columns = 9;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                // Conditions to print stars
                if (i == 0 || i == rows - 1 || i == rows / 2 || j == 0) {
                    System.out.print("*");
                } else if ((i < rows / 2 && j == columns - 1 && i != 0) || (i > rows / 2 && j == columns - 1 && i != rows - 1)) {
                    System.out.print(" ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}