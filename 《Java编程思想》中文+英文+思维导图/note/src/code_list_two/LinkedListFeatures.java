package code_list_two;

import java.util.LinkedList;

//LinkedList��һЩAPI
public class LinkedListFeatures {
    public static void main(String[] args) {
        //����һ��LinkedList����
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println("�б�Ԫ�ص�����");
        System.out.println("�б�ĵ�һ��Ԫ�أ�" + list.getFirst());
        System.out.println("�б�ĵ�һ��Ԫ�أ�" + list.element());
        System.out.println("Ҳ�Ƿ����б�ĵ�һ��Ԫ��,ֻ�ǵ������ǿյ�ʱ�򲻻��׳��쳣���� ��������������ͻ��׳��쳣" + list.peek());
        System.out.println("���б��β�˲��Ԫ��");
        list.addFirst(13);
        System.out.println("�Ƿ��������Ŀ�ʼ�������Ԫ��");
        list.add(12);
        list.addLast(14);
        System.out.println("�Ƿ��������β��������Ԫ��" + list);
        System.out.println("�Ƴ��б�����һ��Ԫ��");
        list.removeLast();
        System.out.println("�Ƿ��Ƴ������������һ��Ԫ����" + list);
    }
}
