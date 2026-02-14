import java.util.Scanner;

class brute_force {

    public String removeKdigits(String num, int k) {
        
        if (k >= num.length()) {
            return "0";
        }
        
        String current = num;
        
        for (int i = 0; i < k; i++) {
            
            String smallest = null;
            
            // removing one digit at a time and checking the smallest result
            for (int j = 0; j < current.length(); j++) {
                
                String candidate = current.substring(0, j) 
                                 + current.substring(j + 1);
                
                // remove leading zeros
                candidate = removeLeadingZeros(candidate);
                
                if (smallest == null || 
                    compare(candidate, smallest) < 0) {
                    smallest = candidate;
                }
            }
            
            current = smallest;
        }
        
        return current.length() == 0 ? "0" : current;
    }
    
    // remove leading zeros
    private String removeLeadingZeros(String s) {
        int i = 0;
        while (i < s.length() - 1 && s.charAt(i) == '0') {
            i++;
        }
        return s.substring(i);
    }
    
    // compare two numeric strings
    private int compare(String a, String b) {
        if (a.length() != b.length()) {
            return a.length() - b.length();
        }
        return a.compareTo(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        String num = sc.nextLine();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        brute_force obj = new brute_force();
        String result = obj.removeKdigits(num, k);

        System.out.println("Smallest number after removing " + k + " digits: " + result);

        sc.close();
    }
}
