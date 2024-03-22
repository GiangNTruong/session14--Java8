package Baitonghop.presentation;

import Baitonghop.business.design.IGenericDesign;
import Baitonghop.business.designImpl.IImplement;
import Baitonghop.business.entity.Employee;
import Baitonghop.config.InputMethods;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement {
    private static IGenericDesign employeeImpl = new IImplement();
    private static List<Employee> employees = new ArrayList<>();
    public static void displayEmployeeMenu() {

        while (true) {
            System.out.println("============== QUẢN TRỊ NHÂN VIÊN ==============");
            System.out.println("1. Hiển thị danh sách thông tin tất cả nhân viên(mã nhân viên và tên)");
            System.out.println("2. Xem chi tiết thông tin nhân viên theo mã nhân viên(toàn bộ thông tin)");
            System.out.println("3. Thêm mới nhân viên");
            System.out.println("4. Chỉnh sửa thông tin nhân viên");
            System.out.println("5. Xoá nhân viên");
            System.out.println("6. Thống kê số lượng nhân viên trung bình của mỗi phòng");
            System.out.println("7. Tìm ra 5 phòng có số lượng nhân viên đông nhất");
            System.out.println("8. Tìm ra người quản lí nhiều nhân viên nhất");
            System.out.println("9. Tìm ra 5 nhân viên có tuổi cao nhất công ty");
            System.out.println("10. Tìm ra 5 nhân viên hưởng lương cao nhất");
            System.out.println("0. Thoát");
            System.out.println("---------------------------------------------------");
            System.out.print("Nhập lựa chọn: ");
            int choice = InputMethods.getInteger();
            switch (choice) {
                case 1:
                    employeeImpl.displayDepartments();
                    break;

                case 2:
                    employeeImpl.getEmployeeDetails(employees);
                    break;
                case 3:
                    employeeImpl.addEmployee(employees);
                    break;
                case 4:
                    employeeImpl.editEmployee(employees);
                    break;
                case 5:
                    employeeImpl.removeEmployee(employees.getEmployeeId());
                    break;
                case 6 :
                    employeeImpl.averageNumberOfEmployeesPerDepartment();
                    break;
                case 7 :
                    employeeImpl.top5HighestPaidEmployees();
                    break;
                case 8 :
                    employeeImpl.managerWithMostEmployees();
                    break;
                case 9 :
                    employeeImpl.top5OldestEmployees();
                    break;
                case 10 :
                    employeeImpl.top5HighestPaidEmployees();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
