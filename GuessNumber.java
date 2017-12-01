import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		//系统产生一个随机数给用户猜
		//Math.random() 产生一个[0,1)之间的double类型的随机数，
		//(int)是强制类型转换为int整型，  (random()*100)+1范围变成[1,101)，实际范围是[1,100]
		int number = (int) (Math.random() *100) + 1;  
		//System.out.println(guessNumber);
		
		//给出多次猜的机会，猜中就结束（break）
		while(true){
		//获取用户输入数据
		System.out.print("请输入猜的数字：");
		Scanner sc=new Scanner(System.in);
		int guessNumber = sc.nextInt();
		//System.out.println(guessNumber);
		if(guessNumber > number){
			System.out.println("你猜的数字"+guessNumber+"大了");
		}
		if(guessNumber < number){
			System.out.println("你猜的数字"+guessNumber+"小了");
		}
		if(guessNumber == number){
			System.out.println("猜对了！数字就是"+guessNumber);
			break;
		}
	}
	}

}
