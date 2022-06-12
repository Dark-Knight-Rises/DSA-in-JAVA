/**
 * symmetric matrix is a matrix with M(i,j) = M(j,i)
 * we can represent the matrix by using a single dimension array
 * for this a lower/upper triangular matrix can be used.
 */
public class SymmetricMatrix {
    int m = 4, n = 16, index;
    int[] array = new int[n];

    public void fillSingleDimensionArray() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (j <= i) {
                    index = i * (i + 1) + j;
                    array[index] = 3;
                }
            }

        }
    }

    public void displayArray() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (j <= i) {
                    index = i * (i + 1) + j;
                    System.out.print(array[index] + ", ");
                }

            }
        }
    }
}
