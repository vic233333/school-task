package code_list_two;

//����һ������private���private�������ࡣ����һ���ڲ��࣬����һ�������޸���Χ�����͵�����Χ��ķ���������Χ����һ�����������Դ����ڲ�����󡣲��ҵ����ڲ���ķ���
public class ObjectK {
    private int i = 1;

    private void method() {
        System.out.println("ObjectK.method" + "  i��ֵΪ��" + i);
    }

    //��ȡ�ڲ������
    public ObjectKInner getObjectKInner() {
        (new ObjectKInner()).toOuter(6);//��Χ�໹���Ե����ڲ���ķ���
        return new ObjectKInner();
    }

    class ObjectKInner {
        //��һ�ַ�ʽ
        public void toOuter(int j) {
            i = j;//�ڲ�����Է�����Χ�����������
            method();
        }

        //�ڶ��ַ�ʽ
        public void toOuter2(int j) {
            ObjectK.this.i = j;
            ObjectK.this.method();
        }
    }

    public static void main(String[] args) {
        ObjectK objectK = new ObjectK();
        ObjectKInner objectKInner = objectK.getObjectKInner();
        objectKInner.toOuter(3);//����ͨ���ڲ���Ϳ����޸���Χ���������
        objectKInner.toOuter2(4);//ͨ�����ַ���Ҳ�����޸���Χ�������
    }
}
