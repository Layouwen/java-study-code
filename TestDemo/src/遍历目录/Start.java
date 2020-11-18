package 遍历目录;

import java.io.File;

public class Start {
  public static void main(String[] args) {
    File scrFile = new File("/Users/liangyouwen/demo1");

    getAllFilePath(scrFile);
  }

  public static void getAllFilePath(File srcFile) {
    File[] fileArray = srcFile.listFiles();
    if (fileArray != null) {
      for (File file : fileArray) {
        if (file.isDirectory()) {
          getAllFilePath(file);
        } else {
          System.out.println(file.getAbsoluteFile());
        }
      }
    }
  }
}
