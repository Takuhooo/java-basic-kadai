package kadai_015;

public class Car_Chapter15 {
	
	private int gear = 1;
	private int speed = 10;
	
	//ギアチェンジして速度を変更するメソッド
	public void changeGear(int afterGear) {
		gear = afterGear;
		
		//ギアに応じて速度をセット
		switch(gear) {
		case 1: speed = 10; break;
		case 2: speed = 20; break;
		case 3: speed = 30; break;
		case 4: speed = 40; break;
		case 5: speed = 50; break;
		default: speed = 10; break;
		}
	}
	
	//走行速度を表示するメソッド
	public void run() {
		System.out.println("ギア" + gear + "に切り替えました");
		System.out.println("速度は時速" + speed + "kmです");
	}
}
