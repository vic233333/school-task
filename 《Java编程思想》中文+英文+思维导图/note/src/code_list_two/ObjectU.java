package code_list_two;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//����һ��List�������������Ԫ�أ��ڴ���һ��List��ʹ��ListIterator��ȡ��һ��List�е�Ԫ�أ�������Ĳ��뵽�ڶ����б���
public class ObjectU {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        List<Integer> list2 = new ArrayList<Integer>();
        //����һ�����в����ĵ��������������ָ��������������kai'shi��ListIterator(��ʵ����һ�����������ĵ�����)���������������������Ԫ�ص���Ϣ
        ListIterator<Integer> it = list.listIterator(list.size());
        while (it.hasPrevious()) {
            Integer previous = it.previous();
            list2.add(previous);
        }
        //����list2
        for (Integer i : list2) {
            System.out.println(i);
        }
    }
}
