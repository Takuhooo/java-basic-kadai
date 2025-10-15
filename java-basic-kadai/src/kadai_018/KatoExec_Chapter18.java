package kadai_018;

public class KatoExec_Chapter18 {

    public static void main(String[] args) {

        // --- 太郎さんを準備して紹介 ---
        KatoTaro_Chapter18 taro = new KatoTaro_Chapter18(); // オブジェクト生成
        taro.setFamilyName("加藤");                         // 姓をセット（親のセッターを利用）
        taro.setGivenName("太郎");                               // 太郎（子クラスの setGivenName() が親のセッターを呼ぶ）
        taro.setAddress("東京都中野区〇×です");             // 住所をセット
        taro.execIntroduce();                              // 出力（共通＋個別）

        // --- 一郎さん ---
        KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
        ichiro.setFamilyName("加藤");
        ichiro.setGivenName("一郎");
        ichiro.setAddress("東京都中野区〇×です");
        ichiro.execIntroduce();

        // --- 花子さん ---
        KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
        hanako.setFamilyName("加藤");
        hanako.setGivenName("花子");
        hanako.setAddress("東京都中野区〇×です");
        hanako.execIntroduce();
    }
}
