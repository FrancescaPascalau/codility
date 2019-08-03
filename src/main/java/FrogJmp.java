public class FrogJmp {

    public int solution(int X, int Y, int D) {
// Not performing solution

//        int jumpsNumber = 0;
//        int jumpValue = X;
//        if (X < Y) {
//            while (jumpValue < Y) {
//                jumpValue = jumpValue + D;
//                jumpsNumber++;
//            }
//        } else if (X == Y) {
//            jumpsNumber = 0;
//        }
//        else if (D >= Y){
//            jumpsNumber = 1;
//        }
//        return jumpsNumber;


// Performing solution
        int distance = Y - X;
        int jumps = 0;
        if (X < Y) {
            jumps = (int) Math.ceil(distance / (double) D);
        } else if (X == Y) {
            jumps = 0;
        } else if (D >= Y) {
            jumps = 1;
        }
        return jumps;
    }
}
