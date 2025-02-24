package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
	 * 【概要】ローカル変数として宣言と初期化し、代入を行う処理
	 * 【詳細】バイト型・短整数型・整数型・長整数型・単精度浮動小数点数型・倍精度浮動小数点型・文字型・文字列型・ブーリアン型
	 */
	        // バイト型の宣言と初期化
			byte myByte;
			myByte = 0;
			
			// 短整数型の宣言と初期化
	        short numshort;
	        numshort = 0;
	        
	        // 整数型の宣言と初期化
	        int num;
	        num = 0;
	        
	        // 長整数型の宣言と初期化
	        long numlong;
	        numlong = 0L;
	        
	        // 単精度浮動小数点数型の宣言と初期化
	        float numfloat;
	        numfloat = 0.0f;
	        
	        // 倍精度浮動小数点数型の宣言と初期化
	        double numdouble;
	       numdouble = 0.0;
	        
	        // 文字型の宣言と初期化
	        char numchar;
	        numchar =  'a';
	        
	        // 文字列型の宣言と初期化
	        String text;
	        text = "Hello";
	        
	        // ブーリアン型の宣言と初期化
	        boolean isTrue;
	        isTrue = true;
	        
	        // バイト型に10を代入
	        myByte = 10;
	        
	        // 短整数型に100を代入
	        numshort = 100;
	        
	        // 整数型に1000を代入
	        num = 1000;
	        
	        // 長整数型に10000を代入
	        numlong = 10000L;
	        
	        // 単精度浮動小数点数型に9.5を代入
	        numfloat = 9.5f;
	        
	        // 倍精度浮動小数点数型に10.5を代入
	        numdouble = 10.5;
	        
	        // 文字型にaを代入
	        numchar = 'a';
	        
	        // 文字列型にハローを代入
	        text = "ハロー";
	        
	        //ブーリアン型にtrueを代入
	        isTrue = true ;
	
	        
/*
 * 【概要】変数代入処理
 * 【詳細】上記で作成した変数を用い、計算後の値をコンソール出力する
 * */
	        // 11110
	        System.out.println( numlong + num + numshort + myByte );
	        
	        // 20
	        System.out.println( myByte + myByte);
	        
	        // aハロー
	        System.out.println( numchar + text + isTrue );
	        
	        // 11130
	        System.out.println( myByte + numshort + num + numlong + numfloat + numdouble );
	        
	        // 10000000000
	        System.out.println( myByte * numshort * num * numlong );
	        
	        // 0.105
	        System.out.println( numdouble / 100 );
	        
	        // -90
	        System.out.println( myByte - 100 );
	        	
	     // ✅ 追加: mondai5() メソッドを呼び出す
			mondai5();}

	    public static void mondai5() {
	    	System.out.println();
/*【概要】デバック処理
 *【詳細】「ハローJAVA43」と表示されるよう修正する
 */
	    	String num="20"; // 文字列の20
	    	int num1=23;// 整数の23
	    	// 現在の処理は文字列の連携になっている
	    	// System.out.println("ハローJAVA"+(num+num1));	
	    	
	    	// 文字列numを整数intに変換して、計算をする
	    	int numInt = Integer.parseInt(num);
	    	System.out.println("ハローJAVA" + (numInt + num1));

	    	// ✅ 追加: mondai6() メソッドを呼び出す
	    	mondai6();}
	    
	    public static void mondai6() {
	    	System.out.println();
/*【概要】変数代入処理
 *【詳細】formatの通りコンソールに出力する
 *     山田太郎　18歳　170.5㎝　62.2㎏　寿司
 */
	    	//formatを代数に代入
	    	String text = "山田太郎";
	    	int age = 18;
	    	float height = 170.5f;
	    	float weight = 62.2f;
	    	String food = "寿司";
	    	
	    	// 始めまして○○です
	    	System.out.println("初めまして" + text +"です");
	    	
	    	// 年齢は○○歳です
	    	System.out.println("年齢は" + age + "です");
	    	
	    	// 身長は○○cmです
	    	System.out.println("身長は" + height + "です");
	    	
	    	// 体重は○○kgです
	    	System.out.println("体重は" + weight + "です");
	    	
	    	// 好きな食べ物は○○です
	    	System.out.println("好きな食べ物は" +  food + "です");
	    	
/*
 * 【概要】formatにBMIを追加
 */
	    	System.out.println();
	    	// 身長をメートルに変更
	    	float heightM =  height/100;
	    	
	    	// BMi計算
	    	float BMI = weight/ (heightM*heightM);
	    	System.out.printf("BMIは %.1f です%n", BMI);
	    	
/*
 * 【概要】再代入処理
 * 【詳細】上記の代数に再代入しコンソール出力する
 * 　　　　鈴木一郎　24歳　168.5㎝　64.2㎏　オムライス　22.6
 */
	    	System.out.println();
	    	// 代数に再代入
	    	text = "鈴木一郎";
	    	age = 24;
	    	height = 168.5f;
	    	weight = 64.2f;
	    	food = "オムライス";
	    	heightM = height/100;
	    	BMI = weight/ (heightM*heightM);
	    	
	    	// 始めまして○○です
	    	System.out.println("初めまして" + text +"です");
	    	
	    	// 年齢は○○歳です
	    	System.out.println("年齢は" + age + "です");
	    	
	    	// 身長は○○cmです
	    	System.out.println("身長は" + height + "です");
	    	
	    	// 体重は○○kgです
	    	System.out.println("体重は" + weight + "です");
	    	
	    	// 好きな食べ物は○○です
	    	System.out.println("好きな食べ物は" +  food + "です");
	    	
	    	// BMIは○○です
	    	System.out.printf("BMIは %.1f です%n", BMI);
	    	
/*【概要】自己代入処理
 *【詳細】上記の変数【年齢・身長・体重】の数値を和算で自己代入し、コンソール出力する
 */
	    	System.out.println();
	    	// 年齢・身長・体重を和算で自己代入
	    	age += age;
	        height += height;
	        weight += weight;
	        
	        // 初めまして○○です
	    	System.out.println("初めまして" + text +"です");
	    	
	    	// 年齢は○○歳です
	    	System.out.println("年齢は" + age + "です");
	    	
	    	// 身長は○○cmです
	    	System.out.println("身長は" + height + "です");
	    	
	    	// 体重は○○kgです
	    	System.out.println("体重は" + weight + "です");
	    	
	    	// 好きな食べ物は○○です
	    	System.out.println("好きな食べ物は" +  food + "です");
	    	
	    	// BMIは○○です
	    	System.out.printf("BMIは %.2f です%n", BMI);
	    	
/*【概要】比較演算処理
 *【詳細】年齢が２５歳以上ならtrueが出力されるようにする
 */
	    	System.out.println();
	    	// age の自己代入前の値（24）を変数に保存
	    	int originalAge = 24; 
	    	System.out.println(originalAge >= 25);

/*【概要】文字列型変換処理
 *【詳細】【年齢・身長・体重】を文字列型に型変換し繋げて出力する 
 */
	    	System.out.println();
	    	// 変数の定義（自己代入前の状態）
	    	age = 24;
	    	height = 168.5f;
	    	weight = 64.2f;
	    	
	    	// 数値を文字列に変換
	    	String ageStr = String.valueOf(age);
	    	String heightStr = String.valueOf(height);
	    	String weightStr = String.valueOf(weight);
	    	
	    	// 文字列を連結して出力
	    	System.out.println("年齢・身長・体重：" + ageStr + "歳 " + heightStr + "cm " + weightStr + "kg");
	    	
/*【概要】整数型変換処理
 *【詳細】変換した【年齢・身長】を整数型に変換して出力する
 */
	    	System.out.println();
	    	// 文字列型の年齢と身長
	        ageStr = "24";      // 年齢（整数）
	        heightStr = "168.5"; // 身長（小数）
	        
	        // 文字列 → 整数型（int）に変換
	        int ageInt = Integer.parseInt(ageStr);

	        // 文字列 → 小数型（double）に変換
	        double heightDouble = Double.parseDouble(heightStr);
	        
	        // 出力（年齢は整数、身長は小数点1桁まで表示）
	        System.out.println("年齢: " + ageInt + "歳");
	        System.out.printf("身長: %.1fcm%n", heightDouble); 
	        
/*【概要】比較演算処理
 *【詳細】変換した年齢・身長で年齢が25もしくは身長が160以上であればtrueを出力されるようにする
 */
	        System.out.println();
	    	//年齢が25以上 or 身長が160以上」で true を出力
	        System.out.println(ageInt == 25 || heightDouble >= 160);
	    	
	    	
	    }}



