package Homeworks.HomeworkDay01;

public class Main {
    public static String getType(Object obj){
        return obj.getClass().toString();
    }
    /**
     * 文档注释
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello world!");
        float d1 = 423432423f;
        System.out.println(d1);
        float d2 = d1 + 1;
        System.out.println(d2);
        if(d1==d2){
            System.out.println("d1==d2");
        }else {
            System.out.println("d1!=d2");
        }
        System.out.println(4.23E2);
        System.out.println(4.23e2);
        char c = 'd';
        System.out.println(c);
        int v = 96;
        char ll = (char)v;
        System.out.println("ll: "+ll);
        long k = 4;
        var num = v + k;
        System.out.println(getType(num));
        System.out.println(5<<2);
        System.out.println("=====");
        int wwww = 10;
        boolean eeee = true;




    }
}
