package code_list_three;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayMaker<T> {
	private Class<T> kind;
	public ArrayMaker(Class<T> kind) {
		this.kind = kind;
	}
	T[] create(int size) {
		return (T[])Array.newInstance(kind, size);//Array.newInstance()��������Ž�һ��Class�����size�ͻ�Ϊ������󴴽�һ������
	}
	public static void main(String[] args) {
		ArrayMaker<String> arrayMaker = new ArrayMaker<String>(String.class);
		String[] arr = arrayMaker.create(9);
		System.out.println(Arrays.toString(arr));
		/*
		 * �����Ｔʹkind���洢ΪClass<T>,����Ҳ��ζ����ʵ�ʽ��� �洢 ΪClass��û���κεĲ�����û���κε�������Ϣ��
		 * ��˵���ʹ����ʱ�������ڴ��������ʱ��ʵ������û���κ�kind��������Ϣ�ģ����Ա������ǿ������ת��(T[])���⽫����һ������(���治�Ǳ���ʱ�Ĵ���)
		 * �����ڷ����г������飬ʹ��Array.newInstance();���Ƽ��ķ�ʽ
		 * 
		 * �������Ҫ�����������������������飬������ǽ�Ȼ��ͬ�ˡ��������һ����
		 */
	}
}
class ListMaker<T> {
	List<T> create() {return new ArrayList<T>();}//���ﲢ��Ҫ��дǿ��ת���Ĵ��룬�������������Ҫ��д�����Ĵ����
	public static void main(String[] args) {
		ListMaker<String> listMaker = new ListMaker<String>();
		List<String> create = listMaker.create();//���ﲢ����Ҫ����ǿ������ת�����������Զ����� ��ȷ������
		/*
		 * ��ͺ�����˼�ˣ�
		 * 	Ϊʲô����֪�����������ʲô?�������е�ʱ���ǽ��� ���͵Ĳ�������? Ϊʲô������Զ����� ��ȷ�����͵�?
		 * 	������Ǳ߽�������ˣ����������޷�֪��������������Ϣ������������ȷ������õĶ������ T ���͡�
		 * 		��ˣ���ʹ�������й�ʵ�����͵���Ϣ���������ǿ���ȷ�� ʹ�� ���͵�һ���ԡ�(��������֪������ʲô���ͣ�����ȴ����ȷ���ڱ����ڼ����͵�һ���ԣ��������ʱͨ�����˵�)
		 * 
		 * 	����Ϊ�����ڷ��������Ƴ���������Ϣ������������ʱ��������Ǳ߽磺�����������뿪�����ĵص㡣�����Ǳ������ڱ�����ִ���� ���ͼ�� ��   ����ת�ʹ���   �ĵص㡣
		 * 		ʵ���Ͼ��������˷��ͣ�Ҳ��Ҫ����ǿ������ת���ģ������� ���ʹ��� �ڱ�����ȷ���� ���͵�һ���ԣ������������㲻����ʽ�ı�д ת�ʹ��룬���Ǳ����� �Զ����㴦��(�����������������ת����)��
		 * 		������д�Ĵ�����������С��
		 * 		�����ڷ����е����ж����������ڱ߽紦---�Դ��ݽ�����ֵ���ж���ı����ڼ�飬���Դ��ݳ�ȥ��ֵ����ת�͡���ס,"�߽���Ƿ��������ĵط�"
		 * 
		 * 	������һ�����Ӿ���˵����Щ
		 */
	}
}
class SimpleHolder {
	private Object obj;
	public void set(Object obj) {this.obj = obj;}					//���������룬��������������ֽ�����һ���ģ�֤�����ǵ��ڲ�����ʱһ����
	public Object get() {return obj;}								//set()��get()������ֱ�Ӵ洢�Ͳ���ֵ�����ڵ�һ���࣬ת���ǵ���get()ʱ����ת��
	public static void main(String[] args) {						
		SimpleHolder holder = new SimpleHolder();					
		holder.set("H");											
		String str = (String)holder.get();//������ʽ�ı�дת�ʹ���			
	}																
}																	
class GeneriHolder<T> {												
	private T obj;													//���Ƕ��ڵڶ����࣬�����˷��ͣ�get()����֮���ת����ʧ�ˣ�������set()�����������͵ļ��
	public void set(T obj) {this.obj = obj;}						//��Ϊʹ���˷��ͣ�����Ҫ���м�飬����Ͳ��ܱ�֤�ڲ����͵�һ������
	public T get() {return obj;}									//	
	public static void main(String[] args) {						//��Ϊ��������ֽ�����һ���ģ����Զ��ڷ����� get()���ص�ֵ����ת���Ծ�����Ҫ�ģ��������Լ���дת��
		GeneriHolder<String> holder = new GeneriHolder<String>();	//������һ���ģ������һ����һ��������ֻ���ɱ������Զ����롣
		holder.set("H");											
		String str = holder.get();//����Ͳ���Ҫ������ʽ�ı�дת�ʹ�����		
	}
}