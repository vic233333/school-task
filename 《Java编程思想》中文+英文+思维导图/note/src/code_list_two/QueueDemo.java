package code_list_two;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.offer("H");//offer()������һ��Ԫ�ز������β
        queue.offer("E");
        queue.offer("L");

        String peek = queue.peek();
        System.out.println("ȡ����ͷ" + peek);
        String element = queue.element();
        System.out.println("ȡ����ͷ" + element);
        String remove = queue.remove();
        System.out.println("�Ƴ���ͷ" + remove);
        String element1 = queue.element();
        System.out.println("�Ƴ�һ�κ���ȡ����ͷ" + element1);
        /*
         * 	peek()��element()���������ڲ��Ƴ�������·��ض�ͷ
         * 	����peek()�����ڶ���Ϊ��ʱ����null����element()�����ڶ���Ϊ��ʱ���׳��쳣
         * 	remove()�����Ƴ���ͷ������--������Ϊ��ʱ�����׳��쳣NoSuchElementException
         */
    }
}
