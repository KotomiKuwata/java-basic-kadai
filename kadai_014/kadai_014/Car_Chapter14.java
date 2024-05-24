package kadai_014;

public class Car_Chapter14 {
	private int gear = 1;
	private int speed = 10;
	
	public Car_Chapter14 () {
	}
	
	public void gearChange (final int afterGear) {
		this.gear = afterGear;
		if(afterGear >= 1 && afterGear <= 5) {
			this.speed = 10 * afterGear;
		}else {
			this.speed = 10;
		}
		System.out.println("ギアを" + afterGear + "速に切り替えました。");
	}
	public void run() {
			System.out.println("現在の時速は" + speed + "kmです。");
	}
}




/*
 車クラスを作成
ギアチェンジすると速度が変わる
素行した時に速度が表示される

車クラスのフィールド
private	int	gear	1速から5速のギアを表す	1
private	int	speed	ギアチェンジ後の速度を表す	10

車クラスのメソッド
public	void	gearChange	ギアの値により速度を変える	int afterGear
public	void	run	ギアチェンジ後の速度を表示する	無し

ギアに応じた速度
ギア	速度
1	時速10km
2	時速20km
3	時速30km
4	時速40km
5	時速50km
上記以外のギア	時速10km
*/