package code_list_two;

//����һ�������ڲ�����࣬���ڲ�����һ����Ĭ�ϵĹ�������������һ��Ҳ�����ڲ�����࣬���ڲ���̳��Ե�һ���ڲ���
public class ObjectS {
    class ObjectSC extends ObjectSA.ObjectSB {
        public ObjectSC(ObjectSA objectSA, String s) {
            objectSA.super(s);
        }
    }
}

class ObjectSA {
    class ObjectSB {
        private String s;

        public ObjectSB(String s) {
            this.s = s;
        }
    }
}
