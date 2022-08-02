package by.epam.tr.text;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sentence {

	private List<Word> words;

	{
		words = new ArrayList<Word>();
	}

	public Sentence() {

	}

	public Sentence(List<Word> words) {
		this.words.addAll(words);
	}

	public List<Word> getWords() {
		return words;
	}

	public void setWords(List<Word> words) {
		this.words = words;
	}

	public void add(Word word) {
		words.add(word);
	}

	public boolean add(int index, Word word) {
		if (index < 0 || index >= words.size()) {
			return false;
		}
		words.add(index, word);
		return true;
	}

	@Override
	public int hashCode() {
		return Objects.hash(words);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sentence other = (Sentence) obj;
		return Objects.equals(words, other.words);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [words=" + words + "]";
	}

}
