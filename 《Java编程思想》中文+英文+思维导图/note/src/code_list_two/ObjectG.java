package code_list_two;

//��֤���ӿ��е�������ʽ��static��final
public class ObjectG {
    public static void main(String[] args) {
        System.out.println(ObjectGA.A);//ʹ�������Ϳ���ֱ�ӷ��ʣ�֤����static
//		ObjectGA.A = 2;//�ӿ��е�����final�����ܸı�����ֵ

    }
}

interface ObjectGA {
    int
            A = 1, B = 2;
}