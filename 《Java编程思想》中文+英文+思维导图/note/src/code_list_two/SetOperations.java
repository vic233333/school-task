package code_list_two;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

//Set��һЩ����
public class SetOperations {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<String>();
        Collections.addAll(hashSet, "A,B,C,D,E,F,G,H".split(","));//��"A,B,C,D,E,F,G,H"���һ�����飬��ӵ�Collection������(SetҲ��Collection)
        boolean isContains = hashSet.contains("A");//�ж�"A"�Ƿ���hashSet�����С���������Ҳ�����������ֻ��HashSet�Ǻܿ��
        System.out.println(isContains);
        //�����뿴Collection�ӿڵķ�����Set��Collection�ӿڵķ�����һ���ġ�Setû�ж�������κη���
    }
}
