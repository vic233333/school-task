package code_list_two;

public class AnonymousConstructor {
	public static Base getBase(int i) {
		return new Base(i) {  //������new Base(i){}���Ὣi��ֵ���ݸ�����Ĺ�����
			/*
			 * ����һ���̳�Base����������,���ﴫ��һ��i����������Ĳ���������i������Ҫ����Ϊfinal����Ϊ�����i�����Ǹ����������ʹ�õģ������������������ڲ�ʹ��
			 * ���Ǵ��ݸ�����Ĺ�����ʹ�õģ��������и���û�й�����(��Ϊ������û������)
			 */
			public void f() {System.out.println("new Base.f()");}
		};
	}
	public static void main(String[] args) {
		Base base = getBase(11);
		base.f();
	}
}
abstract class Base {
	public Base(int i) {System.out.println("i=" + i);}
	public abstract void f();
}
