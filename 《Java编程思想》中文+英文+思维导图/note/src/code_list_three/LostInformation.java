package code_list_three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LostInformation {
	public static void main(String[] args) {
		
		List<Frob> list = new ArrayList<Frob>();
		HashMap<Frob, Fnorkle> map = new HashMap<Frob, Fnorkle>();
		Quark<Fnorkle> quark = new Quark<Fnorkle>();
		Particle<Long, Double> p = new Particle<Long,Double>();
		
		System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(quark.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(p.getClass().getTypeParameters()));
		/*
		 * ��JDK�ĵ��н��ܣ�Class.getTypeParameters()��"����һ��TypeVariable�������飬��ʾ�з������������������Ͳ��� "  ��������ڰ�ʾ�����
		 * 	���ֲ������͵���Ϣ������ʵ���ϲ����������ģ��������������������ģ������ֻ�����ڲ���ռλ���ı�ʶ�����Ⲣ�������õ���Ϣ
		 * 
		 * 	����ˣ��п����ʵ�ǣ��ڷ��ʹ�����ڲ����޷����  �κ��йط��Ͳ�������  ����Ϣ
		 * 		��ˣ������֪���������Ͳ�����ʶ���ͷ������ͱ߽��������Ϣ--������ȴ���ܴ���  �����Ͳ���������  ��ʵ����
		 * 		class A<T> {
		 * 			Class clas = T.class;
		 * 		}
		 * 		������δ������޷�ͨ������ģ���Ϊ�����������޷��ҵ�T��ʵ��������ʲô���͸��޷��ҵ�����Class������
		 */
	}
}
class Frob {}
class Fnorkle {}
class Quark<Q> {}
class Particle<POSITION,MOMENTUM> {}
