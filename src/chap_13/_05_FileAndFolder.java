package chap_13;

import java.io.File;

public class _05_FileAndFolder {
    public static void main(String[] args) {
        // String folder = "C:\\Users\\Nadocoding\\Desktop\\JavaWorkspace\\src\\chap_13"; 절대경로
        String folder = "src/chap_13"; // 상대경로
        File filesAndFolders = new File(folder);
        System.out.println("현재 폴더 경로 : " + filesAndFolders.getAbsolutePath());
        for (File file : filesAndFolders.listFiles()) { // listFiles() 폴더 내 파일들
            if (file.isFile()) { // 파일이면
                System.out.println("(파일) " + file.getName());
            } else if (file.isDirectory()) { // 폴더면
                System.out.println("(폴더) " + file.getName());
            }
        }
    }
}
