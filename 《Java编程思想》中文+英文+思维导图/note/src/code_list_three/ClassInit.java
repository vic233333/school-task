package code_list_three;

public class ClassInit {
	public static void main(String[] args) {
		//ִ����.class��Init1�ಢû�г�ʼ��
		Class cs = Init1.class;
		//���һ��static finalֵ��һ��"����������"����ô��ȡ��ֵ������Ҫ�����ʼ��
		System.out.println(Init1.staticFinal);
		System.out.println("---1----");
		//���Ǿ��Ǹ�����static final���������ֵ������"����������"�����ʸ�ֵ����Ҫ�Ը�����г�ʼ��
		System.out.println(Init1.staticFinal2);
		System.out.println("---2----");
		//����static��Ҫ�Ը�����г�ʼ�����ȳ�ʼ������� �ڳ�ʼ����
		System.out.println(Init2.staticNotFinal);
		System.out.println("---3----");
		try {
			//ʹ��forName()����ȡClass������Ҫ�Ը�����г�ʼ����
			Class c = Class.forName("code_list_three.Init3");
			System.out.println(Init3.staticNotFinal);
		} catch (ClassNotFoundException e) {
			System.out.println("û�������");
		}
	}
}
class Intt {int i = 2;}
class Init1 {
	static final int staticFinal = 47;
	static final int staticFinal2 = (new Intt()).i;
	static {
		System.out.println("Init1");
	}
}
class Init2 {
	static int staticNotFinal = 147;
	static {
		System.out.println("Init2");
	}
}
class Init3 {
	static int staticNotFinal = 74;
	static {
		System.out.println("Init3");
	}
}