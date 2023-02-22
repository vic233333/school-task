package code_list_three;

public class StringAPI {
	/*
	 * ��length():String�е��ַ�����
	 * ��charAt(int i):ȡ�ø�����λ���ϵ�char
	 * ��toCharArray():��һ��String��������һ��char[]
	 * ��equals():�Ƚ�����String�������ǲ���һ��
	 * ��equalsIgnoreCase():�Ƚ�String����������Ƿ�һ�������Դ�Сд
	 * ��contains(String s):�����String��������Ĳ��������ݣ��ͷ���ture
	 * ��contentEquals(String s):�����String������s�����������ȫһ�¾ͷ���true
	 * ��startsWith(String s):����String�Ƿ��Դ˲�����ʼ
	 * ��endsWith(String s):����String�Ƿ��Դ˲�������
	 * ��indexOf(String s):�����String���������˲������ͷ���-1.����ͷ��ظò�����String�е�����
	 * ��lastIndexOf(String s):������Ĺ���һ����ֻ������ǴӺ�����м�����.��������ֵ���Ǵ�ǰ�濪ʼ���㣬��һ���ַ�������ֵΪ��
	 * ��substring(int index, int ends):ָ����ʼ�ͽ���������ֵ����һ���µ�String
	 * ��substring(int index):����һ�����صģ����뿪ʼ��������ȡ�������ַ�
	 * ��concat(String s):����һ���µ� String��������ΪԭʼString�����ϲ�����String
	 * ��replace(String s1,String s2):s1���ַ���s2�����ַ��������滻�����String�������û���滻����������ԭʼ����
	 * ��toLowerCase(),toUpperCasr():�ı��Сд�����û�з������ģ��򷵻�ԭʼ����
	 * ��trim():��String���ߵĿհ��ַ�ɾ��
	 * ��valueOf():����һ����ʾ�������ݵ�String����������������char��boolean��int��long��float��double
	 * ��intern()��Ϊÿ��Ψһ���ַ���������һ���ҽ�����һ��String����
	 * 
	 * 	��������п��Կ���������Ҫ�ı��ַ���������ʱ��String��ķ������᷵��һ���µ�String����
	 * 	ͬʱ���������û�иı�Ļ���String����ֻ�Ƿ���ָ��ԭ��������ã��������Խ�Լ�洢�ռ��Լ��������Ŀ���
	 * 	
	 */
	public static void main(String[] args) {
		String a = "abcdefghijk";			System.out.println(a.length());
		char charAt = a.charAt(3);			System.out.println(charAt);//3�����ϵ�char��d����Ϊ�Ǵ��㿪ʼ����������
		char[] charArray = a.toCharArray(); System.out.println(charArray);//��һ�����ַ��ָ Ϊһ�� char�������
		boolean e = a.equals("abcdefghijk");System.out.println(e);//�Ƚϵ��������ǲ���һ��
		boolean contains = a.contains("abc");System.out.println(contains);
		boolean c = a.contentEquals("abcdefghijk");System.out.println(c);
		boolean s = a.startsWith("abc");		System.out.println(s);
		int indexOf = a.indexOf("d");		System.out.println(indexOf);//����d������d�ڸ�String�е���������3(��0��ʼ����)
		int li = a.lastIndexOf("a");		System.out.println(li);
		String s1 = a.substring(0,2);		System.out.println(s1);
		String concat = a.concat("abc");	System.out.println(concat);
		String r = a.replace("abc", "aaa");	System.out.println(r);
		String trim = "   abc   ".trim();	System.out.println(trim);
	}
}
