package code_list_three;

public class GenericClassRe {
	public static void main(String[] args) {
		
		Class intClass = int.class;
		intClass = double.class;
		
		Class<Integer> gen = int.class;
		gen = Integer.class;//same thing
//		gen = double.class;//Illegal
		
		/*
		 *��ͨ��Class��������ָ��������Class���󣬵��Ƿ����﷨���ǲ��У���������ǿ��ִ�ж�������ͼ�� 
		 */
		
		//�����ϣ������һЩ���������ƣ�ִ�����������Ĵ����в���?
//		Class<Number> numClass = int.class;
		//�����ǲ��еģ����޷���������ΪInteger Class���� ���� Number Class���������
		
		//Ϊ����ʹ�÷�����Class����ʱ�������ƣ���ʹ����ͨ���������java���͵�һ���֡�ͨ���"?",��ʾ�κ��������ࡣ
		Class<?> intClass2 = int.class;
		//����Ĵ���������Class intClass = int.class;���������ǵȼ۵ġ�Class<?>��ʹ���˷Ǿ���������á�
		
		//�����ͱ��޶�Ϊĳ�����ͣ������Ǹ����͵��κ����ࡣ�������Class<Number>�ǽ�Ȼ��ͬ�ġ��κε�Number���������඼�ǿ��Ե�
		Class<? extends Number> intClass3 = int.class;
		intClass3 = double.class;//double����Number�����࣬�����Ա����ǿ���ͨ����

		//���û��ʹ�÷��ͣ�����ʹ������ͨ�����ͣ��㷸�˴����Ҫֱ�����е�ʱ��ű����ֳ�������ʹ�÷��� ���� ������ �Ϳ��Ա����ֳ���

		
	}
}
