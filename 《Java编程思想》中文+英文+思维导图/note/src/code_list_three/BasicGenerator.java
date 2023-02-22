package code_list_three;

public class BasicGenerator<T> implements Generator<T> {
	private Class<T> type;
	public BasicGenerator(Class<T> type) {
		this.type = type;
	}
	//��������һ������
	public T next() {
		try {
			return type.newInstance();
		} catch (Exception e) {throw new RuntimeException();}
	}
	//��������һ��Generator(����������)
	public static <T> Generator<T> create(Class<T> type) {
		return new BasicGenerator<T>(type);
	}
	/*
	 * �������Ϊ������ĳ����Ķ��󣬶�create()�������Դ���һ��  �����Ķ���(�������ɶ���)����Ҫ����create()������������һ��Class���͡�
	 * 	Ϊ������һ�� �������ɶ��� �Ķ��󣬿���ֱ�ӵ���BasicGenerator.create(Mytype.class),
	 * 		������ִ���鷳��new BasicGenerator<Mytype>(Mytype.class) �����û��ʹ���������ַ����Ļ���ͱ���Ҫʹ��new�ؼ��������ֲ�����
	 */
	//ͨ��BasicGenerator�����Ժ����׵�ΪCountedObject����һ��Generator
	public static void main(String[] args) {
		Generator<CountedObject> gen = BasicGenerator.create(CountedObject.class);//����һ���������ɶ����Generator(����������)
		for (int i = 0; i < 4; i++) {
			System.out.println(gen.next());
		}
		/*
		 * ���Կ�����ʹ�÷��ͷ���������Generator���󣬴�����������Ҫ��д�Ĵ��롣java����Ҫ����Class�����Ա�Ҳ������create()�н���  �����ƶ�
		 */
	}
}
//����һ���򵥾���Ĭ�Ϲ���������
class CountedObject {
	private static long counter = 0;
	private final long id = counter++;//������Լ�¼�����˶��ٵĶ���ʵ������Ϊ����һ�������Ҫ��ʼ��һ����������Կ���ͳ�Ƴ���
	public long id() {return id;}
	public String toString() {
		return "createObject" + id;
	}
}
