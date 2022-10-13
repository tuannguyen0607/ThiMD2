package views;

import controlle.StudentManage;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    StudentManage studentManage = new StudentManage();

    public void menu() {
        while (true) {
            System.err.println(" --------------------CHƯƠNG TRÌNH QUẢN LÍ SINH VIÊN---------------------------\n");
            System.out.println("Chọn chức năng theo số (để tiếp tục)!\n" +
                    "1. Xem danh sách nhân viên\n" +
                    "2. Thêm mới \n" +
                    "3. Cập nhật\n" +
                    "4. Xóa\n" +
                    "5. Sắp xếp\n" +
                    "6. Đọc từ file\n" +
                    "7. Ghi vào file\n" +
                    "8. Thoát \n" +
                    "Nhập lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    studentManage.showStudent();
                    break;
                case 2:
                    studentManage.addStudent();
                    break;
                case 3:
                    studentManage.editStudent();
                    break;
                case 4:
                    studentManage.removeStudent();
                    break;
                case 5:
                    studentManage.sapXep();
                    break;
                case 6:
                    studentManage.docFile();
                    break;
                case 7:
                    studentManage.vietFile();
                    break;
                case 8:
                    return;
            }
        }
    }
}

