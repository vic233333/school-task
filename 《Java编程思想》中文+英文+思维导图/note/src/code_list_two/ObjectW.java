package code_list_two;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

//����һ���յ�LinkedList�����������һЩԪ�أ�ͨ��ʹ��ListIterator(������)���������м����Ԫ��
public class ObjectW {
    //����һ������������һ��List�������������м���Ԫ��
    public static void addInt(List<Integer> it, int i) {
        //�����Ļ�������ָ��λ�þ���������Ԫ�ص��м���
        ListIterator<Integer> listIterator = it.listIterator(it.size() / 2);
        listIterator.add(i);
    }

    public static void main(String[] args) {
        //����һ��LinkedList�����������������Ԫ��
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        //����һ��ListIterator�������������������м����Ԫ��
        addInt(list, 12);
        addInt(list, 12);
        addInt(list, 12);
        System.out.println(list);
    }
}
