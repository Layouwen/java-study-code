package 复制单级文件夹;

import java.io.*;

public class Start {
  public static void main(String[] args) throws IOException {
    // 获取文件名
    File srcFolder = new File("./filesDemo");
    String srcFolderName = srcFolder.getName();

    // 创建数据源对象
    File destFolder = new File("Test", srcFolderName);

    // 如果不存在，则创建该文件夹
    if(!destFolder.exists()){
      destFolder.mkdir();
    }

    // 获取当前目录下的所有文件
    File[] listFiles = srcFolder.listFiles();

    // 遍历该目录所有文件
    for(File srcFile : listFiles){
      // 获取其对应的文件名
      String srcFileName = srcFile.getName();
      // 创建相应文件
      File destFile = new File(destFolder, srcFileName);
      // 复制文件内容
      copyFile(srcFile, destFile);
    }
  }

  // 复制文件函数
  private static void copyFile(File srcFile, File destFile) throws IOException {
    BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

    byte[] bys = new byte[1024];
    int len;
    while((len=bis.read(bys))!=-1){
      bos.write(bys, 0, len);
    }

    bos.close();
    bis.close();
  }
}
