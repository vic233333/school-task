package code_list_one;


public class Lunch {
    public static void main(String[] args) {
        Soup.makeSoup();
        Soup2.access();
        Soup2.access();
        Soup2.access();// ���۵��ø÷������ٴΣ���ֻ�ᴴ�� �ö���һ�Ρ���Ϊ��static�����ã�ֻ�ᴴ��һ���ڴ�(Ҳ�ǵ���ģʽ�����)
    }
}

class Soup {
    /*
     * ע��:���û����ȷ�����ٴ���һ�����������ͻ���㴴��һ��Ĭ�Ϲ�����(�����κβ����Ĺ�����)
     */
    private Soup() {
        System.out.println("Soup�Ѿ�������");
    }//�κ��˶����ܴ��������(ֻ�������������Ū)��������ͬһ�����뵥ԪҲ������

    public static Soup makeSoup() {
        return new Soup();
    }
}

class Soup2 {
    private Soup2() {
        System.out.println("Soup2�Ѿ�������");
    }

    private static Soup2 s2 = new Soup2();

    public static Soup2 access() {
        return s2;
    }
}

