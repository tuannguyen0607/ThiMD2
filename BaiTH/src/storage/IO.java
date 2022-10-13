package storage;
import model.Student;


import java.io.*;
import java.util.ArrayList;

    public class IO {
        public static void write(File file, ArrayList<Student> list){
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

                objectOutputStream.writeObject(list);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public static ArrayList<Student> read(File file) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

                return (ArrayList<Student>) objectInputStream.readObject();
            } catch (Exception e) {
                e.printStackTrace();
                return new ArrayList<>();
            }
        }
    }

