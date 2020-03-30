package selfstudy;

public class Algorithm {

    public int isConstantTimeComplexity(int[] data, int n) {
        int k = n/2;
        return data[k];
    }

    public int isLinearTimeComplexity(int data[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + data[i];
        }
        return sum;
    }

    public int isSequentialSearch(int n, int[] data, int target) {
        for (int i = 0; i < n; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public boolean isQuadraticDistinct(int n, int[] x) {
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (x[i] == x[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
