package code_list_three;

public class GenericToy {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		//����FancyToy��Class����
		Class<FancyToy> ftClass = FancyToy.class;
		//ͨ��Class���󣬻�ȡ��ʵ��
		FancyToy fancyToy = ftClass.newInstance();//FancyToyҪ��Ĭ�ϵĹ�����
		
		//��ȡ�����Class����
		Class<? super FancyToy> superclass = ftClass.getSuperclass();
		/*
		 * ����Ϊʲô���ص���Class<? super FancyToy>������ֱ�ӷ���Toy?
		 * 	��Ϊ������Ҫ��ʾ����������ʲô��������FancyToy�Ļ��ࡣ�����������ֺ����ԣ���ͨ��Class���󣬻�ȡ��ʵ��������ֵ�Ͳ���һ����ȷ�����ͣ�����һ��Object
		 */
		Object newInstance = superclass.newInstance();
		System.out.println(newInstance instanceof Toy);//�����������Ϣ��û�� ��ʧ�������Խ������͵�ת��  ת��ΪToy���͵�
	}
}
