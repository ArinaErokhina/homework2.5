import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(6, 9, 11, 45, 3, 44, 22));
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                System.out.print(nums.get(i) + " ");
            }
        }

        List<Integer> num = new ArrayList<>(List.of(1, 1, 8, 3, 4, 4, 5, 5, 2, 7));
        Set<Integer> number = new HashSet<>();
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) % 2 == 0) {
                number.add(num.get(i));
            }
        }
        System.out.println(number + " ");

        List<String> word = new ArrayList<>(List.of("dog", "cat", "dog", "mouse"));
        Set<String> words = new HashSet<>();
        for (int i = 0; i < word.size(); i++) {
            words.add(word.get(i));
        }
        System.out.println(words);

        List<String> wordS = new ArrayList<>(List.of("dog", "cat", "dog", "mouse"));
        int resultWord = Collections.frequency(wordS, "dog" );
        System.out.println(resultWord);

    }}