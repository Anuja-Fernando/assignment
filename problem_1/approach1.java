import java.util.*;

class approach1 {

    public int singleNumber(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        //map to count occurrences of each element
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for (int num : nums) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        
        return -1; 
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        approach1 obj = new approach1();
        int result = obj.singleNumber(nums);
        
        System.out.println("Single number is: " + result);
        
        sc.close();
    }
}
