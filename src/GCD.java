import java.util.*;

public class GCD {
    public static ArrayList<Integer[]> divideChocolateStick(int M, int N) {
        // TODO:
        int big = Math.max(M,N);
        int small = Math.min(M,N);
        int gcd = findGCD(big, small);
        ArrayList<Integer[]> ans = new ArrayList<>();
        for (int i = 1 ; i <= gcd ; i++) {
            if ( gcd % i == 0) {
                Integer[] data = new Integer[3];
                data[0] = i;
                data[1] = M/i;
                data[2] = N/i;
                ans.add(data);
            }
        }
        return ans;
    }

    public static int findGCD(int big, int small) {
        if ( small == big) return small;
        if ( small == 1) return 1;
        else return findGCD(Math.max(small, big-small), Math.min(small, big-small));

    }
    public static void main(String[] args) {

    }
}
