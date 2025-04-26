package ss17_binary_file.bai_tap.binary_file.common;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static void writeFileCSV(String path, boolean status, List<String> list) {
        File file = new File(path);
        try (FileWriter fw = new FileWriter(file, status);
             BufferedWriter bf = new BufferedWriter(fw)) {
            for (String line : list) {
                bf.write(line);
                bf.newLine();

            }
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
            e.printStackTrace();
        }
    }

    public static List<String> readFileCSV(String path) {
        File file = new File(path);
        List<String> list = new ArrayList<>();
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {
            String line = "";
            if((line = br.readLine())!=null){
                list.add(line);
            }
        } catch (IOException e) {
            System.out.println("Lỗi đọc file");
            e.printStackTrace();
        }
        return list;
    }
}
