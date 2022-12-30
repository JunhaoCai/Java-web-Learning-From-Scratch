package Homeworks.HomeworkDay01;

import java.util.Scanner;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2022/12/27
 * @content 变量
 *          数据类型：两种
 *              1. 基本数据类型（四类八种）
 *                  1.整型
 *                      byte (8 bits, -128 ~ 127),
 *                      short (16 bits, -2 ** 15 ~ 2 ** 15 - 1),
 *                      int (32 bits, -2 ** 31 ~ 2 ** 31 - 1),
 *                      long (64 bits, -2 ** 63 ~ 2 ** 63 - 1)
 *                          需要在值的后面加L
 *                  2.浮点型(取值范围比long大)
 *                      float (32 bits, )
 *                          需要在值的后面加F
 *                      double (64 bits, )
 *                          double可以存的小数点位数更多
 *                  3.字符型
 *                      char (16 bits, 0 ~ 2 ** 16 - 1)
 *                          单引号内只能有一个元素
 *                  4.布尔型
 *                      boolean (8 bits, )
 *              2. 引用数据类型

 *            标识符命名规则：
 *              只能用 字母，数字，下划线，$, 数字不能开头（强制性）
 *              下划线和 $ 尽量别用
 *              不能使用关键字
 *              驼峰式命名：
 *                  类名：所有单词首字母大写(大驼峰uppercamelcase), studentController
 *                  变量：（小驼峰）第一个单词，所有字母小写，如果多个单词，第一个单词首字母小写，其余单词首字母大写
 *
 *      除法：
 *          /：取整
 *          %：取mod，取余
 *
 *       自动类型转换：小 -> 大(位数，精度)
 *       强制类型转换：大 -> 小 会丢精度
 *
 * 整数：int
 * 小数：double
 */
public class Test {
    public static void main(String[] args) {
        byte b = -128;
        long a = 12000000000000000L;
        float c = 12000000.0F;
        char d = 'a';
        boolean e = true;
        System.out.println(b + a);
        double v1 = 1.5;
        int v2 = (int) v1;
        System.out.println(v2);
        char v3 = (char) v2;
        System.out.println(v3);

        var x = 10;
        int num1 = 1;
        System.out.println(num1++ + num1 + ++num1 + num1++);
        byte m = 12;
        m = (byte) (m + 1);
        int k = 12;
        k = k+1;

        Scanner sc = new Scanner(System.in);
        int scint = sc.nextInt();
        System.out.println("input : "+scint);


        /**
         * !(非)
         * & &&（与，并且）
         * &: 除了是逻辑运算符之外，还可以是位运算符；
         *      会把所有条件判断一遍。
         * &&：只能做逻辑运算；
         *      只要遇见false，整个判断程序停止执行，返回false的结果。
         * | || (或，或者)
         */
        System.out.println(true && false);


        /**
         * 比较运算符
         */
        int qw = 10;
        System.out.println(qw <=10);

        /**
         * 位运算符：数字转换成二进制
         * & 与
         * | 或
         * ^ 异或
         * << 左移: 二进制往左移位
         * >> 右移
         * >>> 无符号右移 不把1做为负数
         */

        /**
         * 10 -> 1010
         * 5 -> 0101
         * 按位 并且
         * 0000
         */
        System.out.println(10 & 5);
        System.out.println(10 | 5);
        System.out.println(10 ^ 5);
        System.out.println(10 << 1);
        System.out.println(10 >> 1);
        System.out.println(10 >>> 1);

        /**
         * 三元运算符
         * 表达式a ? 值1[表达式1] : 值2[表达式2]
         * true -> 值1 false -> 值2
         * 1. 表达式a必须要得到true或false的结果。
         * 2. 值1 和 值2 的数据类型最好要统一。
         *
         */
        int w = 10;
        int r = 20;
        var result = w > r ? a:"w > r不成立";
        System.out.println(w > r ? "w > r成立":"w > r不成立");

        /**
         * 运算符的优先级
         */
        Scanner scan1 = new Scanner(System.in);
        int input1 = scan1.nextInt();
        Scanner scan2 = new Scanner(System.in);
        int input2 = scan2.nextInt();
        int max;
        max = input1 >= input2? input1:input2;
        System.out.printf("max: "+max);

        Scanner scan3 = new Scanner(System.in);
        int input3 = scan3.nextInt();
        int max2 = 0;
        max2 = input3 >= max? input3:max;
        System.out.println(max2);


    }
}
