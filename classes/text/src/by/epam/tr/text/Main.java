package by.epam.tr.text;

public class Main {

	public static void main(String[] args) {

		Text text = new Text();

		Word w1 = new Word("aaaa");
		Word w2 = new Word("bbbb");

		Sentence sentence1 = new Sentence();
		Sentence sentence2 = new Sentence();

		sentence1.add(w1);
		sentence1.add(w2);
		sentence1.add(new Word("ccc"));
		sentence2.add(new Word("ddd"));
		sentence2.add(new Word("eee"));
		sentence2.add(new Word("fff"));

		text.setTitle("Alphabet");
		text.add(sentence1);
		text.add(sentence2);

		TextPrinter printer = new TextPrinter();
		printer.printToConsole(text);

	}

}
