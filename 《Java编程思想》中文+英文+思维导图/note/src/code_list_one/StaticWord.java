package code_list_one;

public class StaticWord {

    Bowl Bowl2 = new Bowl("���ǷǾ�̬");
    static Bowl Bowl1 = new Bowl("���Ǿ�̬");//��̬��Ҫ�ȷǾ�̬�ĳ�ʼ���磬���ܷǾ�̬���ھ�̬��ǰ��

    public static void main(String[] args) {
        StaticWord staticWord = new StaticWord();
    }
}

class Bowl {
    public Bowl(String marker) {
        System.out.println("marker��ʼ���ˣ�" + marker);
    }
}
