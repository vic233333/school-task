package code_list_two;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//����Map
public class MapMess {
	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		//��Map�д洢Ԫ��
		hashMap.put(1, "A");
		hashMap.put(2, "B");
		hashMap.put(3, "C");
		hashMap.put(4, "D");
		System.out.println("toString����" + hashMap);
		
		boolean isContainsKey = hashMap.containsKey(1);
		System.out.println("�Ƿ����ĳ������" + isContainsKey);
		boolean isContainsValue = hashMap.containsValue("A");
		System.out.println("�Ƿ����ĳ��ֵ��" + isContainsValue);
		
		/*
		 * ����Map
		 */
		System.out.print("---����---");
		Set<Integer> keySet = hashMap.keySet();//������ϰ��������еļ�
		for (Integer i : keySet) {
			String str = hashMap.get(i);
			System.out.print(str);
		}
		System.out.println("---��������---");
		
		//ͬ�����Ի��ֵ�ü���
		Collection<String> values = hashMap.values();
		System.out.print("ֵ�ü��ϣ�" + values);
		System.out.println();
		
		/*
		 * ��������չ����ά��Map���滹���԰���һ��Map ���� List������
		 */
		Map<Integer, Map> hashMap2 = new HashMap<Integer,Map>();
		hashMap2.put(1, hashMap);
		System.out.println(hashMap2);
		//����Map�е�Map
		Object object = hashMap2.get(1).get(1);
		System.out.println(object);
	}
}
