package code_list_two;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class SetOfInteger {

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<String>();
        hashSet.add("A");
        hashSet.add("A");//��������������ظ���Ԫ�أ�������HashSet���ǲ���������ظ���Ԫ�ص�
        System.out.println("HashSet�����������ظ��Ķ���" + hashSet);
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("D");//HashSet�����ǰ�������ӵ�˳�������
        System.out.println("HashSet�������û�й��ɿ��ҵ�" + hashSet);
    }

    //ʹ��TreeSet�Խ����������
    @Test
    public void treeSet() {
        Set<String> treeSet = new TreeSet<String>();
        treeSet.add("A");
        treeSet.add("A");//TreeSet��Ҳ�ǲ���������ظ���Ԫ�صġ�ֻҪ��Set�����������������ظ���Ԫ��
        System.out.println("HashSet�����������ظ��Ķ���" + treeSet);
        treeSet.add("B");
        treeSet.add("C");
        treeSet.add("D");//TreeSet����Ľ������˳���
        System.out.println("HashSet�������û�й��ɿ��ҵ�" + treeSet);
    }

}
