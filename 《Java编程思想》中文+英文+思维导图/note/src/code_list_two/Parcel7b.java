package code_list_two;

//������һ���������չ��д
public class Parcel7b {
    class MyContents implements Contents {
        private int i = 123;

        public int value() {
            return i;
        }
    }

    public Contents contents() {
        return new MyContents();//������������ת�ͣ�MyContents��ʵ����Contents�ӿڡ�������Contents������ָ��MyContents��Ķ���
    }

    public static void main(String[] args) {
        Parcel7b parcel7b = new Parcel7b();
        Contents c = parcel7b.contents();
        System.out.println(c.value());
    }
}
