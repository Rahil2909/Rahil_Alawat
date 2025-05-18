import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers separated by space:");
        String[] input = sc.nextLine().split(" ");
        int[] nums = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        Map<Integer, Integer> result = new HashMap<>();
        for (int i = 1; i <= 9; i++) result.put(i, 0);

        for (int num : nums) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    result.put(i, result.get(i) + 1);
                }
            }
        }

        System.out.println(result);
    }
}
