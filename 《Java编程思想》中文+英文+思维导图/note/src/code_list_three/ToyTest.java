package code_list_three;

public class ToyTest {
	static void printInfo(Class c) {
		System.out.println("�������" + c.getName());
		System.out.println("�Ƿ���һ���ӿ�" + c.isInterface());
		System.out.println("��������������" + c.getSimpleName());
		System.out.println("ȫ�޶�����" +  c.getCanonicalName());
	}
	public static void main(String[] args) {
		Class c = null;
		try {
			c = Class.forName("code_list_three.FancyToy");
		} catch (ClassNotFoundException e) {
			System.out.println("û���Ҷ�Ӧ����");
		}
		printInfo(c);

		System.out.println("----------------------------");
		Class[] interfaces = c.getInterfaces();//��ȡʵ���˽ӿڵ� Class����
		for (Class in : interfaces) {
			printInfo(in);
		}
		
		System.out.println("----------------------------");
		Class up = c.getSuperclass();//��ȡ�� �̳л���� Class����
		printInfo(up);//��ӡ�˻������Ϣ�������������һ��Toy
		System.out.println("----------------------------");
		try {
			
			Object obj = null;//������Object����
			obj = up.newInstance();//ʵ��"���⹹����"��һ��;����������Ĭ�ϵĹ�������������һ��Toy����
			System.out.println(obj.getClass());//����õ�����Object�����ã������������ָ���ȴ��Toy����
			/*
			 * �����ӡ��������Toy��Class����
			 */
			
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
interface HasBatteries {}
interface Waterproof {}
interface Shoots {}
class Toy {
	Toy() {}
	Toy(int i ) {}
}
class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
	FancyToy() {super(1);}
}
