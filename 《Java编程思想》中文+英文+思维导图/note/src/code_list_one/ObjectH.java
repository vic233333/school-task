package code_list_one;

/*
 * ����һ���࣬��Ӧ����һ�������������εķ������̳в���һ�����࣬�����һ���÷��������ض��壬չʾ���ĸ������ڵ������ж��ǿ���ʹ�õġ�
 */
public class ObjectH {

    public static void main(String[] args) {
        ObjectHAB hac = new ObjectHAB();
        //�ֱ�������ĸ�����
        char c = hac.methodA('A');
        float f = hac.methodA(1.2f);
        int i = hac.methodA(1);
        ObjectHAC objecyhac = hac.methodA(new ObjectHAC());
        System.out.println(c);
        System.out.println(f);
        System.out.println(i);
        System.out.println(objecyhac);
    }
}

class ObjectHA {
    char methodA(char c) {
        System.out.println("ObjectHA.methodA.char");
        return c;
    }

    float methodA(float f) {
        System.out.println("ObjectHA.methodA.float");
        return f;
    }

    int methodA(int i) {
        System.out.println("ObjectHA.methodA.int");
        return i;
    }
}

class ObjectHAC {
}

class ObjectHAB extends ObjectHA {
    //������һ�����صķ����������Ļ��͵������ĸ����صķ�����(��������������һ��)
    ObjectHAC methodA(ObjectHAC hac) {
        System.out.println("ObjectHAB.methodA.ObjectHAC");
        return hac;
    }
}
