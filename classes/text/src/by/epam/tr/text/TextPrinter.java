package by.epam.tr.text;

public class TextPrinter {

	public void printToConsole(Text text) {

		System.out.printf("\t %s\n\n", text.getTitle().toUpperCase());

		for (Sentence sentence : text.getSentences()) {
			System.out.print(getWords(sentence));

		}

	}

	private String getWords(Sentence sentence) {
		StringBuilder builder = new StringBuilder();

		for (Word w : sentence.getWords()) {
			builder.append(w.getWord()).append(" ");
		}
		builder.replace(builder.length() - 1, builder.length(), ". ");

		return builder.toString();

	}

}
