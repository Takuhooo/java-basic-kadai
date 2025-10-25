package kadai_028;

public class JyankenExec_Chapter28 {
	public static void main(String[] args) {
		// じゃんけんクラスのインスタンスを作成する
		Jyanken_Chapter28 jyanken = new Jyanken_Chapter28();

		// 自分のじゃんけんの手を入力する
		String myChoice = jyanken.getMyChoice();

		// 対戦相手のじゃんけんの手が乱数で選ばれる
		String random = jyanken.getRandom();

		// じゃんけんを行う
		jyanken.playGame(myChoice, random);
	}
}