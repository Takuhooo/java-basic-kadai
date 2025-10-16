package kadai_018;


public class KatoTaro_Chapter18 extends Kato_Chapter18{
	
	//名を設定する
	@Override
	public void setGivenName() {
		givenName = "太郎";
	}
	
	//個別紹介
	@Override
	public void eachIntroduce() {
		System.out.println("Javaが得意です");
	}
}