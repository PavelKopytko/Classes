package by.epam.tr.text;

import java.util.ArrayList;
import java.util.List;

public class Text {

	private String title;
	private List<Sentence> sentences;

	{
		sentences = new ArrayList<Sentence>();
	}

	public Text() {

	}

	public Text(String title, List<Sentence> sentences) {
		this.title = title;
		sentences.addAll(sentences);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Sentence> getSentences() {
		return sentences;
	}

	public void setSentences(List<Sentence> sentences) {
		this.sentences = sentences;
	}

	public boolean add(Sentence sentence) {
		sentences.add(sentence);
		return true;
	}

}
