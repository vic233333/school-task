package code_list_two;

import code_list_one.Note;

/*
 *	����������ͳ��󷽷��ǳ����õģ���Ϊ���ǿ���ʹ��ĳ�������ȷ�����������໹�Ǻ����õ��ع����ߣ�ʹ�����Ǻ����׵ؽ������������ż̳в�νṹ�����ƶ�
 */
public class Music4 {
    static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    static void tune(Instrument[] arr) {
        for (Instrument i : arr) {
            i.play(Note.MIDDLE_C);
        }
    }

    public static void main(String[] args) {
        Instrument[] arr = {new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind()};
        tune(arr);
    }
}

abstract class Instrument {
    private int i;

    public abstract void play(Note n);//����һ�����󷽷�����һ�����󷽷�������뱻����Ϊ������

    public abstract void adjust();//��Ҳ��һ�����󷽷�

    public String what() {
        return "Instrument";
    }
}

//�̳г�����ĵ�����,ǿ�Ƶ��������ʵ�ֻ���ĳ��󷽷������򵼳���Ҳ�ǳ�����
class Wind extends Instrument {
    //�������е����������ඨ��
    public void play(Note n) {
        System.out.println("Wind.play" + n);
    }

    public void adjust() {
        System.out.println("Wind.adjust");
    }

    //������д����ķ���
    public String what() {
        return "Wind.what";
    }
}

class Percussion extends Instrument {
    //������������������󷽷�
    public void play(Note n) {
        System.out.println("Percussion.play" + n);
    }

    public void adjust() {
        System.out.println("Percussion.adjust");
    }

    //������д����ķ���
    public String what() {
        return "Percussion.what";
    }
}

class Stringed extends Instrument {
    //������������������󷽷�
    public void play(Note n) {
        System.out.println("Stringed.play" + n);
    }

    public void adjust() {
        System.out.println("Stringed.adjust");
    }

    //������д����ķ���
    public String what() {
        return "Stringed.what";
    }
}

class Brass extends Instrument {
    //������������������󷽷�
    public void play(Note n) {
        System.out.println("Brass.play" + n);
    }

    public void adjust() {
        System.out.println("Brass.adjust");
    }
}

class Woodwind extends Wind {
    public void play(Note n) {
        System.out.println("Woodwind.play" + n);
    }

    public String what() {
        return "Woodwind.what";
    }
}

