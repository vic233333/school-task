package code_list_three;

//�μ�һ��Holder��ʹ���ܹ����о�����ͬ���͵�3�Ķ��󣬲��ṩ��Ӧ�Ķ�д����������Щ�����Լ�һ�����Գ�ʼ������е�3������Ĺ�����
public class ObjectB {
	public static void main(String[] args) {
		Holder4<Automobile> h4 = new Holder4<Automobile>(new Automobile(),new Automobile(),new Automobile());
	}
}
class Holder4<T> {
	private T a;
	private T b;
	private T c;
	
	public Holder4(T a,T b,T c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void setA() {this.a = a;}
	public void setB() {this.b = b;}
	public void setC() {this.c = c;}
	
	public T getA() {return this.a;}
	public T getB() {return this.b;}
	public T getC() {return this.c;}
	
}
