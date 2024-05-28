package kadai_020;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		Dictionary_Chapter20 dictionary = new Dictionary_Chapter20();
		
		String[] targetWords = {"apple", "banana", "grape", "orange"};
        for (String word : targetWords) {
            dictionary.checkAndTranslateWord(word);
        }
		
	}
}

/*
apple
banana
grape
orange
の4つの単語の意味を調べる

出力イメージ
appleの意味はりんご
bananaの意味はバナナ
grapeの意味はぶどう
orangeは辞書に存在しません
*/