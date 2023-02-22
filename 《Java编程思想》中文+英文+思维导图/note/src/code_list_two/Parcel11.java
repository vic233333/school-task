package code_list_two;

//Ƕ����
public class Parcel11 {
    //����һ��Ƕ���࣬����Χ�࣬��static����class
    private static class ParcelContents implements Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    //��������һ��Ƕ����
    protected static class ParcelDestination implements Destination1 {
        private String str;

        private ParcelDestination(String str) {
            this.str = str;
        }

        public String readLabel() {
            return str;
        }

        static int i = 1;//������Ƕ�����ڲ�����һ��static�ֶ�
    }

    public static Contents getContents() {
        return new ParcelContents();//�������������ת��
    }

    public static Destination1 getDestination1(String s) {
        return new ParcelDestination(s);//����Ҳ����������ת��
    }
}
