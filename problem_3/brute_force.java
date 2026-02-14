import java.util.*;

class brute_force {

    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        //length must match
        if (pattern.length() != words.length) {
            return false;
        }

        //check mapping manually
        for (int i = 0; i < pattern.length(); i++) {

            char ch = pattern.charAt(i);
            String word = words[i];

            // check forward mapping
            for (int j = 0; j < i; j++) {

                // if same letter appeared before
                if (pattern.charAt(j) == ch) {
                    if (!words[j].equals(word)) {
                        return false;
                    }
                }

                // if same word appeared before
                if (words[j].equals(word)) {
                    if (pattern.charAt(j) != ch) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter pattern: ");
        String pattern = sc.nextLine();

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        brute_force obj = new brute_force();
        boolean result = obj.wordPattern(pattern, s);

        System.out.println("Result: " + result);

        sc.close();
    }
}
