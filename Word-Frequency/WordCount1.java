import java.util.HashMap;

public class WordCount1 {
    public static void main(String[] args) {
        // using hashmap
        // time complexity = O(n)
        System.out.println("---Wordcount using HashMap---");

        String str = "the quick brown fox jumps over the lazy dog";
        System.out.println("The sentence is : " + str);

        String[] strArr = str.split(" ");
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        for (String curWord : strArr) {
            if (wordCountMap.containsKey(curWord)) {
                int prevValue = wordCountMap.get(curWord);
                wordCountMap.put(curWord, prevValue + 1);
            } else {
                wordCountMap.put(curWord, 1);
            }
        }
        int max = 0;
        String ans = "";
        for (String key : wordCountMap.keySet()) {
            int freq = wordCountMap.get(key);
            if (freq > max) {
                max = freq;
                ans = key;
            }
        }
        System.out.println("The word that appeared maximum number of times is : " + ans);
    }
}
