package code_list_one;

//��дһ������չʾ�Զ���װ���͹��ܶ����еĻ������ͺͰ�װ���Ͷ�������
public class ObjectE {

    public static Integer changePackageType(int i) {
        Integer packageType = i;
        return packageType;
    }

    public static Double changePackageType(double d) {
        Double packageType = d;
        return packageType;
    }

    public static Float changePackageType(float f) {
        Float packageType = f;
        return packageType;
    }

    public static void main(String[] args) {
        int i = 47;
        System.out.println(i);
        //����������intת��Ϊ���װ����
        Integer integer = ObjectE.changePackageType(i);
        System.out.println(integer.hashCode());
        double d = 2.2;
        System.out.println("����ǻ������ͣ�" + d);
        //����������doubleת��Ϊ���װ����
        Double dou = ObjectE.changePackageType(d);
        //�������һ����ϣ��ֵ�������Ѿ�����������ת��Ϊ��װ������
        System.out.println("ת��Ϊ��װ���ֵ�ǣ�" + dou + "�ð�װ���hashCodeֵ�ǣ�" + dou.hashCode());
    }
} 
