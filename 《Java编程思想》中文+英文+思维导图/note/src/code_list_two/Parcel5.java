package code_list_two;

//�ֲ��ڲ���
public class Parcel5 {
    public Destination1 destination(String s) {
        //����һ���ֲ��ڲ��࣬�Ƕ����ڷ�������ģ�ʵ��Destination1�ӿ�
        class PDestination implements Destination1 {
            private String label;

            private PDestination(String label) {
                this.label = label;
            }//����һ��������,��Ҫ�������������Ĳ�������������

            public String readLabel() {
                return label;
            }
        }
        return new PDestination(s);//����������ת����
    }

    public static void main(String[] args) {
        Parcel5 parcel5 = new Parcel5();
        Destination1 destination = parcel5.destination("H");
        System.out.println(destination.readLabel());
    }

}