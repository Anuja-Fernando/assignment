import java.util.*;

class optimal {

    public String removeKdigits(String num, int k) {

        if (k >= num.length()) {
            return "0";
        }

        Stack<Character> stack = new Stack<>();

        for (char digit : num.toCharArray()) {

            // Remove larger digits from stack if current digit is smaller
            while (!stack.isEmpty() && k > 0 && stack.peek() > digit) {
                stack.pop();
                k--;
            }

            stack.push(digit);
        }

        // If k still remains, remove from end
        while (k > 0) {
            stack.pop();
            k--;
        }

        // Build result from stack
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        // Remove leading zeros
        while (result.length() > 1 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        String num = sc.nextLine();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        optimal obj = new optimal();
        String result = obj.removeKdigits(num, k);

        System.out.println("Smallest number after removing " + k + " digits: " + result);

        sc.close();
    }
}
