package code_list_one;

/*
 * ��дһ������:��Ҫ���ٵ��ֽڲ�������һ���ض���String�����е���Ϣ
 */
public class ObjectC {

    public int storage(String s) {
        return s.length() * 2;
    }

    public static void main(String[] args) {
        String s = new String("����һ���ֶ�");
        ObjectC objectC = new ObjectC();
        int storage = objectC.storage(s);
        System.out.println(storage);
    }
}
