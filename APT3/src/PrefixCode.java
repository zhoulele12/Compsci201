public class PrefixCode {
    public String isOne(String[] words) {
        for (int i = 0; i < words.length; i++) {
            for (String word : words) {
                if (words[i] != word) {
                    if (word.startsWith(words[i])) {
                        return String.format("No, %d", i);
                    }
                }
            }
        }
        return "Yes";
    }
}