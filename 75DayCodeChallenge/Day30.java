import java.util.Scanner;

public class Day30 {
    public static void main(String[] args) {

        System.out.print("Enter a String : ");
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.next();
            System.out.println("Inputed String is : " + str);
            countVowels(str);
        }
    }

    private static void countVowels(String str) {
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                ++vowelCount;
            } else {
                ++consonantCount;
            }
        }
        System.out.println("Vowel Count in the Inputed String  = " + vowelCount);
        System.out.println("Consonant Count in the Inputed String  = " + consonantCount);
    }

    private static boolean isVowel(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
    }
}
