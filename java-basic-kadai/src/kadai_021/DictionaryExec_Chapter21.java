package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		//辞書クラスのインスタンス作成
		Dictionary_Chapter21 dict = new Dictionary_Chapter21();
		
		//調べたい英単語を配列にセットする
		String[] wordsToCheck = {"apple","banana","grape","orange"};
		
		//配列の数だけ繰り返し、辞書を調べる
		for(String word : wordsToCheck) {
			//辞書にその単語があるか確認
			if(dict.contains(word)) {
				//存在するなら意味を取り出して表示
				System.out.println(word + "の意味は" + dict.getMeaning(word));
			} else {
				//存在しないなら存在しない旨を表示
				System.out.println(word + "は辞書に存在しません");
			}
		}
	}
}
