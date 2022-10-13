package controlle;

import model.Student;
import soft.SoftByScoreAscending;
import soft.SoftByScoreDescending;
import storage.IO;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StudentManage {
    File file = new File("C:\\Users\\ADMIN\\IdeaProjects\\BaiTH\\src\\storage\\student.csv");

    IO io = new IO();

    public static ArrayList<Student> students = new ArrayList<>();
    Scanner scanner= new Scanner(System.in);

    public Student createStudent(){
        System.out.println("Nhập mã sinh viên :");
        int studentCode;
        while (true){
            try {
                studentCode= Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!!");
            }
        }
        System.out.println("Nhập tên sinh viên :");
        String name= scanner.nextLine();
        System.out.println("Nhập tuổi :");
        int age;
        while (true){
            try {
                age = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!!!");
            }
        }
        System.out.println("Nhập giới tính :");
        String gender = scanner.nextLine();
        System.out.println("Nhập địa chỉ :");
        String address= scanner.nextLine();
        System.out.println("Nhập điểm trung bình :");
        double mediumScore;
        while (true){
            try{
                mediumScore = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số !!!");
            }
        }
        return new Student(studentCode,name,age,gender,address,mediumScore);
    }

    public void showStudent() {
        for (Student student: students) {
            System.out.println(student);
        }
    }

    public void addStudent() {
        Student student =createStudent();
        students.add(student);

        io.write(file, students);
    }

    public void editStudent() {
        System.out.println("Nhập mã sinh viên cần sửa");
        int code;
        while (true){
            try{
                code = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số !!!");
            }
        }
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getMaSinhvien()==code) {
                System.out.println("Nhap mã sinh viên mới:  ");
                int studentCode;
                while (true){
                    try{
                        studentCode = Integer.parseInt(scanner.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Vui lòng nhập số !!!");
                    }
                }
                System.out.println("Nhap ten: ");
                String studentName = scanner.nextLine();
                System.out.println("Nhap tuổi : ");
                int studentAge;
                while (true){
                    try{
                        studentAge = Integer.parseInt(scanner.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Vui lòng nhập số !!!");
                    }
                }
                System.out.println("Nhập giới tính : ");
                String gender = scanner.nextLine();
                System.out.println("Nhap địa chỉ :");
                String address = scanner.nextLine();
                System.out.println("Nhập điểm trung bình :");
                double mediumScore;
                while (true){
                    try{
                        mediumScore = Double.parseDouble(scanner.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Vui lòng nhập số !!!");
                    }
                }
                students.get(i).setMaSinhvien(studentCode);
                students.get(i).setHoTen(studentName);
                students.get(i).setTuoi(studentAge);
                students.get(i).setGioiTinh(gender);
                students.get(i).setDiaChi(address);
                students.get(i).setDiemTB(mediumScore);
                System.out.println("Sửa sinh viên thành công!");
            } else {
                System.out.println("Không tìm thấy sinh viên! ");
            }
        }
        io.write(file, students);
    }

    public void removeStudent() {
        boolean check= false;
        System.out.println("Nhập mã sinh viên cần xóa :");
        int code;
        while (true){
            try {
                code= Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!!");
            }
        }
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getMaSinhvien()==code) {
                students.remove(i);
                System.out.println("Xoa sinh viên thanh cong !");
                check = true;
            }
        }
        if (!check) {
            System.err.println("Khong tim thay sinh viên ! " + code);
        }

        io.write(file, students);

    }

    public void sapXep() {
        System.out.println("Bạn muốn sắp xếp theo hướng nào ?");
        System.out.println("1. Sắp xếp điểm trung bình giảm dần");
        System.out.println("2. Sắp xếp điểm trung bình tăng dần");
        System.out.println("3. Hủy bỏ sắp xếp");
        int choice;
        while (true) {
            try {
                do {
                    choice = Integer.parseInt(scanner.nextLine());
                    if (choice < 1 || choice > 3) {
                        System.out.println("Chọn 1 hoặc 2");
                    }
                } while (choice < 1 || choice > 3);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui Lòng Nhập Số");
            }
        }

        switch (choice) {
            case 1 -> students.sort(new SoftByScoreDescending());
            case 2 -> students.sort(new SoftByScoreAscending());

        }
    }

    public void docFile(){
        students = IO.read(file);
        System.out.println("Đọc File Thành Công");
    }

    public void vietFile(){
        IO.write(file,students);
        System.out.println("Viết File Thành Công");
    }
}
