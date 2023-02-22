package code_list_three;

public class Erased<T> {
	private final int SIZE = 100;
	public static void f(Object arg) {
//		if(arg instanceof T) {}  //ERROR: T ������ʱ ��û���κε���Ϣ��
//		T var = new T();
	}
	public static void main(String[] args) {
		
	}
}

//ǰ���ʾ���ж�ʹ��instanceof�ĳ�����ʧ�ܵģ���Ϊ������Ϣ�Ѿ��������ˡ�����������ͱ�ǩ���Ϳ���ʹ�ö�̬��isInastance()

class Building {}
class House extends Building {}

class ClassTypeCap<T> {
	Class<T> kind;//Ӧ��������ʹ�������ͱ�ǩ
	public ClassTypeCap(Class<T> kind) {
		this.kind = kind;
	}
	public boolean f(Object obj) {
		return kind.isInstance(obj);
	}
	public static void main(String[] args) {
		ClassTypeCap<Building> clas = new ClassTypeCap<Building>(Building.class);
		System.out.println(clas.f(new Building()));
		System.out.println(clas.f(new House()));
		ClassTypeCap<House> clas2 = new ClassTypeCap<House>(House.class);
		System.out.println(clas2.f(new Building()));
		System.out.println(clas2.f(new House()));
	}
}