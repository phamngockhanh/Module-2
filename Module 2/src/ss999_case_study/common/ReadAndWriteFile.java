package ss999_case_study.common;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {

    public static void writeFileCSV(String path, List<String> listString, boolean status){
        File file = new File(path);

        try(FileWriter fw = new FileWriter(file,status);
            BufferedWriter bw  = new BufferedWriter(fw)
        ){
            for(String line : listString){
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
            e.printStackTrace();
        }
    }


    public static List<String> readFileCSV(String path) {
        File file = new File(path);
        List<String> stringList = new ArrayList<>();
        try (FileReader fr = new FileReader(file);
             BufferedReader rd = new BufferedReader(fr)
        ) {
            String line ;
            while((line = rd.readLine())!=null){
                stringList.add(line);
            }
        }  catch (IOException e) {
            System.out.println("Lỗi đọc file");
            e.printStackTrace();
        }
        return stringList;
    }
}
