package code_list_one;

//protected�ؼ���
public class Orc extends Villain {
    private int orcNumber;

    public Orc(String name, int orcNumber) {
        super(name);
        this.orcNumber = orcNumber;
    }

    public void change(String name) {
        set(name);//�����ǵ��ø����set��������Ϊ�����set������protected�����������ĵ��������ǿ���ʹ�õġ�
        /*
         * ͨ������������Ըı丸���е�ĳ����(ֻ�������ĵ�������Ըı�)
         */
    }

    public static void main(String[] args) {
        Orc orc = new Orc("aa", 12);
        orc.print();
        orc.change("bb");//����˽�е����Ѿ����ı�
        orc.print();
    }
}

class Villain {
    private String name;

    public Villain(String name) {
        this.name = name;
    }

    /*
     * �����ĵ������У��ǿ��Է������������
     * 	�����private�Ļ�����ֻ�б�����Է���
     * 	  �����public�����κ��˶�����ʹ��
     */
    protected void set(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }
}
