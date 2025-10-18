package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
		
		//フィールド（キー＝英単語, 値＝意味）
		private HashMap<String,String> dictionary = new HashMap<>();
		
		//コンストラクタ：インスタンス作成時に辞書に10語を登録する
		public Dictionary_Chapter21() {
		dictionary.put("apple","りんご");
		dictionary.put("peach","桃");
		dictionary.put("banana","バナナ");
		dictionary.put("lemon","レモン");
		dictionary.put("pear","梨");
		dictionary.put("kiwi","キウイ");
		dictionary.put("strawberry","いちご");
		dictionary.put("grape","ぶどう");
		dictionary.put("muscat","マスカット");
		dictionary.put("cherry","さくらんぼ");
	}
		
		//辞書に指定の英単語があるかを返す（true:存在する/false:存在しない）
		public boolean contains(String englishWord) {
			return dictionary.containsKey(englishWord);
		}
		
		//指定の英単語の意味を返す（存在しなければnullを返す）
		public String getMeaning(String englishWord) {
	        return dictionary.get(englishWord);
		}
}
