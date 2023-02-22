package code_list_one;

//��������ת�� 
class Instrument1 {
    public void play(Note n) {
        System.out.println("Instrument1.play()");
    }
}

class Wind1 extends Instrument1 {
    public void play(Note n) {
        System.out.println("Wind.play()");
    }
}

public class Music {

    /*
     * �÷�������һ��Instrument1���͵����ã�ͬʱҲ�����κε�����Instrument1������
     * 	��һ��Wind1���ô��ݵ��÷���ʱ���Ͳ���Ҫ�κε�����ת�����������������--��ΪWind��Instrument1�̳ж�����
     * 	��Wind����ת�͵�Instrument1���ܻ�"��С"�ӿ�(����Ӧ����ָ�����ĸ���)�����ǲ����Instrument1��ȫ���ӿڸ�С��
     */
    public static void tune(Instrument1 i) {
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind1 wind = new Wind1();
        tune(wind);//���ﱾ���ǽ���Instrument1���͵ģ����ǿ��Խ����ĵ�����Wind1�Ž�ȥ������������ת��
    }

}
