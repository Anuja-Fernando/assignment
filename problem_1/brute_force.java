import java.util.*;

class brute_force {

    public int singleNumber(int[] nums) {
        
        for (int i = 0; i < nums.length; i++) {
            //count occurrences of each element
            int count = 0;
            
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            
            if (count == 1) {
                return nums[i];
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
        
        brute_force obj = new brute_force();
        int result = obj.singleNumber(nums);
        
        System.out.println("Single number is: " + result);
        
        sc.close();
    }
}
