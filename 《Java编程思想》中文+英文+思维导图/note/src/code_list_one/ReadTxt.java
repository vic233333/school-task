package code_list_one;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * ����main���� ����Ч��
 */
public class ReadTxt {
    private FileReader reader;
    private BufferedReader bufferedReader;

    /*
     * ��һ���ļ���·��������һ������
     */
    public ReadTxt(String string) throws FileNotFoundException {
        this.reader = new FileReader(string);
        this.bufferedReader = new BufferedReader(reader);
    }

    //����ID���û���Ϣ��ѯ����
    private Employee findEmployeeById(int id) throws IOException {
        Employee employee = new Employee();
        boolean flag = true;
        String mes = null;
        while (flag) {
            mes = bufferedReader.readLine();
            //����ָ�����ַ������зָ��String����
            String[] mesArr = mes.split("#");
            if (id == Integer.valueOf(mesArr[0])) {
                employee.setID(id);
                employee.setName(mesArr[1]);
                employee.setManagerID(Integer.valueOf(mesArr[2]));
                flag = false;
                break;
            }
        }
        return employee;
    }

    //ָ��һ���û���ID���������� ��Ϣ��ѯ����
    private ArrayList<Employee> findBranchByManagerID(int managerID) throws IOException {
        ArrayList<Employee> list = new ArrayList<Employee>();
        while (true) {
            String mes = null;
            mes = bufferedReader.readLine();
            if (mes == null) {
                break;
            }
            String[] mesArr = mes.split("#");
            if (managerID == Integer.valueOf(mesArr[2])) {
                Employee employee = new Employee(Integer.parseInt(mesArr[0]), mesArr[1], Integer.parseInt(mesArr[2]));
                list.add(employee);
            }
        }
        return list;
    }

    //����ID������Ϣ��������Ϣȫ����ӡ����
    public void findSelfAndBranch(int id) throws IOException {
        Employee employee = findEmployeeById(id);
        System.out.println(employee.getID() + "  " + employee.getName());
        ArrayList<Employee> employeeBranch = findBranchByManagerID(employee.getID());
        for (Employee e : employeeBranch) {
            System.out.println("  " + e.getID() + "  " + "--" + e.getName());
        }
    }

    //�����е�Ա�����Ե�ID��ѯ����
    public ArrayList<Integer> findAllEmployee() throws IOException {
        //���������װԱ����ID��
        ArrayList<Integer> list = new ArrayList<Integer>();
        String mes = null;
        while (true) {
            mes = bufferedReader.readLine();
            if (mes == null) {
                //mesΪnull�����ı���ĩβ
                break;
            }
            String[] mesArr = mes.split("#");
            //������Ա����ID��ѯ�����Ž�һ����������
            list.add(Integer.parseInt(mesArr[0]));
        }
        return list;
    }

    public static void main(String[] args) throws IOException {
        ReadTxt readTxt = new ReadTxt("data.txt");
        ArrayList<Integer> list = readTxt.findAllEmployee();
        System.out.println(list);
    }
}
