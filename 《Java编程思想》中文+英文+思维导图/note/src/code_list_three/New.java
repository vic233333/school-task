package code_list_three;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class New {
	public static <K,V> Map<K,V> map() {
		return new HashMap<K,V>();
	}
	public static <T> List<T> list() {
		return new ArrayList<T>();
	}
	public static <T> LinkedList<T> llist() {
		return new LinkedList<T>();
	}
	public static <T> Set<T> set() {
		return new HashSet<T>();
	}
	public static void main(String[] args) {
		Map<String, List<String>> map = New.map();
		List<String> list = New.list();
		LinkedList<String> llist = New.llist();
		Set<String> set = New.set();
		/*
		 *   ���Ͳ����ƶ�  ������  �ظ���  ���Ͳ����б�
		 *   �����ƶ�ֻ�Ը�ֵ������Ч(List<String> list = New.list();��������ʽ���Ǹ�ֵ)��������ʱ�򲢲������á�
		 *   	����:����㽫һ�����ͷ������õĽ��(����New.map())��Ϊ���������ݸ���һ����������ʱ��������������������жϣ��������ǽ��÷��ͷ����ķ���ֵ
		 *   	����һ��Object���͵ı����������g()����֤����һ��
		 */
		g(New.list());
		Map<String, List<? extends String>> map2 = New.map();
	}
	public static <T> void g(List list) {}
	
}
