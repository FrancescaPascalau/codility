public class Solution2 {

    public int solution(int n) {
        String binaryNr = Integer.toBinaryString(n);
        System.out.println(binaryNr);
        int max = 0;
        int count = 0;
        char sequence[] = binaryNr.toCharArray();
        for (int i = 1; i < sequence.length; i++) {
            if (sequence[i] == '0') {
                count++;
            }
            if (sequence[i] == '1'){
                if(count > max)
                    max = count;
                count = 0;
            }

        }
        System.out.println("Length of binary gap is: " + max);
        return count;
    }
}
