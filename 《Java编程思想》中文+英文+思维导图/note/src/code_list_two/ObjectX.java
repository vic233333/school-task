package code_list_two;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

//�ü�ֵ�����һ��HashMap����ӡ�����ͨ��ɢ������չʾ������
public class ObjectX {
	public static void main(String[] args) {
		 Map<String, String> hashMap = new HashMap<String,String>();
		 hashMap.put("1", "A");
		 hashMap.put("2", "B");
		 hashMap.put("3", "C");
		 hashMap.put("4", "D");
		 hashMap.put("5", "E");
		 System.out.println(hashMap);//��ӡ�Ľ����û�й��ɵ�
		 
		 //��ȡ��Щ��ֵ�ԣ��Ž�LinkedHashMap�С�֤��LinkedHashMapά�������˳��
		 LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String,String>();
		 //����һ��HashMap��ȡ����ֵ��
		 Set<String> keySet = hashMap.keySet();
		 for (String key : keySet) {
			 String value = hashMap.get(key);
			 linkedHashMap.put(key, value);
		}
		 System.out.println(linkedHashMap);
		 //������ȷʵ��ά���˲����˳��
	}
}
