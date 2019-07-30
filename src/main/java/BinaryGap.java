public class BinaryGap {
    public int findGap(int N) {
        int max = 0;
        int zero = 0;
        int j;
        String b = Integer.toBinaryString(N);
        char[] a = b.toCharArray();
        for(j = 0; a[j] != '1'&& j < a.length; j++);
        for(int i = j+1; i < a.length-1; i++){
            if(a[i] == '0'){
                zero++;
            } else {
                if(zero > max)
                    max = zero;
                zero = 0;
            }
        }
        System.out.println("Number " + N + " contains a binary gap of length " + zero);
        return zero;
    }
}
