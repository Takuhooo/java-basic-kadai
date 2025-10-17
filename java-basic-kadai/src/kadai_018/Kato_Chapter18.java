package kadai_018;

abstract public class Kato_Chapter18{
	public String familyName = "加藤";
	public String givenName = "";
	public String address = "東京都中野区○×";

	// 共通の紹介を出力するメソッド
    public void commonIntroduce() {
        System.out.println("名前は" + this.familyName + this.givenName + "です");
        System.out.println("住所は" + this.address);
    }
    
	// 抽象メソッド（子クラスで必ず実装するメソッド）
	abstract public void eachIntroduce();
	
	//紹介を実行するメソッド
	public void execIntroduce() {
		this.commonIntroduce();   // 共通紹介
		this.eachIntroduce();     // 個別紹介
        System.out.println(); // 改行（区切り）
	}
}
	