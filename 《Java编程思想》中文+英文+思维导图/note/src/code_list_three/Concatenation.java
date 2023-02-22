package code_list_three;

import java.util.Random;

public class Concatenation {
	public static void main(String[] args) {
		String mango = "mango";
		String s = "abc" + mango + "def" + 37;
		System.out.println(s);
		/*
		 * ����δ���������������
		 *   ���������Զ�������StringBuilder�ࡣ��Ȼ����û����Դ����ʹ��StrinBuilder�࣬���Ǳ�����ȴ�������ŵ�ʹ����������Ϊ���ܸ�Ч
		 * 	
		 * ������������У�
		 * 	  ���������Զ��Ĵ���һ��StringBuilder�������Թ������յ�String�ַ�������Ϊÿ���ַ�������һ��StringBuilder��append()���������յ���toString���������ظ�������
		 * 
		 */
	}
}
//���������ַ�ʽ����һ��String����
class WhitherStringBulder {
	
	//��һ����ʹ��+���������� ƴ�ӳ�һ���µ� �ַ���
	public String implicit(String[] strArr) {
		String res = "";
		for (int i = 0; i < strArr.length; i++) {
			res += strArr[i];
			//�����ʹ������ѭ���Ļ����������ͻ���㴴���ܶ��StringBuilder��һ��ѭ�����㴴��һ��StringBuilder����
		}
		return res;
	}
	
	//�ڶ����Ǵ���һ��StringBuilder����Ȼ��ʹ�øö����API����ƴ���µ��ַ���
	public String explicit(String[] strArr) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < strArr.length; i++) {
			sb.append(strArr[i]);//ʹ������StringBuilder��API�������ַ��������ӵĻ��Ͳ�����㴴���ܶ�����Ի���㴴��һ������
		}
		return sb.toString();
	}
}
/*
 * ����Ϊһ�����дtoString()����ʱ������ַ��������Ƚϼ򵥣��ǾͿ�������������������Ϊ�����ع������յĽ�������ǣ��������toString()��ʹ��ѭ����
 * ��ô����Լ�����һ��StringBuilder����������������
 */
class UsingStringBuiler {
	public static Random rand = new Random(47); 
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < 25; i++) {
			sb.append(rand.nextInt(100));
			sb.append(",");
		}
		sb.delete(sb.length() - 3, sb.length());
		sb.append("]");
		return sb.toString();
	}
	public static void main(String[] args) {
		UsingStringBuiler usingStringBuiler = new UsingStringBuiler();
		System.out.println(usingStringBuiler.toString());
	}
}

