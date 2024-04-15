public class WordCount2 {

    public static void main(String[] args) {
        // the quick brown fox jumps over the lazy dog
        // output = the
        // using Bubble sort
        // time complexity = O(n^2)
        System.out.println("---Wordcount using Bubble Sort---");

        String str = "the quick brown fox jumps over the lazy dog";
        System.out.println("The sentence is : " + str);
        String[] strArr = str.split(" ");

        int max = 0;
        String ans = "";

        for (String word : strArr) {
            int count = 0;
            for (String curWord : strArr) {
                if (curWord.equals(word))
                    count++;
            }
            if (count > max) {
                max = count;
                ans = word;
            }
        }
        System.out.println("The word that appeared maximum number of times is : " + ans);
    }
}
