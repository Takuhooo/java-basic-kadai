package kadai_018;

abstract public class Kato_Chapter18{
	private String familyName;
	private String givenName;
	private String address;
	
	//値を取得するメソッド（ゲッター）
	public String getFamilyName(){
		return this.familyName;
	}
	public String getGivenName(){
		return this.givenName;
	}
	public String getAddress(){
		return this.address;
	}
	
	//値を設定するメソッド（セッター）
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//共通の紹介を出力するメソッド（親クラス共通処理）
	public void commonIntroduce() {
		System.out.println("名前は" + this.familyName + this.givenName + "です");
		System.out.println("住所は" + this.address);
	}
	
	// 抽象メソッド（子クラスで必ず実装するメソッド）
	abstract public void eachIntroduce();
	
	//共通紹介＋個別紹介を順に実行するメソッド
	public void execIntroduce() {
		commonIntroduce(); //親クラスの共通処理を実行
		eachIntroduce(); //子クラスごとの実装（オーバーライドされたメソッド）が呼ばれる
		System.out.println(); //出力の区切り(空行)
	}
}
	