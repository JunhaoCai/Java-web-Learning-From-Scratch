package Homeworks.HomeworkDay12;

import java.io.*;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/15
 */
public class Demo04 {
    public static void copyFile(File sourceFile, File targetFile) throws IOException {
        BufferedInputStream inBuff = null;
        BufferedOutputStream outBuff = null;
        try {
            inBuff = new BufferedInputStream(new FileInputStream(sourceFile));
            outBuff = new BufferedOutputStream(new FileOutputStream(targetFile));
            byte[] b = new byte[1024 * 5];
            int len;
            while ((len = inBuff.read(b)) != -1) {
                outBuff.write(b, 0, len);
            }
            outBuff.flush();
        } finally {
            if (inBuff != null)
                inBuff.close();
            if (outBuff != null)
                outBuff.close();
        }
    }

    public static void copyDirectiory(String sourceDir, String targetDir)
            throws IOException {
        File fSourceDir = new File(sourceDir);
        if(!fSourceDir.exists() || !fSourceDir.isDirectory()){
            System.out.println("源目录不存在");
            return;
        }
        File fTargetDir = new File(targetDir);
        if(!fTargetDir.exists()){
            fTargetDir.mkdirs();
        }
        File[] file = fSourceDir.listFiles();
        for (int i = 0; i < file.length; i++) {
            if (file[i].isFile()) {
                File sourceFile = file[i];
                File targetFile = new File(fTargetDir, file[i].getName());
                copyFile(sourceFile, targetFile);
            }
            if (file[i].isDirectory()) {
                String subSourceDir = sourceDir + File.separator + file[i].getName();
                String subTargetDir = targetDir + File.separator + file[i].getName();
                copyDirectiory(subSourceDir, subTargetDir);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        copyDirectiory("d:/a.txt","d:/a.txt");
    }
}


