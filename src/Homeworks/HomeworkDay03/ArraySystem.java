package Homeworks.HomeworkDay03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2022/12/30
 */

public class ArraySystem {
    static int length = 2;
    static int adjustingLength = 0;

    static String[] names = new String[length];

    static int[] ids = new int[length];

    static String[] departments = new String[length];


    public static void addStaff(int id, String name, String department) {

        ++adjustingLength;

        ids = Arrays.copyOf(ids, adjustingLength);
        names = Arrays.copyOf(names, adjustingLength);
        departments = Arrays.copyOf(departments, adjustingLength);

        ids[ids.length - 1] = id;
        names[names.length - 1] = name;
        departments[departments.length - 1] = department;

    }


    public static void queryAllStaffInformation(){
        for (int i = 0; i < ids.length; i++) {
            if (names[i] != null && departments[i] != null && ids[i] != 0) {
                System.out.println("姓名：" + names[i]);
                System.out.println("部门：" + departments[i]);
                System.out.println("工号：" + ids[i]);
                System.out.println();
            }
        }
    }

    public static void queryAllStaffInformationUsingId(int id){
        boolean isExist = false;
        for (int i = 0; i < ids.length; i++) {
            if (names[i] != null && departments[i] != null && ids[i] != 0 && ids[i] == id) {
                System.out.println("姓名：" + names[i]);
                System.out.println("部门：" + departments[i]);
                System.out.println("工号：" + ids[i]);
                System.out.println();
                isExist = true;
            }
        }
        if (!isExist) {
            System.out.println("该员工不存在");
        }
    }

    public static void alterStaffInformationUsingId(int id) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入新的部门：");
        String department = scanner.next();
        System.out.println("请输入新的姓名：");
        String name = scanner.next();


       boolean isExist = false;
        for (int i = 0; i < length; i++) {
            if (names[i] != null && departments[i] != null && ids[i] != 0) {
                if (ids[i] == id) {
                    names[i] = name;
                    departments[i] = department;
                    isExist = true;
                }
            }
        }
        if (!isExist) {
            System.out.println("该员工不存在");
        }
    }

    public static void deleteStaff(int id){
        boolean isExist = false;
        for (int i = 0; i < ids.length; i++) {
            if (ids[i] != 0) {
                if (ids[i] == id) {
                    isExist = true;
                }
            }
        }
        if (isExist) {
            for (int i = 0; i < ids.length; i++) {
                if (ids[i] != 0) {
                    if ((i + 1) == id) {
                        ids[i] = 0;
                        --adjustingLength;
                    }
               }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("欢迎使用本系统！");
        while (true) {
            System.out.println("1. 新增员工  2. 查询员工  3. 修改员工  4. 删除员工  5. 退出系统");
            System.out.println("请输入 1-5： ");
            int type = Integer.parseInt(new Scanner(System.in).nextLine());
            Scanner sc = new Scanner(System.in);

            label: switch (type) {
                case 1:
                    System.out.println("请输入员工姓名：");
                    String name = sc.next();
                    System.out.println("请输入员工工号：");
                    int id = sc.nextInt();
                    System.out.println("请输入员工部门：");
                    String department = sc.next();
                    addStaff(id, name, department);
                    break;

                case 2:
                    while (true) {
                        System.out.println("1. 查询所有员工  2. 根据工号查询  3. 返回上一层");
                        int typeNewTwo = Integer.parseInt(new Scanner(System.in).nextLine());
                        if (typeNewTwo == 1) {
                            queryAllStaffInformation();
                            continue;
                        } else if (typeNewTwo == 2) {
                            System.out.println("请输入要查询的工号：");
                            int idNew = sc.nextInt();
                            queryAllStaffInformationUsingId(idNew);
                            continue;

                        } else if (typeNewTwo == 3) {
                            break label;
                        } else {
                            System.out.println("出错了");
                            System.exit(1);
                            break;
                        }
                    }

                case 3:
                    System.out.println("请输入要修改的员工工号：");
                    int idNewAlter = sc.nextInt();
                    alterStaffInformationUsingId(idNewAlter);
                    System.out.println("以下是更新后的数据：");
                    queryAllStaffInformation();

                    break;

                case 4:
                    System.out.println("请输入要删除的员工工号：");
                    int idNewDelete = sc.nextInt();
                    System.out.println("是否确认删除：1. 删除  2. 取消");
                    int isDelete = sc.nextInt();
                    if (isDelete == 1){
                        deleteStaff(idNewDelete);
                        System.out.println("删除成功！");
                        System.out.println("以下是删除后的数据：");
                        queryAllStaffInformation();
                    }
                    break;

                default:
                    System.exit(1);
                    break;
            }
        }
    }
}
