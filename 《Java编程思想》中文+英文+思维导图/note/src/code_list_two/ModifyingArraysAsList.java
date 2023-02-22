package code_list_two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ModifyingArraysAsList {
	public static void main(String[] args) {
		
		//ʹ�� ArrayList �� Arrays.asList(x[])�����Ľ�� ���а�װ(ʵ�ʾ��ǰ��䴫��ArrayList�Ĺ�������)���԰�װ������������в�������Ӱ��x[]
		Integer[] ints = {1,2,3,4,5,6,7,8};
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(ints));
		//��list���д���
		Random random = new Random(47);
		Collections.shuffle(list,random);
		System.out.println("���Һ��ArrayList(��װ)" + list);
		System.out.println("���Һ�ԭ�������� " + Arrays.toString(ints));//���Կ�����ArrayList���д��ң����ǵ������ǲ����
		
		//��ʹ��ArrayList�����װ������ �� Arrays.asList(x[])�����Ľ�� ֱ�Ӳ���
		Integer[] ints2 = {1,2,3,4,5,6,7,8};
		List<Integer> list2 = Arrays.asList(ints2);
		Collections.shuffle(list2,random);
		System.out.println("���Һ��List(����װ)" + list2);
		System.out.println("ԭ����������" + Arrays.toString(ints2));//���Կ�����ʹ�� ArrayList ������а�װ��ֱ�ӶԷ���ֵ���в����ǻ�ı�ײ������
	
		/*
		 * Ҫ��ʶ��Arrays.asList(x[]) ������List�����  ֱ��ʹ�õײ�����(���ص�) ��Ϊ������ʵ��
		 * 	ֻҪ��ִ�еĲ������޸����List�������㲻��ԭ�������鱻�޸ģ���ô���Ӧ������һ�������д���һ������(ʹ��ArrayList���а�װ)  
		 */
	}
}
