package code_list_three;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * ���������������ǿ��Ժܷ�������һ��Collection�������ͻ����ֲ����Ǿ���ʵ�������
 * 	������:����ȫʹ���˽ӿڱ�̣����Ҽ��Ϸ��ͣ���϶��Ǽ��͵�
 */
public class Generators {
	//����һ��������һ����������һ����������������ͻ������������������һ�������Ķ�������������
	public static <T> Collection<T> fill(Collection<T> coll,Generator<T> gen,int n) {
		for (int i = 0; i < n; i++) {
			coll.add(gen.next());
		}
		return coll;
	}
	public static void main(String[] args) {
		Collection<Coffee> coffee = fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 4);
		System.out.println(coffee);
	}
	
	//��ϰ������fill������ʹ�䷵��ֵ��������Collection�ĵ����ࣺList��Queue��set��ͨ�����ַ�ʽ�����ǾͲ��ᶪʧ����������
	public static <T> List<T> fill(List<T> list) {
		return list;
	}
	public static <T> ArrayList<T> fill(ArrayList<T> list) {
		return list;
	}
	
}
