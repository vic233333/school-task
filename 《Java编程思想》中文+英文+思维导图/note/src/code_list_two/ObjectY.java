package code_list_two;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class ObjectY {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("D");
        System.out.println(hashSet);//HashSet��ά��Ԫ�ز��������˳��ʹ��һ��ɢ���㷨��

        //��HashSet�е�Ԫ�أ�ת�õ�LinkedHashSet�С�֤��������ά������˳���
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        for (String s : hashSet) {
            linkedHashSet.add(s);
        }
        System.out.println(linkedHashSet);
        //������ȷʵ��֤����LinkedHashSet��ά���˲����˳��
    }
}
