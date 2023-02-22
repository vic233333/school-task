package code_list_three;

public class SimpleProxyDemo implements Interface {
	private Interface proxied;
	public SimpleProxyDemo(Interface proxied) {
		this.proxied = proxied;
	}
	public void doSomething() {
		System.out.println("SimpleProxyDemo.doSomething");
		proxied.doSomething();
	}
	public void somethingElse(String args) {
		System.out.println("SimpleProxyDemo.somethingElse");
		proxied.somethingElse(args);
	}
	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.somethingElse("H");
	}
	public static void main(String[] args) {
		consumer(new RealObject());
		consumer(new SimpleProxyDemo(new RealObject()));
	}
}

interface Interface {
	void doSomething();
	void somethingElse(String args);
}
class RealObject implements Interface {
	/*
	 * ���κ�ʱ�̣�ֻҪ���뽫����Ĳ�����"ʵ�ʵ�"�����з��뵽��ͬ�ĵط�����Щ�������㲻ϣ������ϲ���Ӧ���еĴ��룬��˴���ʹ������Ժ����׵���ӻ����Ƴ�����
	 */
	public void doSomething() {
		System.out.println("RealObject.doSomething");
	}
	public void somethingElse(String args) {
		System.out.println("RealObject.somethingElse");
	}
}