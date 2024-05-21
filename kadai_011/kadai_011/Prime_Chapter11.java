package kadai_011;

public class Prime_Chapter11 {
	public static void main(String[] args) {
		boolean[] primeNum = new boolean[101];
		for(int i = 0; i < primeNum.length; i++) { 
			primeNum[i] = true;
		}
		
		for (int i = 1; i <= 100; i++) {
			for (int j = 2; j < i; j++) {
				if ( i % j == 0) {
					primeNum[i] = false;
				}	
			}
		}
		
		for (int i = 2; i < primeNum.length; i++) {
		    if (primeNum[i]) {
			System.out.println(i);
			}
		}
	}
}


/*
100までの整数が、素数か判定するboolean型の配列を作成   
配列は0番目の要素から始まるので、便宜的に101個の要素を作成   
boolean型の配列の要素を、for文を使って繰り返し、trueで初期化

trueは素数であり、falseは素数でないと判定
falseの場合は次の数を最初から処理
*/