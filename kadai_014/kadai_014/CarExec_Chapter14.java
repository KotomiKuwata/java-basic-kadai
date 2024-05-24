package kadai_014;

public class CarExec_Chapter14 {

	public static void main(String[] args) {
		Car_Chapter14 gear = new Car_Chapter14(1,10);
		int afterGear = 3;
		gear.gearChange(afterGear);
		gear.run();
	}

}





/*
車クラスを実行する
車クラスのインスタンスを作る
車クラスのgearChangeメソッドを実行する

課題ではギアは３とする
車クラスのgearChange引数は３
*/
