package code_list_one;

class Stringed extends Instrument1 {
    public void play(Note n) {
        System.out.println("Stringed.play()");
    }
}

class Brass extends Instrument1 {
    public void play(Note n) {
        System.out.println("Brass.play()");
    }
}

public class Music2 {
    /*
     * �����ӵ��������� ҪΪ���д�ض����͵ķ���
     * 	�������������������Ļ��д����Ĺ�����д��ά������
     *
     */
    public static void tune(Wind1 w) {
        w.play(Note.MIDDLE_C);
    }

    public static void tune(Stringed s) {//����һ�����;�Ҫ������һ����������������ά��
        s.play(Note.MIDDLE_C);
    }

    public static void tune(Brass b) {
        b.play(Note.MIDDLE_C);
    }
}
