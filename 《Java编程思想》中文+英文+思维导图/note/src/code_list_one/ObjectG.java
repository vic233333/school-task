package code_list_one;

import java.util.Random;

//��дһ������ģ��ͶӲ�ҵĽ��
public class ObjectG {
    public static void main(String[] args) {
        String s;
        Random random = new Random();
        int nextInt = random.nextInt(2) + 1;
        if (nextInt == 1) {
            s = "����";
        } else {
            s = "����";
        }
        System.out.println(s);
    }
}
