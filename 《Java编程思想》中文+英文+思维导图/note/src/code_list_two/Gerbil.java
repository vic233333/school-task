package code_list_two;

import java.util.ArrayList;
import java.util.List;

//�������������������Ԫ�ء���������Ԫ��
public class Gerbil {
	private int gerbilNumber;
	public Gerbil(int gerbilNumber) {
		this.gerbilNumber = gerbilNumber;
	}
	public void hop() {
		System.out.println(gerbilNumber);
	}
	public static void main(String[] args) {
		//����һ��ArrayList������
		List<Gerbil> list = new ArrayList<Gerbil>();
		//�����������Ԫ��
		for (int i = 0; i < 10; i++) {
			list.add(new Gerbil(i));
		}
		//��������
		for (int i = 0; i < list.size(); i++) {
			(list.get(i)).hop();
		}
	}
}
