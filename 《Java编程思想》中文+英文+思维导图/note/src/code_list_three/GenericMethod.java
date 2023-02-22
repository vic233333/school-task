package code_list_three;

public class GenericMethod {
	public <T> void f(T t) {	//�ڷ���ֵ֮ǰ���� ���Ͳ����б�� ����
		System.out.println(t.getClass().getName());
	}
	public static void main(String[] args) {
		GenericMethod genericMethod = new GenericMethod();
		genericMethod.f(1);
		genericMethod.f("A");
		genericMethod.f(1.0f);
	}
	/*
	 * �����Ͳ����ƶ� : ʹ�÷���������ڴ��������ʱ��ָ���������ͣ�����ʹ�÷��ͷ���ʱ��ͨ������ָ���������͡���Ϊ��������������ҳ���������ͣ���� ���Ͳ����ƶ�
	 */
}
//��ϰ:ʹf()���Խ����������͸�����ͬ�Ĳ���
class GenericMethodB {
	public <A,B,C> void f(A a,B b,C c) {
		System.out.println(a.getClass().getName());
		System.out.println(b.getClass().getName());
		System.out.println(c.getClass().getName());
	}
	public static void main(String[] args) {
		GenericMethodB genericMethodB = new GenericMethodB();
		genericMethodB.f(1, "v", 1.3f);
	}
}
//��ϰ:��ǰһ�����һ�������޸�Ϊ�ǲ��������͵�
class GenericMethodC {
	public <A,B> void f(A a,B b,String s) {
		System.out.println(a.getClass().getName());
		System.out.println(b.getClass().getName());
		System.out.println(s.getClass().getName());
	}
	public static void main(String[] args) {
		GenericMethodC genericMethodC = new GenericMethodC();
		genericMethodC.f(1, 1.3f,"A");
	}
}