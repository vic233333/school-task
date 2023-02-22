package code_list_three;

public class ErasureAndInheritance {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Der2 der2 = new Der2();
		Object obj = der2.get();
		der2.set(obj);
	}
}
class GenBasic<T> {
	private T t;
	public void set(T t) {this.t = t;}
	public T get() {return t;}
}
class Der1<T> extends GenBasic<T> {}

class Der2 extends GenBasic {}
/*
 * Der2�̳���GenBasic������û���κεķ��Ͳ����������������ᷢ���κεľ���,������set()�����õ�ʱ�ų��֣�
 * 	Ϊ�˹رվ������ʹ��@SuppressWarnings("unchecked")���ڷ�������
 */
