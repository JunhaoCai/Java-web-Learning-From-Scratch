package Homeworks.HomeworkDay12;

import java.io.*;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/15
 */
public class Demo02 {
    public static void main(String[] args) throws IOException {
        int num1 = 50;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeInt(num1);
        byte [] buf = baos.toByteArray();
        baos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(buf);
        ObjectInputStream ois = new ObjectInputStream(bais);
        int num2 = ois.readInt();
        System.out.println(num2);
        bais.close();
    }
}
