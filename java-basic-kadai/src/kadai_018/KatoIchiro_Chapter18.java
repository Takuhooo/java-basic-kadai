package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {

    // 名を設定する（一郎に固定）
    @Override
    public void setGivenName() {
        givenName = "一郎";
    }

    // 個別紹介
    @Override
    public void eachIntroduce() {
        System.out.println("好きな食べ物はリンゴです");
    }
}
