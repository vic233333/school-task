package code_list_two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

//�Լ����һ�����������foreach���
public class ReversibleArrayList<T> extends ArrayList<T> { //�̳���ArrayList����Ӽ̳���Iterable
	public ReversibleArrayList(Collection<T> c) {
		super(c);
	}
	//������������Խ��з���ı���
	public Iterable<T> reversed() {
		return new Iterable<T>() {
			public Iterator<T> iterator() {
				return new Iterator() {
					int current = size() - 1; //size()������ArrayList�еģ��ҳ��ж��ٵ�Ԫ��-1���������һ��Ԫ�ص��±���
					public boolean hasNext() {
						return current > -1;
					}
					public Object next() {
						return get(current--);
					}
					public void remove() {
						throw new UnsupportedOperationException();
					}
					
				};
			}
		};
	}
	
	public static void main(String[] args) {
		ReversibleArrayList<String> list = new ReversibleArrayList<String>(Arrays.asList("A","B","C","D")); 
		
		//���������foreach
		Iterator<String> iterator = list.iterator();
		System.out.println("�������");
		for (String str : list) {
			System.out.print(str + " ");
		}
		System.out.println();
		
		//��÷�����������������������foreach�Ŀ���ʹ����
		Iterable<String> reversed = list.reversed();
		System.out.println("�������");
		/*
		 * ���ֱ�ӽ�list��������foreach����У����õ�Ĭ����ǰ����������������ڸö����ϵ���reversed()�������ͻ������ͬ����Ϊ����Ϊ�Լ��Զ����reversed��ʵ���˷��������
		 */
		for (String str : reversed) {
			System.out.print(str + " ");
		}
	}
}
