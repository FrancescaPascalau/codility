public class RightRotation {
    public int[] solution(int[] A, int K) {

        int l = A.length;
        int[] result = new int[l];
        int count = 0;
        if (l > 0) {
            K = K % l;
            for (int i = 0; i < A.length; i++) {
                if (i < l - K) {
                    result[i + K] = A[i];
                } else {
                    result[count++] = A[i];
                }
            }
        }
        return result;
    }
}

