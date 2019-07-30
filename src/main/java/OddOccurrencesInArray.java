import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OddOccurrencesInArray {

    public int solution(int[] array) {
        boolean pair;
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            pair = false;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j)
                    pair = true;
            }
            if (pair == false)
                res = array[i];
        }
        return res;
    }

    public int solution2(int[] array) {
        List<Integer> arr = new ArrayList<>();
        for (int i : array){
            arr.add(i);
        }
        arr.sort(Comparator.naturalOrder());
        System.out.println(arr);
        for (int i = 0; i < arr.size(); i = i + 2) {
            try {
                if (!arr.get(i).equals(arr.get(i + 1))) {
                    return arr.get(i);
                }
            } catch(IndexOutOfBoundsException e){
                return arr.get(i);
            }
        }
        throw new RuntimeException("No unpaired element found");
    }
}
