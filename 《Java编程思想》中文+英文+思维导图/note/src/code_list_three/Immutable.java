package code_list_three;

//String�����ǲ��ɱ��
public class Immutable {
	public static String upcase(String s) {
		return s.toUpperCase();
	}
	public static void main(String[] args) {
		String q = "aaabb";
		System.out.println(q);
		String qq = upcase(q);
		/*
		 * ��q����upcase()����ʱ��ʵ���ϴ��ݵ���һ�����õĿ�����
		 * 	��ʵ��ÿ����String������Ϊ�����Ĳ���ʱ�����Ḵ��һ�����ã�����������ָ�Ķ�����ʵһֱ���ڵ�һ������λ���ϣ���δ����
		 *	���ص�qqҲ��һ��ȫ�µĶ����� 
		 */
		System.out.println(qq);
		System.out.println(q);
	} 
}
