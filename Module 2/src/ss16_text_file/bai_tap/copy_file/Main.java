package ss16_text_file.bai_tap.copy_file;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) {
        String sourcePath = "C:\\Codegym module 2\\Module 2\\src\\ss16_text_file\\bai_tap\\copy_file\\source.txt";
        File sourcePath1 = new File(sourcePath);
        if(!sourcePath1.exists()){
            System.out.println("Không tìm thấy file này");
            return;
        }
        String targetPath = "C:\\Codegym module 2\\Module 2\\src\\ss16_text_file\\bai_tap\\copy_file\\destination.txt";
        File targetPath1 = new File(targetPath);
        if(targetPath1.exists()){
            System.out.println("Đã tồn tại mục này");
        }

        try(FileInputStream inputStream = new FileInputStream(sourcePath1);
            FileOutputStream outputStream = new FileOutputStream(targetPath1)){
            int byteData;
            while((byteData = inputStream.read())!=-1){
                outputStream.write(byteData);
            }
        }catch(IOException e){
            e.printStackTrace();
        }


    }
}
