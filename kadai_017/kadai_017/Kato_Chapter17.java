package kadai_017;

abstract public class Kato_Chapter17 { //親クラス
	String familyName; //性
	String givenName; //名
	String address; //住所
	
	public void commonIntroduce() {//共通の紹介を出力 住所　名前
		familyName =  "加藤";
		address = "東京都中野区〇×";
	}
	abstract public void eachIntroduce(); // 個別の紹介を出力する　特技　好きな食べ　趣味
	public abstract void setGivenName();
	
	public void execIntroduce() { //紹介を実行する
		commonIntroduce();
		setGivenName();
		eachIntroduce();
		
	}
}
