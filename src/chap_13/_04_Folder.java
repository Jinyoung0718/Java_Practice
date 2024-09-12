package chap_13;

import java.io.File;

public class _04_Folder {
    public static void main(String[] args) {
        //        String directoryPath = "원하는_경로/새로운_폴더";
        //        File directory = new File(directoryPath);

        String folderName = "A"; // 위의 것과 같이 원하는 경로도 설정 할 수 있다
        File folder = new File(folderName);
        folder.mkdir(); // folder.mkdir()은 Java에서 디렉터리(폴더)를 생성하는 메소드 // 파일은 .createNewFile();이다
        if (folder.exists()) {
            System.out.println("폴더가 존재합니다 : " + folder.getAbsolutePath());
        }

        System.out.println("----------------------------------");

        folderName = "A/B/C";

        folder = new File(folderName);
        // folder.mkdir(); -> folderName = "A" 폴더 하나를 생성시 mkdir
        folder.mkdirs(); // -> folderName = "A/B/C" 폴더를 생성하며 그 폴더의 하위폴더를 생성시 mkdirs를 활용한다
        if (folder.exists()) {
            System.out.println("폴더가 존재합니다 : " + folder.getAbsolutePath());
        } else {
            System.out.println("폴더 생성 실패 (mkdirs)");
        }
    }
}
