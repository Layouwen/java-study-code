package 复制多级文件夹;

import java.io.*;

public class Start {
  public static void main(String[] args) throws IOException {
    File srcFile = new File("moreFilesDemo");
    File destFile = new File("Test");

    copyFolder(srcFile, destFile);
  }

  // 复制文件夹
  private static void copyFolder(File srcFile, File destFile) throws IOException {
    // 判断是否为目录
    if (srcFile.isDirectory()) {
      String srcFileName = srcFile.getName();
      File newFolder = new File(destFile, srcFileName);
      // 如果目标不存在，则创建该同名目录
      if (!newFolder.exists()) {
        newFolder.mkdir();
      }
      // 获取该目录下的所有文件
      File[] fileArray = srcFile.listFiles();

      // 遍历数组，获取每一个对象
      for (File file : fileArray) {
        copyFolder(file, newFolder);
      }
    } else {
      // 如果是文件
      File newFile = new File(destFile, srcFile.getName());
      copyFile(srcFile, newFile);
    }
  }

  private static void copyFile(File srcFile, File destFile) throws IOException{
    BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

    byte[] bys = new byte[1024];
    int len;
    while((len=bis.read(bys))!=-1){
      bos.write(bys, 0 , len);
    }

    bis.close();
    bos.close();
  }
}
