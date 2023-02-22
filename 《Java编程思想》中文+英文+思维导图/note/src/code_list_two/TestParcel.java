package code_list_two;

public class TestParcel {
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        //�����ڲ����������ת�ͣ������ǽӿ����͵ģ�ָ������ڲ��ࡣ��ȫ���ص��ڲ���ʵ�ֵ�ϸ��
        Contents c = p.getContents();
        System.out.println(c.value());
        /*
         *	��Ҳ��һ���ڲ�������ת�� (�ýӿ����ͽ���)
         *	private�ڲ����������ṩһ��;����ͨ�����ַ�ʽ������ȫ��ֹ�κ����������͵ı��롣ͬʱ�ڿͻ���Ҳ���ܷ����κ������ӵ� ԭ�������ڸýӿڵķ�����
         */
        Destination1 d = p.getDestination1("H");
        System.out.println(d.readLabel());
    }
}

interface Destination1 {
    String readLabel();//����һ������
}

interface Contents {
    int value();
}

class Parcel4 {
    //����һ���ڲ���
    private class PContents implements Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    //������һ���ڲ���,protectedֻ����������������ͬһ�������Է��ʵ�PDestination1
    protected class PDestination1 implements Destination1 {
        private String label;

        public PDestination1(String label) {
            this.label = label;
        }

        public String readLabel() {
            return label;
        }
    }

    public Destination1 getDestination1(String labe) {
        return new PDestination1(labe);
    }

    public Contents getContents() {
        return new PContents();
    }
}
