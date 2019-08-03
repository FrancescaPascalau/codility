import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
//        BinaryGap b = new BinaryGap();
//        b.findGap(1041);

//        int a[] ={5, 7, 2, 7, 5, 2, 5};
//        Array1 a1 = new Array1();
//        int nr = a1.solution(a);
//        System.out.println("The unpaired number from array is " + nr);

//        Array2 a2 = new Array2();
//        int a[] = {3, 8, 9, 7, 6};
//        int k = 3;
//        int res[] = a2.solution(a, k);
//        System.out.println("The rotated array is: ");
//        for (int element : res) {
//            System.out.print(element);
//        }

//        Solution2 s = new Solution2();
//        s.solution(1234000);

//        OddOccurrencesInArray odd = new OddOccurrencesInArray();
//        int result;
//        int[] array = {3,1,6,3,7,1,6};
//
//        result = odd.solution(array);
//        System.out.println(result);

//        RightRotation rotate = new RightRotation();
//        int array[] = {};
//        int rotation = 9;
//        int[] result = rotate.solution(array, rotation);
//        System.out.println("The new array is: ");
//        for (int element : result){
//            System.out.print(element);
//        }

        FrogJmp froggy = new FrogJmp();
        int minimalJumps = froggy.solution(3, 999111321, 7);
        System.out.println("The number of jumps the frog has to do is: " + minimalJumps);
    }
}