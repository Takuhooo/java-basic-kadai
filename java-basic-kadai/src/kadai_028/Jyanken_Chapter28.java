package kadai_028;
import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	//自分のジャンケンの手を入力する
	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);
		String input = "";
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		while(true) {
			input = scanner.next();
			input = input.toLowerCase();
			
			if (input.equals("r") || input.equals("s") || input.equals("p")) {
				break;
			} else {
				System.out.println("入力が正しくありません。r,s,pのいずれかを入力してください");
			}
		}
		
		scanner.close();
		return input;
	}
		
	//対戦相手のじゃんけんの手を乱数で選ぶ
		public String getRandom() {
			int index = (int) Math.floor(Math.random() * 3);
			
			String[] choices = { "r", "s", "p" };
			return choices[index];
		}
		
	//じゃんけんを行う
		public void playGame(String myChoice, String enemyChoice, HashMap<String, String> map) {
			String myName = map.get(myChoice);
			String enemyName = map.get(enemyChoice);
			
			System.out.println("自分の手は" + myName + "対戦相手の手は" + enemyName);
			
			//勝敗判定
			if(myChoice.equals(enemyChoice)) {
				System.out.println("あいこです");
				return;
			}
			
			boolean myWin = false;
			
			if(myChoice.equals("r") && enemyChoice.equals("s")) {
				myWin = true;
			} else if(myChoice.equals("s") && enemyChoice.equals("p")) {
				myWin = true;
			} else if(myChoice.equals("p") && enemyChoice.equals("r")) {
				myWin = true;
			}
			
			if(myWin) {
				System.out.println("自分の勝ちです");
			} else {
				System.out.println("自分の負けです");
			}
		}
	}

