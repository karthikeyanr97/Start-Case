import java.util.Scanner;

public class StartCase extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the sentence:");
		String sentence = scanner.nextLine();

		String result = printCapitalized(sentence);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {
	public static String printCapitalized(String sentence) {

		String resSentence = "";

		for (int i = 0; i < sentence.length(); i++) {

			if (i == 0 && sentence.charAt(0) >= 'a' && sentence.charAt(0) <= 'z')
				resSentence += ((char) (sentence.charAt(0) - 32));
			else if (sentence.charAt(i) >= 'a' && sentence.charAt(i) <= 'z' && sentence.charAt(i - 1) == ' ')
				resSentence += ((char) (sentence.charAt(i) - 32));
			else
				resSentence += (sentence.charAt(i));
		}

		return resSentence;
	}
}