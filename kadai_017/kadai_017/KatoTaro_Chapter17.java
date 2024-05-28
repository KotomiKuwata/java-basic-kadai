package kadai_017;

public class KatoTaro_Chapter17 extends Kato_Chapter17{
	String givenName;
	public void setGivenName() {
		 givenName = "太郎";
	}
	public void eachIntroduce() {
		System.out.println("私はJavaが得意です");
	}
	public void commonIntroduce() {//共通の紹介を出力 住所　名前
		setGivenName();
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}

}
