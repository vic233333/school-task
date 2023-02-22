package code_list_three;

import java.util.ArrayList;
import java.util.List;

public class BankTeller {
	public static void main(String[] args) {
		List<Customer> list = new ArrayList<Customer>();
		Generators.fill(list, Customer.generator(), 4);//Customer.generator()����һ������һ����generator����
		System.out.println(list);
		List<Teller> list2 = new ArrayList<Teller>();
		Generators.fill(list2, Teller.generator, 5);//Teller.generator  ֻ����һ������
		System.out.println(list2);
		/*
		 * Customer��Teller�඼��ֻ��private�Ĺ����������ǿ����ʹ��Generator����(����������)��ǿ����ʹ�ö�������������������
		 * 	Customer��һ��generator()�ķ�����ÿ��ִ�ж�������һ���µĶ��󣬵�����ʵ���ǲ�����Ҫ������󣬶���������(Generator)ֻҪһ���Ϳ�����/
		 * 	Teller��ֻ����һ��generator������main������Ҳ���п����������ִ���Generator�ķ�ʽ����fill����ʹ����
		 * 	
		 */
	}
}
class Customer {
	private static long counter = 1;
	private final long id = counter++;
	private Customer() {}
	public String toString() {return "Customer" + id;}
	public static Generator<Customer> generator() {
		return new Generator<Customer>() {
			public Customer next() {
				return new Customer();
			}
		};
	}
}
class Teller {
	private static long counter = 1;
	private final long id = counter++;
	private Teller() {}
	public String toString() {return "Teller" + id;}
	public static Generator<Teller> generator = new Generator<Teller>() {
		public Teller next() {
			return new Teller();
		}
	};
}
