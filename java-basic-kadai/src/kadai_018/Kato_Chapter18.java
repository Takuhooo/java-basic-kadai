package kadai_018;

abstract public class Kato_Chapter18{
	public String familyName;
	public String givenName;
	public String address;

	// 共通の紹介を出力するメソッド
    public void commonIntroduce() {
        System.out.println("名前は" + familyName + givenName + "です");
        System.out.println("住所は" + address);
    }
    
	// 抽象メソッド（子クラスで必ず実装するメソッド）
	abstract public void eachIntroduce();
	
	//紹介を実行するメソッド
	public void execIntroduce() {
        setFamilyName();     // 姓の設定
        setGivenName();      // 名の設定（子クラスで実装）
        setAddress();        // 住所の設定
        commonIntroduce();   // 共通紹介
        eachIntroduce();     // 個別紹介
        System.out.println(); // 改行（区切り）
	}
	
	//性を設定する（共通なので親で実装）
	public void setFamilyName() {
		familyName = "加藤";
	}
	
	//名を設定する（子クラスで実装するため中身は空）
	public void setGivenName(){};
	
	//住所を設定する（共通なので親で実装）
	public void setAddress() {
		address = "東京都中野区○×です";
	}
}
	