package kadai_018;


public class KatoTaro_Chapter18 extends Kato_Chapter18{
	
	public void setGivenName() {
		//親クラスのpublicセッターを呼んでgivenNameを設定する
		super.setGivenName("太郎");
	}
	
	//抽象メソッドを実装（太郎さんの個別紹介）
	@Override
	public void eachIntroduce() {
		System.out.println("Javaが得意です");
	}
}