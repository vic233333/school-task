package code_list_one;

public class Hide {
    public static void main(String[] args) {
        Bart bart = new Bart();
        char c = bart.methodA('A');
        float f = bart.methodA(1.2f);
        float f1 = bart.methodA(1);//����Ӧ���Զ��Ľ������͵�ת��
        Milhouse milhouse = bart.methodA(new Milhouse());
        System.out.println(c);
        System.out.println(f);
        System.out.println(f1);
        System.out.println(milhouse);
        /*
         * ˵��Bart��Homer�е��������ط������ǿ��õ�
         * 	Ҫ�븲��һ�����صķ���������Ҫʹ���������ȫ��ͬ������ǩ���Լ�����ֵ����()�����Ϳ��Ը���ԭ���ķ���
         */
    }
}

class Homer {
    /*
     * �ǵ÷���ֵ���Ͳ�����Ϊ���ص����ݣ������������ص�����֮һ
     */
    char methodA(char c) {
        System.out.println("Homer.methodA.char");
        return c;
    }

    float methodA(float f) {
        System.out.println("Homer.methodA.float");
        return f;
    }
}

class Milhouse {
}

class Bart extends Homer {
    //��������˻��෽�������أ�������һ��������һ��
    Milhouse methodA(Milhouse m) {
        System.out.println("Bart.methodA.Milhouse");
        return m;
    }
    /*
     * javaSE5.0��������@Overrideע�⣬�������ǹؼ��֣����ǿ��Ե��ɹؼ�����ʹ��
     * 	������Ҫ��дĳ������ʱ������ѡ��������ע�⣬���㲻��������(������һ���������뷵��ֵ���Ͳ�һ��) ������ ��д(��д��Ҫ����ǩ���뷵��ֵ����һ��)ʱ �ͻᱨ��
     * 	@Overrideע����Է�ֹ���ڲ�������ʱ���������������
     */
}