package code_list_three;

//�������ǲ���LinkedList����ʵ���Լ��ڲ�����ʽ�洢����
public class LinkedStack<T> {
	private static class Node<U> {
		U item;
		Node<U> next;
		Node() {
			this.item = null;;
			this.item = null;;
		}
		Node(U item,Node<U> next) {
			this.item = item;
			this.next = next;
		}
		boolean end() {
			return item == null && next == null;
		}
	}
	private Node<T> a = new Node<T>(); 
	//�������Ž�һ��item
	public void push(T item) {
		a = new Node<T>(item,a);
	}
	public T pop() {
		T result = a.item;
		if (!a.end()) {
			a = a.next;
		}
		return result;
	}
	/*
	 * ���ĩ���ڱ����ڹ���LinkedStackʱ�����ġ�Ȼ��ÿ����һ��push()�������ͻᴴ��һ��Node<>���󣬲��������ӵ�ǰһ��Node<T>����
	 * �������pop()����ʱ�����ǵ���item()������Ȼ���������ǰ��item��ָ����һ��Node������һֱ����������ĩ���ڱ���ʱ����ֻ�ܵȴ�null��˵����ջ�Ѿ����� 
	 */
	public static void main(String[] args) {
		LinkedStack<String> stack = new LinkedStack<String>();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		String s;
		while((s = stack.pop()) != null) {
			System.out.println(s);
		}
	}
}
