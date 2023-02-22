package code_list_two;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

//��������ǿ��֮��
public class CrossC {

    /*
     * display()�����������κ��й��������������е�������Ϣ����Ҳչʾ��Integer�������������ܹ���  ��������  ��  ���еײ�  �Ľṹ����
     * ���������д  ������صĴ���  ʱ���㲻�ù��Ĵ�������ʲô���͵�����������̶ȼ��ߣ�����˵������ͬһ�˶������ķ���
     */
    public static void display(Iterator<Integer> it) {
        while (it.hasNext()) {
            Integer i = it.next();
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            list2.add(i);
        }
        HashSet<Integer> list3 = new HashSet<Integer>();
        for (int i = 0; i < 10; i++) {
            list3.add(i);
        }
        TreeSet<Integer> list4 = new TreeSet<Integer>();
        for (int i = 0; i < 10; i++) {
            list4.add(i);
        }
        display(list.iterator());
        display(list2.iterator());
        display(list3.iterator());
        display(list4.iterator());
    }
}
