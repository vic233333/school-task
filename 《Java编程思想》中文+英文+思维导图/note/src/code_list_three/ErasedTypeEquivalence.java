package code_list_three;

import java.util.ArrayList;

public class ErasedTypeEquivalence {
	public static void main(String[] args) {
		Class c1 = new ArrayList<Integer>().getClass();
		Class c2 = new ArrayList<String>().getClass();
		System.out.println(c1 == c2);//ʵ�������ǵ�������һ����(���ٱ�������������Ϊ)
		/*
		 * ArrayList<Integer>��ArrayList<String>�����ױ���Ϊ�ǲ�ͬ�����͡���ͬ����������Ϊ����϶���ͬ�����磬������Խ�һ��Integer�Ž�
		 * 	ArrayList<String>�У����ȵ�����Ϊ(��ʧ��)���뽫һ��Integer�Ž�ArrayList<Integer>(���ɹ�)���õ�����Ϊ����ȫ��ͬ�ġ�
		 * ����ʵ����������һ�������͡�
		 * 
		 * ��java������ʹ�ò�����ʵ�ֵģ�����ζ�ŵ�����ʹ�÷��͵�ʱ���κξ����  ������Ϣ  ���������ˣ���Ψһ֪���ľ�������ʹ��һ���������List<String>��List<Integer>������ʱ  ��ʵ������ͬ�����͵ġ�
		 */
	}
}
