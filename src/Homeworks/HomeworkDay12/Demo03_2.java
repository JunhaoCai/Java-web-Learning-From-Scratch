package Homeworks.HomeworkDay12;

import java.io.*;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/15
 */
public class Demo03_2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(new File("d:/1.mp4"));
        FileOutputStream fos = new FileOutputStream("d:/2.mp4");
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        byte [] buf = new byte[10];
        int len = bis.read(buf);
        while(len!=-1){
            bos.write(buf, 0, len);
            len = bis.read(buf);
        }
        bis.close();
        bos.close();
    }
}
