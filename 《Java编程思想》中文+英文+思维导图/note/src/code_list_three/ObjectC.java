package code_list_three;

//����һ�������������Ľӿڣ��Լ�һ��ʵ���˸Ľӿڵ�ʵ���ࡣ����һ�����У�����һ�����ͷ��������Ĳ�������������ӿڶ����˱߽磬��չʾ�ýӿڵķ��� �������ǿɵ��õ�
public class ObjectC {
	public static <T extends ObjectCA> void methodD(T t) {
		t.methodA();
		t.methodB();
	}
	public static void main(String[] args) {
		methodD(new ObjectCB());
//		methodD(new methodD());//����಻��ObjectCA���͵ģ����Ա�����ʧ�ܵ�
	}
}
interface ObjectCA {
	void methodA();
	void methodB();
}
class ObjectCB implements ObjectCA {
	public void methodA() {System.out.println("methodA");}
	public void methodB() {System.out.println("methodB");}
	public void methodC() {System.out.println("methodC");}
}
class ObjectCD {}