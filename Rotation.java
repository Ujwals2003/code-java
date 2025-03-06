public class Rotation {
    // Main method - entry point of the program
    public static void main(String[] args) {
        // Create a 3x3 matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Show original matrix
        System.out.println("Original Matrix:");
        displayMatrix(matrix);

        // Rotate the matrix
        rotateMatrix(matrix);

        // Show rotated matrix
        System.out.println("\nRotated Matrix:");
        displayMatrix(matrix);
    }

    // Method to rotate the matrix
    public static void rotateMatrix(int[][] matrix) {
        // Step 1: Transpose the matrix (swap rows and columns)
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                // Swap elements
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                // Swap elements within the row
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
    }

    // Method to display the matrix
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}