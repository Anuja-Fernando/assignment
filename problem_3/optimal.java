import java.util.*;

class optimal {

    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        Map<Character, String> letterToWord = new HashMap<>();
        Map<String, Character> wordToLetter = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {

            char ch = pattern.charAt(i);
            String word = words[i];

            // check letter tp word mapping
            if (letterToWord.containsKey(ch)) {
                if (!letterToWord.get(ch).equals(word)) {
                    return false;
                }
            } else {
                letterToWord.put(ch, word);
            }

            // check word to letter mapping
            if (wordToLetter.containsKey(word)) {
                if (wordToLetter.get(word) != ch) {
                    return false;
                }
            } else {
                wordToLetter.put(word, ch);
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

        optimal obj = new optimal();
        boolean result = obj.wordPattern(pattern, s);

        System.out.println("Result: " + result);

        sc.close();
    }
}
