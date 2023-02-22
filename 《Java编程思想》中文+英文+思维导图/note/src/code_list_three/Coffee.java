package code_list_three;
import java.util.Iterator;
import java.util.Random;
/*
 * ����Ҳ������Ӧ�ڽӿڡ�����������������һ��ר�Ÿ��𴴽�������ࡣʵ���ϣ����ǹ����������ģʽ��һ��Ӧ�á�
 */
interface Generator<T> {T next();}
/*
 * ����һ�����ͽӿڡ���������Generator�ӿ�ȷ����next()�ķ���ֵ�ǲ������͵�
 */
public class Coffee {
	private static long counter = 0;
	private final long id = counter++;
	public String toString() {return this.getClass().getSimpleName() + " " + id;}
	public static void main(String[] args) {
		CoffeeGenerator gen = new CoffeeGenerator();
		for (int i = 0; i < 5; i++) {
			System.out.println(gen.next());
		}
		for (Coffee c : new CoffeeGenerator(5)) {
			System.out.println(c);
		}
	}
}
class Latte extends Coffee {}
class Mocha extends Coffee {}
class Cappuccino extends Coffee {}
class Americano extends Coffee {}
class Breve extends Coffee {}

//��дһ���࣬ʵ��Generator<Coffee>�ӿڣ�����������ɲ�ͬ���͵�Coffee����
class CoffeeGenerator implements Generator<Coffee>,Iterable<Coffee> {
	private Class[] types = {Latte.class,Mocha.class,Cappuccino.class,Americano.class,Breve.class};
	private static Random rand = new Random(47);
	public CoffeeGenerator() {}
	private int size = 0;
	public CoffeeGenerator(int size) {
		this.size = size;
	}
	//����Generator<>�ӿڵķ���,���õĻ��ͷ���һ���������
	public Coffee next() {
		try {
			return (Coffee)types[rand.nextInt(types.length)].newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	//���ǵ������ķ���
	public Iterator<Coffee> iterator() {
		return new Iterator<Coffee>() {
			int count = size;
			public boolean hasNext() {
				return count > 0;
			}
			public Coffee next() {
				count--;
				return CoffeeGenerator.this.next();//.this���ֻ�ȥ�����ⲿ��
			}
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}
	
}

