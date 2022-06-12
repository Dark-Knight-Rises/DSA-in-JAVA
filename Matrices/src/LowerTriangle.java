public class LowerTriangle {
    int[][] matrix = new int[4][4];
    int m = matrix.length, n = matrix[0].length, count = 1, cnt = 1, p = 0, index;
    int[] array = new int[m * n];

    public void fillMatrix() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    matrix[i][j] = count++;
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

    public void fillSingleDimensionArray() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (j <= i) {
                    index = i * (i + 1) + j;
                    array[index] = cnt++;
                }
            }
        }
    }

    public void displaySingleArray() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (j <= i) {
                    index = i * (i + 1) + j;
                    System.out.print(array[index] + ", ");
                } else {
                    System.out.print(0 + ", ");
                }
            }
            System.out.println();
        }

    }
}
