package code_list_three;

/*
 * Ҫ����new T()�ĳ��Խ����޷�ʵ�ֵģ�����ԭ������Ϊ����������һ���ֵ�ԭ������Ϊ������������֤T�Ƿ����Ĭ��(�޲�)�Ĺ�����
 * ������C++�У����ֲ�������Ȼ����ֱ�ۣ����Һܰ�ȫ(�����ڱ����ڽ��м��)
 * java�Ľ�������Ǵ���һ��������������ʹ�����������µ�ʵ��������˵Ĺ����������Class����������ʹ�����ͱ�ǩ����ô��Ϳ���ʹ��newInstance()������������͵��¶���
 */
public class InstantiateGenericType {
	public static void main(String[] args) {
		ClassAsFactory<Employee> fe = new ClassAsFactory<Employee>(Employee.class);
		/*
		 * �����е�����û��Ĭ�ϵĹ�������ʱ��ѡ�������ķ�ʽ��������������ʱ�ͻ����һ������
		 * ����sun��˾������ͬ���ַ�ʽ�����ǽ���ʹ����ʾ�Ĺ������������������ͣ�ʹ�������ֻ�ܽ���ʵ��������������ࡣ�������һ����
		 */
	}
}
class ClassAsFactory<T> {
	T x;//�����ʹ�������ͱ�ǩ
	public ClassAsFactory(Class<T> kind) {
		try {
			x = kind.newInstance();
		} catch (Exception e) {}
	}
}
class Employee {}

//ʹ����ʽ�Ĺ�����������������
class FactoryConstraint {
	public static void main(String[] args) {
//		new Toos<String>(new IntegerFactory());
		/*
		 * �����������͵ļ��ģ�Toos<T>�е�T��ƥ��Toos<T>(class)�е�class�����Ƿ�ʵ����Factory<T>�ӿڣ����ҷ����Ƿ�һ��
		 */
		new Toos<Integer>(new IntegerFactory());
	}
}

interface Factory<T> {T create();}
class Toos<T> {
	public <F extends Factory<T>> Toos(F factory) {factory.create();}
}
//ÿ�����Ͷ�����һ�ֹ�����������������
class IntegerFactory implements Factory<Integer> {
	public Integer create() {return new Integer(0);}
 }


/*
 * ��һ�ַ�ʽʹ����ģ�巽�����ģʽ
 * create()���������ж���ģ����������������͵Ķ���
 */
abstract class GenericWithCreate<T> {
	final T element;
	public GenericWithCreate() {element = create();}
	abstract T create();
}
class DClass {}
class Creator extends GenericWithCreate<DClass> {
	DClass create() {return new DClass();}
	void f() {System.out.println(element.getClass().getName());}
}
class CreatorGeneric {
	public static void main(String[] args) {
		Creator c = new Creator();
		c.f();
	}
}