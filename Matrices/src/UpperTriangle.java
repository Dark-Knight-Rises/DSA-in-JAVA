public class UpperTriangle {
    int len = 16, index, m = 4;
    int[] array = new int[len];// 4x4 matrix

    public void fillArray() {

    }

    public void displayArray() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (j >= i) {
                    index = j * (j + 1) / 2;
                }
            }
        }
    }
}
