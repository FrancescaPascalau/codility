public class Array2 {

    public int[] solution(int[] A, int K){
        int i;
        int l = A.length;
        int solution[] = new int[l];
        for(i = 0; i < l; i++) {
            solution[(i + K)%l] = A[i];
        }
        return solution;
    }
}
