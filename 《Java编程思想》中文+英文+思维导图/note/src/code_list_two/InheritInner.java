package code_list_two;

/*
 * �ڲ���ļ̳�
 * 	���ڲ���Ĺ������������ӵ�ָ������Χ���������ã������ڼ̳��ڲ����ʱ�򣬻��úܸ��ӡ�
 * 	���������ڣ��Ǹ�ָ����Χ������"����"�����ñ��뱻��ʼ����
 */
public class InheritInner extends WithInner.Inner { //����̳��ڲ���
    InheritInner(WithInner w) {  //
        w.super();//ʹ��super()�﷨
    }
}

class WithInner {
    class Inner {
    }
}
