package code_list_two;

//��ʼ���ֶ��ˣ���������Ϊfinal
public class Parcel9 {
    public Destination1 destination1(final String dest) {
        return new Destination1() {
            private String str = dest;//�������ʹ�������ⲿ����Ķ���(ͨ����������)����Ҫ����������Ϊfinal

            public String readLabel() {
                return str;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 parcel9 = new Parcel9();
        Destination1 destination1 = parcel9.destination1("HH");
        System.out.println(destination1.readLabel());
    }
}
