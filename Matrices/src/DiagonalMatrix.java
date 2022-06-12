public class DiagonalMatrix {
    int[][] matrix = new int[5][5];
    int m = matrix.length, n = matrix[0].length;
    int[] array = new int[m];

    public void fillMatrix() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matrix[i][j] = i + 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public void displayMatrix() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public void toSingleDimensionArray() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    array[i] = matrix[i][j];
                }
            }
        }
    }

    public void displayArray() {
        System.out.println("single dimension array");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(array[i] + ", ");
                } else {
                    System.out.print(0 + ", ");
                }
            }
            System.out.println();
        }
    }

    public int displayArray(int i, int j) {
        if (i >= 0 && j >= 0 && i < m && j < n) {
            if (i == j) {
                return array[i];
            }
            return 0;
        }
        System.out.println("Invalid indexes provided");
        return -1;
    }
}
