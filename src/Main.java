import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // main code here
        Scanner in = new Scanner(System.in);
        System.out.println(Arrays.toString(new TwoSum().twoSum(new int[]{2, 7, 11, 15}, 9)));
//        System.out.println(new TwoSum().twoSum(new int[]{2, 7, 11, 15}, 9));
        in.close();
    }
}