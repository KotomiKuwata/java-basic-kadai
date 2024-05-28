package kadai_017;

abstract public class Kato_Chapter17 { //親クラス
	String familyName = "加藤"; //性
	String givenName; //名
	String address = "東京都中野区〇×"; //住所
	
	public void commonIntroduce() {//共通の紹介を出力 住所　名前
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}
	abstract public void eachIntroduce(); // 個別の紹介を出力する　特技　好きな食べ　趣味
	public abstract void setGivenName();
	
	public void execIntroduce() { 
		commonIntroduce();
		setGivenName();
		eachIntroduce();
		
	}
	/*
	 紹介を実行する　execIntroduceメソッドをクラス内でオーバーライド
	 commonIntroduceと各メソッドの呼び出しをまとめる
	 */
}
