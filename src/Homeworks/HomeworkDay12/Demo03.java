package Homeworks.HomeworkDay12;

import java.io.*;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/15
 */
public class Demo03 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(new File("F:/1.mp4"));
        FileOutputStream fos = new FileOutputStream("F:/2.mp4");

        byte [] buf = new byte[1024];
        int len = fis.read(buf);
        while(len!=-1){
            fos.write(buf, 0, len);
            len = fis.read(buf);
        }

        fis.close();
        fos.close();
    }
}
