package code_list_two;

//�����ⲿ��
public class Parcell {
    //�����ڲ���
    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    //������һ���ڲ���
    class Destination {
        private String label;//����һ����

        public Destination(String label) {
            this.label = label;
        }//����һ��������

        String getLabel() {
            return label;
        }//����һ������
    }

    //ע������������
    public Contents contents() {
        return new Contents();
    }//�����õ������������ģʽ������һ�������Ϳ��Է���һ��ָ���ڲ��������

    public Destination destination(String s) {
        return new Destination(s);
    }//���ﴫ�˲���s����Ϊ�������������Ҫһ��String���͵�����

    //����������Ի���������󣬲���������һ������ķ���
    public void ship(String dest) {
        Contents c = contents();//����contents�������
        Destination d = destination(dest);
        System.out.println(d.getLabel());
    }

    public static void main(String[] args) {
        Parcell p = new Parcell();
        p.ship("dest");
        //����ʹ�����ַ�ʽ��ָ�������������͡��ⲿ����.�ڲ�����
        Parcell.Contents c1 = p.contents();//
        Parcell.Destination d2 = p.destination("1");
    }

}
