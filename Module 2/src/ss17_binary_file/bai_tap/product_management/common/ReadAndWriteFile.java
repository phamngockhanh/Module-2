package ss17_binary_file.bai_tap.product_management.common;

import ss17_binary_file.bai_tap.product_management.entity.Computer;

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
            ex.printStackTrace();
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

    public static void writeListStudentToBinaryFile(String filePath, List<Computer> computerList) {
        File file = new File(filePath);
        FileOutputStream fileOuputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOuputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOuputStream);
            objectOutputStream.writeObject(computerList);
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        } finally {
            try {
                objectOutputStream.close();
                fileOuputStream.close();
            } catch (IOException e) {
                System.out.println("Lỗi đóng file");
            }
        }
    }


    public static List<Computer> readBinaryFileToListComputer(String filePath) {
        List<Computer> computerList = new ArrayList<>();
        File file = new File(filePath);
        FileInputStream fileInputStream ;
        ObjectInputStream objectInputStream ;
        try {
            if (file.length() > 0) {
                fileInputStream = new FileInputStream(file);
                objectInputStream = new ObjectInputStream(fileInputStream);
                computerList = (List<Computer>) objectInputStream.readObject();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Lỗi đọc file");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return computerList;
    }

    public static <T> void writeListStudentToBinaryDat(String filePath, List<T> objectList) {
        File file = new File(filePath);
        FileOutputStream fileOuputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOuputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOuputStream);
            objectOutputStream.writeObject(objectList);
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        } finally {
            try {
                objectOutputStream.close();
                fileOuputStream.close();
            } catch (IOException e) {
                System.out.println("Lỗi đóng file");
            }
        }
    }


    public static <T> List<T> readBinaryFileToListDat(String filePath) {
        List<T> objectList = new ArrayList<>();
        File file = new File(filePath);
        FileInputStream fileInputStream ;
        ObjectInputStream objectInputStream ;
        try {
            if (file.length() > 0) {
                fileInputStream = new FileInputStream(file);
                objectInputStream = new ObjectInputStream(fileInputStream);
                objectList = (List<T>) objectInputStream.readObject();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Lỗi đọc file");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return objectList;
    }

}
