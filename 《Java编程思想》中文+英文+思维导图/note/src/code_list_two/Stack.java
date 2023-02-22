package code_list_two;

import java.util.LinkedList;

//ʵ��һ��ջ����Ҫ�м���������һ����ѹջ ��һ���Ǵ�ջ��ȡ��Ԫ�أ����һ����ջ��ɾ��Ԫ��
public class Stack<T> {
    private LinkedList<T> list = new LinkedList<T>();

    //ѹջ����ջ�����Ԫ��
    public void push(T v) {
        list.addFirst(v);
    }

    //�� ջ�� ȡ��Ԫ��
    public T peek() {
        return list.getFirst();
    }

    //ɾ�� ջ�� ��Ԫ�ء����ر�ɾ����Ԫ��
    public T pop() {
        return list.removeFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public String toString() {
        return list.toString();
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("����Ԫ�ص�����" + stack.toString());//��ʱ��3����ջ���ģ���Ϊ3������ȥ��
        System.out.println("��ջ��ȡ��Ԫ��" + stack.peek());//��ʱ���ջ��ȡ����Ԫ�ؾ���3��
        stack.pop();//��ջ��ɾ��Ԫ��
        System.out.println(stack);//���ʣ����ǰ��ջ�׵�����Ԫ����
        while (!stack.isEmpty()) {//���ջ��Ϊ�� �ʹ�ջ��ȡ��Ԫ��
            Integer peek = stack.peek();
            System.out.println(peek);
            //��ջ��ɾ��Ԫ��
            stack.pop();
        }
    }
}
