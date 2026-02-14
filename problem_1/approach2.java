import java.util.*;

class approach2 {

    public int singleNumber(int[] nums) {
        
        int result = 0;
        
        //perform xor to cancel out duplicate numbers, leaving only the single number
        for (int num : nums) {
            result = result ^ num;   
        }
        
        return result;
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
        
        approach2 obj = new approach2();
        int result = obj.singleNumber(nums);
        
        System.out.println("Single number is: " + result);
        
        sc.close();
    }
}
