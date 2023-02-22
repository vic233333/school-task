package code_list_three;

import java.util.Iterator;

public class Fibonacci implements Generator<Integer> {
	private int count = 0;
	public Integer next() {
		return fib(count++);
	}
	public int fib(int n) {
		if (n < 2) {return 1;}
		return fib(n-2) + fib(n-1);
	}
	public static void main(String[] args) {
		Fibonacci gen = new Fibonacci();
		for (int i = 0; i < 18; i++) {
			System.out.println(gen.next());//���ֵ���һ��next()�����ͷ���һ��������㣬���ͽӿ�������������
		}
	}
}
/*
 * ��������һ������дһ��ʵ��Iterable��Fibonacci�����������ǵ�һ��ѡ�������д���࣬����ʵ������Ľӿڣ������㲢������ӵ��Դ����Ŀ���Ȩ
 * 	���������ǻ�����һ��ѡ�񣬾���ʹ�� ������ ��ʵ����Ҫ�Ľӿڡ�����һ�������ģʽ
 */
class IterableFibonacci extends Fibonacci implements Iterable<Integer> {
	private int n;
	public IterableFibonacci(int n) {
		this.n = n;
	}
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			public boolean hasNext() {
				return n > 0;
			}
			public Integer next() {
				n--;
				return IterableFibonacci.this.next();
			}
			public void remove() {
			}
		} ;
	}
	public static void main(String[] args) {
		for (int st : new IterableFibonacci(18)) {
			System.out.println(st);
		}
	}
}









