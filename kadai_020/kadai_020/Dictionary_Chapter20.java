package kadai_020;

import java.util.HashMap;

public class Dictionary_Chapter20 {
	HashMap<String,String> dictionaryMap = new HashMap<String,String>();
	public  Dictionary_Chapter20() {
		dictionaryMap.put("apple", "りんご");
		dictionaryMap.put("peach", "桃");
		dictionaryMap.put("banana", "バナナ");
		dictionaryMap.put("lemon", "レモン");
		dictionaryMap.put("pear", "梨");
		dictionaryMap.put("kiwi", "キウィ");
		dictionaryMap.put("strawberry", "いちご");
		dictionaryMap.put("grape", "ぶどう");
		dictionaryMap.put("muscat", "マスカット");
		dictionaryMap.put("cherry", "さくらんぼ");
	}
	public void checkAndTranslateWord(String targetWord) {
		if (dictionaryMap.containsKey(targetWord)) {
            String translation = dictionaryMap.get(targetWord);
            System.out.println(targetWord + " の意味は " + translation + " です。");
        } else {
            System.out.println(targetWord + " は辞書に含まれていません。");
        }
    }
}

