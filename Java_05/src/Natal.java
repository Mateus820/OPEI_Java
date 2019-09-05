import java.util.Scanner;

public class Natal {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int letterCount;
        String text;
        String word;

        System.out.print("Type a word: ");
        word = sc.nextLine();

        System.out.print("Text Lenght: ");
        letterCount = sc.nextInt();
        System.out.print("Type a random text: ");
        text = sc.next();

        char[] wordLetter = word.toCharArray();
        int[] wordValues = new int[word.length()];

        char[] letters = text.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < wordLetter.length; j++) {
                if(wordLetter[j] == letters[i]){
                    wordValues[j]++;
                }
            }
        }
    }
}
