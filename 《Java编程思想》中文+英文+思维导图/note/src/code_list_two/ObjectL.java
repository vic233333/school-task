package code_list_two;

//ȷ����Χ���Ƿ���Է������ڲ����privateԪ��
public class ObjectL {
    //����һ���ڲ���
    class ObjectLInner {
        private int i = 22;

        private void method() {
            System.out.println(i);
        }
    }

    //��Χ�ೢ�Է����ڲ��������
    public void toInner() {
        ObjectLInner objectLInner = new ObjectLInner();
//		objectLInner.i;//��Χ����ʲ����ڲ����private������
    }
}
