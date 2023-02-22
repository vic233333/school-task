package code_list_three;

public class SweetShop {
	public static void main(String[] args) {
		System.out.println("inside main");
		new Candy();
		System.out.println("After creating Candy");
		try {
			Class.forName("code_list_three.Gum");
			/*
			 * ��������Ľ�����Կ�����Class���������Ҫ��ʱ��ű����أ�static��ʼ�����������ʱ���е�
			 * ��forName()������Class���һ��static���������Ի�ȡClass��������ã����صľ���һ��Class���������
			 *	ʹ��forName��һ�������þ���:һ������forName()������ľͻᱻ���أ�static�־�ͻᱻ��ʼ����(��������һ��ʹ������.class����������)
			 * ��Class.forName()�ǻ�ȡClass�����һ�ַ������㻹����ͨ������Ķ��� �� ��ȡ Class����
			 * 		����:����.getClass�Ϳ����ˡ������������Object��һ����
			 * 
			 */
		} catch (ClassNotFoundException e) {
			System.out.println("not Gum");
		}
		System.out.println("After Class.forName(Gum)");
		new Cookie();
	}
}
class Candy {
	static {System.out.println("Loading Candy");}
}
class Gum {
	static {System.out.println("Loading Gum");}
}
class Cookie {
	static {System.out.println("Loading Cookie");}
}