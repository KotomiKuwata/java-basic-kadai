package kadai_017;

public class KatoHanako_Chapter17 extends Kato_Chapter17{
	String givenName;
	public void setGivenName() {
		givenName = "花子";
	}
	public void eachIntroduce() {
		System.out.println("趣味は読書です");
	}
	public void commonIntroduce() {//共通の紹介を出力 住所　名前
		setGivenName();
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}
}
