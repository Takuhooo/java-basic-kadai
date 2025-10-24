package kadai_028;

import java.util.HashMap;

public class JyankenExec_Chapter28 {
	public static void main(String[] args) {
		//じゃんけんクラスのインスタンスを作成
		Jyanken_Chapter28 jyanken = new Jyanken_Chapter28();
		
		//ハッシュマップを作成
		HashMap<String, String> map = new HashMap<>();
		map.put("r", "グー");
		map.put("s", "チョキ");
		map.put("p", "パー");
		
		//自分のじゃんけんの手を入力
		String myChoice = jyanken.getMyChoice();
		
		//対戦相手の手を乱数で選ぶ
		String enemyChoice = jyanken.getRandom();
		
		//じゃんけんの結果を出力
		jyanken.playGame(myChoice, enemyChoice, map);
	}

}
