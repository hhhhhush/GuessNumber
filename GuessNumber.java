import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		//ϵͳ����һ����������û���
		//Math.random() ����һ��[0,1)֮���double���͵��������
		//(int)��ǿ������ת��Ϊint���ͣ�  (random()*100)+1��Χ���[1,101)��ʵ�ʷ�Χ��[1,100]
		int number = (int) (Math.random() *100) + 1;  
		//System.out.println(guessNumber);
		
		//������βµĻ��ᣬ���оͽ�����break��
		while(true){
		//��ȡ�û���������
		System.out.print("������µ����֣�");
		Scanner sc=new Scanner(System.in);
		int guessNumber = sc.nextInt();
		//System.out.println(guessNumber);
		if(guessNumber > number){
			System.out.println("��µ�����"+guessNumber+"����");
		}
		if(guessNumber < number){
			System.out.println("��µ�����"+guessNumber+"С��");
		}
		if(guessNumber == number){
			System.out.println("�¶��ˣ����־���"+guessNumber);
			break;
		}
	}
	}

}
