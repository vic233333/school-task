package code_list_two;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//ListIterator������
public class ListIteration {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        ListIterator<Integer> it = list.listIterator();//���Ǵ��е�����������

        while (it.hasNext()) {//�Ƿ�����һ��
            Integer next = it.next();
            System.out.println(next);
        }
        while (it.hasPrevious()) {//�Ƿ���ǰһ��
            Integer previous = it.previous();
            System.out.println(previous);
        }

        it = list.listIterator(3);//���Դ���һ��ָ��ָ��ĳ�ʼλ��
        while (it.hasNext()) {
            Integer next = it.next();
            System.out.println(next);
            it.set(5);//��һ�����ص�Ԫ�ػᱻ�滻Ϊ5
        }
    }
}
