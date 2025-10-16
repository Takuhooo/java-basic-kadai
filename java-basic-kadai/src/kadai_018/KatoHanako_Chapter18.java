package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18 {

    // 名を設定する（花子に固定）
    @Override
    public void setGivenName() {
        givenName = "花子";
    }

    // 個別紹介
    @Override
    public void eachIntroduce() {
        System.out.println("趣味は読書です");
    }
}
