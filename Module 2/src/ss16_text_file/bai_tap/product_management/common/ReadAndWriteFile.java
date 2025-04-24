package ss16_text_file.bai_tap.product_management.common;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static void writeFileCSV(String filePath, boolean append, List<String> stringList) {
        File file = new File(filePath);
        try (FileWriter fileWriter = new FileWriter(file, append);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (String line : stringList) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException ex) {
            System.out.println("Lỗi ghi file");
        }
    }

    public static List<String> readFileCSV(String filePath) {
        List<String> list = new ArrayList<>();
        File file = new File(filePath);
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            System.out.println("Lỗi đọc file");
        }
        return list;
    }
}
