package code_list_three;

//������  ʹ��ģ��  ��C++ʾ�����㽫ע�⵽���ڲ��������͵��﷨ʮ�����ƣ���Ϊjava����C++��Ӱ���
public class CPulsPuls {
	
	/*	
	 * 	template<class T> class Manipulator {
	 * 		T obj;
	 * 	public:
	 * 		Manipulator(T x) {  obj = x  }
	 * 		void manipulate() {  obj.f()  }
	 * 	};
	 * 	
	 * 	class HasF {
	 * 	public:
	 * 		void f() {...}
	 * 	}
	 */
	
	/*
	 * Manipulator��洢��һ������T�Ķ�������˼����manipulate()����������obj�ϵ��÷���f()��
	 * 	��������ô֪��f()������Ϊ���Ͳ���T�����ڵ�?ԭ���������ģ�
	 * 	 ������ʵ�������ģ��ʱ��C++�����������м�飬�����Manipulator<HasF>��ʵ��������һ�̣����Ϳ�����HasFӵ��һ������f(),�����������������ͻ����һ���������
	 * 		 �������Ͱ�ȫ�͵ȵ��˱��ϡ���C++��д�����Ĵ���ܼ򵥣���Ϊ��ģ�屻ʵ����ʱ��ģ������֪������ģ������������ˡ�java���;Ͳ�ͬ
	 */
}

//������java�ķ���
class HasF {
	public void f() {}
}
class Manipulator<T> {
	private T obj;
	public Manipulator(T obj) {
		this.obj = obj;
	}
	public void manipulate() {
//		obj.f();//����ͻ����һ������Ĵ���
	}
	public static void main(String[] args) {
		HasF hasF = new HasF();
		Manipulator<HasF> manipulator = new Manipulator<HasF>(hasF);
		manipulator.manipulate();
		/*
		 *	���ڲ���java�������޷���manipulate()����obj.f()��һ����Ҫӳ�䵽HasFӵ��f()��һ��ʵ�ϡ�
		 *	Ϊ�˵���f(),���Ǳ���Э�������࣬����������ı߽磬��֪������ֻ�ܽ�������߽�����͡��������õĹؼ���extends���������˱߽�(�޶�)������Ĵ���Ϳ��Ա����ˡ���Manipulator2�����
		 */
	}
}
class Manipulator2<T extends HasF> {
	/*
	 * ����� �߽� <T extends HasF>����T����������HasF������HasF���������͡������Ϳ��԰�ȫ����obj�ϵ���f()��
	 *   ����˵�������Ͳ��� ������ �����ĵ�һ���߽�(�������ж���߽�)����������һ����T��������HasF���ͺ����������������HasF�滻��Tһ��
	 */
	private T obj;
	public Manipulator2(T obj) {this.obj = obj;}
	public void manipulate() {obj.f();}
}
//Manipulator2�����������������
class Manipulator3 {
	private HasF obj;
	public Manipulator3(HasF obj) {
		this.obj = obj;
	}
	public void manipulate() {obj.f();}
	/*
	 * ��Manipulator2��Manipulator3�����ͺ���û�й����κκô���Manipulator3�����Լ�ȥִ�в������Ϳ��Դ�����û�з����������
	 * ����������˺���Ҫ��һ����ǣ�ʹ�÷�������ʲô�ô���ΪʲôҪʹ�÷�����?
	 * 	����ʵֻ�е���ϣ��ʹ�õ� ���Ͳ��� ��ĳ�����������(�Լ���������������) ����"����"ʱ--Ҳ����˵������ϣ����Ĵ����ܹ������๤����ʱ��ʹ�÷�����Ż���������
	 * 	����ʵҲ��һ��Ҫʹ�÷��ͣ�����鿴���еĴ��룬��ȷ�����Ƿ�"�㹻����"������ʹ�÷��͵ĳ̶���
	 */
}
class ReturnGeneriType<T extends HasF> {
	private T obj;
	public ReturnGeneriType(T obj) {
		this.obj = obj;
	}
	public T get() {
		return obj;
	}
	public static void main(String[] args) {
		ReturnGeneriType gen = new ReturnGeneriType(new HasF());
		HasF hasF = gen.get();//���ﷵ�ص���ȷ�е�����
		/*
		 * ʹ�÷��ͻ���һ���ô����ǣ�
		 * 	�����һ������һ������T�ķ�������ô���;�������������Ϊ����֮�󷵻ص���ȷ�е�����
		 */
	}
}
