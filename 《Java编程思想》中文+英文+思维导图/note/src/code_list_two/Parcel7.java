package code_list_two;

//������
public class Parcel7 {
    public Contents contents() {
        return new Contents() {  //new Contents(){}����˼�Ǵ���һ��  �̳л���ʵ���� Contents�������(�����û������)����������ȫ���¶���һ������
            private int i = 123;  //������Contents��Ļ����������ӵ���

            public int value() {
                return i;
            }  //���ʵ��Contents�ӿ���Ҫʵ���˷���
        };//����ķֺŲ����Ǳ�־���ڲ���Ľ�������ǵ��Ǳ��ʽ�Ľ�����
    }

    public static void main(String[] args) {
        Parcel7 parcel7 = new Parcel7();
        Contents c = parcel7.contents();
        System.out.println(c.value());
    }
}
