package code_list_three;

/*
 * ͨ��Ԫ����Ծ������ⳤ�ȣ�ͬʱ��Ԫ���еĶ�����������ⲻͬ�����͡�����������ϣ���ܹ�Ϊÿһ������ָ�������ͣ����Ҵ������ж�ȡ��������ȷ������
 */
public class TwoTuple<A,B> {
	public final A a;
	public final B b;
	public TwoTuple(A a,B b) {
		this.a = a;
		this.b = b;
	}
	public String toString() {
		return "(" + a + "," + b + ")";
	}
	/*
	 * ������������Ҫ�洢�Ķ���
	 * 	Ҳ������� a��b��Ӧ������Ϊprivate��?Ȼ���ṩget��set�����Ŷ�?
	 * 	����������ӵİ�ȫ��:���Զ�ȡa��b���󣬵����޷�Ϊ�ı���ֵ��
	 */
	public static void main(String[] args) {
		TwoTuple<Integer, Integer> twoTuple = new TwoTuple<Integer,Integer>(new Integer(1),new Integer(2));
		Integer c = twoTuple.a;//ֻ�ܶ�ȡ��ֵ��������Ϊ��ֵ��ֵ 
//		twoTuple.a = 3;
	}
}
//�������ü̳л���ʵ�ֳ��ȸ�����Ԫ��
class ThreeTuple<A,B,C> extends TwoTuple<A,B> { 
	public final C c;
	public ThreeTuple(A a,B b,C c) {super(a, b);this.c = c;}
	public String toString() {return "(" + a + "," +  b +"," + c + ")";}
}
class FourTuple<A,B,C,D> extends ThreeTuple<A,B,C> {
	public final D d;
	public FourTuple(A a,B b,C c,D d) {super(a, b, c);this.d = d;}
	public String toString() {return "(" + a + "," + b + "," + c + "," + d + ")";}
}
class FiveTuple<A,B,C,D,E> extends FourTuple<A,B,C,D> {
	public final E e;
	public FiveTuple(A a,B b,C c,D d,E e) {super(a, b, c, d);this.e = e;}
	public String toString() {return "(" + a + "," + b + "," + c + "," + d + "," + e + ")";}
}
//��ϰ������һ��SixTuple�����Ҳ������Ĺ���
class SixTuple<A,B,C,D,E,F> extends FiveTuple<A,B,C,D,E> {
	public final F f;
	public SixTuple(A a,B b,C c,D d,E e,F f) {super(a, b, c, d, e);this.f = f;}	
	public String toString() {return "(" + a + "," + b + "," + c + "," + d + "," + e + "," + d + ")";}
	public static void main(String[] args) {
		SixTuple<Integer, Integer, Integer, Integer, Integer, Integer> six = 
				new SixTuple<Integer,Integer,Integer,Integer,Integer,Integer>(1,2,3,4,5,6);
		System.out.println(six.a);
		System.out.println(six.b);
	}
}
//ʹ��Ԫ�飬������Ҫ����һ�������ʺϵ�Ԫ�飬������Ϊ�����ķ���ֵ��Ȼ����return����д�����Ԫ��
class AClass {};
class BClass {};
class TupleTest {
	static TwoTuple<AClass,BClass> method() {
		return new TwoTuple<AClass,BClass>(new AClass(),new BClass());
	}
	static ThreeTuple<AClass,BClass,AClass> methodB() {
		return new ThreeTuple<AClass,BClass,  AClass>(new AClass(),new BClass(),new AClass());
	}
	public static void main(String[] args) {
		TwoTuple<AClass, BClass> two = method();
		System.out.println(two.hashCode());
//		two.a = new AClass();//fianl���ܱ����ģ�fianl�������Ա���public��
	}
}
