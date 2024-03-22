package Baitonghop.business.designImpl;

import Baitonghop.business.design.IGenericDesign;
import Baitonghop.business.entity.Derpartment;
import Baitonghop.business.entity.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IImplement implements IGenericDesign {
    private List<Derpartment> derpartments = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();
    @Override
    public List<Derpartment> getDepartments() {
        return derpartments;
    }
    //Hiển thị danh sách phòng ban
    @Override
    public void displayAllDepartments() {
        for (Derpartment derpartment : derpartments) {
            System.out.println("Mã phòng ban: " + derpartment.getDepartmentId() + ", Tên: " + derpartment.getDepartmentName());
        }
    }
//Thêm mới phòng ban
    @Override
    public void addDepartment(Derpartment department) {
        // Kiểm tra xem mã phòng ban đã tồn tại chưa
        for (Derpartment existingDepartment : derpartments) {
            if (existingDepartment.getDepartmentId().equals(department.getDepartmentId())) {
                System.out.println("Mã phòng ban đã tồn tại. Không thể thêm phòng ban.");
                return;
            }
        }
        // Thêm phòng ban mới vào danh sách
        derpartments.add(department);
        System.out.println("Đã thêm phòng ban mới.");
    }

//Chỉnh sửa tên phòng ban
    @Override
    public void editDepartmentName(String departmentId, String newName) {
        for (Derpartment department : derpartments) {
            if (department.getDepartmentId().equals(departmentId)) {
                department.setDepartmentName(newName);
                break;
            }
        }
    }
//Hiển thị danh sách nhân viên của phòng ban theo mã phòng
    @Override
    public List<Employee> getEmployeesByDepartment(String departmentId) {
        List<Employee> employeesInDepartment = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getDerpartment().getDepartmentId().equals(departmentId)) {
                employeesInDepartment.add(employee);
            }
        }
        return employeesInDepartment;
    }

//Xóa phòng ban (chỉ xóa khi không có nhân viên nào)
    @Override
    public void removeDepartment(String departmentId) {
        Derpartment departmentToRemove = null;
        for (Derpartment department : derpartments) {
            if (department.getDepartmentId().equals(departmentId)) {
                if (department.getTotalMembers() == 0) {
                    departmentToRemove = department;
                } else {
                    System.out.println("Không thể xóa phòng ban vì vẫn còn nhân viên.");
                }
                break;
            }
        }
        if (departmentToRemove != null) {
            derpartments.remove(departmentToRemove);
            System.out.println("Đã xóa phòng ban.");
        } else {
            System.out.println("Không tìm thấy phòng ban với mã: " + departmentId);
        }
    }


    @Override
    public void displayAllEmployees() {
        for (Employee employee : employees) {
            System.out.println("Mã nhân viên: " + employee.getEmployeeId() + ", Tên: " + employee.getEmployeeName());
        }
    }

    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }

    @Override
    public Employee getEmployeeDetails(String employeeId) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId().equals(employeeId)) {
                return employee;
            }
        }
        return null; // Trả về null nếu không tìm thấy nhân viên với mã nhân viên đã cho
    }

    @Override
    public void addEmployee(Employee employee) {
        // Kiểm tra xem mã nhân viên đã tồn tại chưa
        for (Employee existingEmployee : employees) {
            if (existingEmployee.getEmployeeId().equals(employee.getEmployeeId())) {
                System.out.println("Mã nhân viên đã tồn tại. Không thể thêm nhân viên.");
                return;
            }
        }
        // Thêm nhân viên mới vào danh sách
        employees.add(employee);
        System.out.println("Đã thêm nhân viên mới.");
    }

    @Override
    public void editEmployee(Employee updatedEmployee) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId().equals(updatedEmployee.getEmployeeId())) {
                System.out.println("Đang cập nhật thông tin cho nhân viên có mã: " + updatedEmployee.getEmployeeId());

                System.out.println("Tên cũ: " + employee.getEmployeeName());
                employee.setEmployeeName(updatedEmployee.getEmployeeName());
                System.out.println("Tên mới: " + updatedEmployee.getEmployeeName());

                System.out.println("Ngày sinh cũ: " + employee.getBirthday());
                employee.setBirthday(updatedEmployee.getBirthday());
                System.out.println("Ngày sinh mới: " + updatedEmployee.getBirthday());

                System.out.println("Giới tính cũ: " + (employee.isSex() ? "Nam" : "Nữ"));
                employee.setSex(updatedEmployee.isSex());
                System.out.println("Giới tính mới: " + (updatedEmployee.isSex() ? "Nam" : "Nữ"));

                System.out.println("Lương cơ bản cũ: " + employee.getSalary());
                employee.setSalary(updatedEmployee.getSalary());
                System.out.println("Lương cơ bản mới: " + updatedEmployee.getSalary());

                if (employee.getManager() != null) {
                    System.out.println("Người quản lý cũ: " + employee.getManager().getEmployeeName());
                } else {
                    System.out.println("Người quản lý cũ: Không có");
                }
                employee.setManager(updatedEmployee.getManager());
                if (updatedEmployee.getManager() != null) {
                    System.out.println("Người quản lý mới: " + updatedEmployee.getManager().getEmployeeName());
                } else {
                    System.out.println("Người quản lý mới: Không có");
                }

                System.out.println("Phòng ban cũ: " + employee.getDerpartment().getDepartmentName());
                employee.setDerpartment(updatedEmployee.getDerpartment());
                System.out.println("Phòng ban mới: " + updatedEmployee.getDerpartment().getDepartmentName());

                System.out.println("Đã cập nhật thông tin nhân viên.");
                return;
            }
        }
        System.out.println("Không tìm thấy nhân viên với mã: " + updatedEmployee.getEmployeeId());
    }
    @Override
    public void removeEmployee(String employeeId) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId().equals(employeeId)) {
                employees.remove(employee);
                System.out.println("Đã xóa nhân viên.");
                return;
            }
        }
        System.out.println("Không tìm thấy nhân viên với mã: " + employeeId);
    }
//số lượng nhân viên trung bình của mỗi phòng
    @Override
    public double averageNumberOfEmployeesPerDepartment() {
        if (derpartments.isEmpty()) {
            return 0;
        }
        int totalEmployees = 0;
        for (Derpartment department : derpartments) {
            totalEmployees += department.getTotalMembers();
        }
        return (double) totalEmployees / derpartments.size();
    }
    //tìm ra 5 phòng có số lượng nhân viên đông nhất
    @Override
    public List<Derpartment> top5DepartmentsByNumberOfEmployees() {
        return derpartments.stream()
                .sorted(Comparator.comparingInt(Derpartment::getTotalMembers).reversed())
                .limit(5)
                .collect(Collectors.toList());
    }
    // tìm ng quản lý max nhiều nv nhât
    @Override
    public Employee managerWithMostEmployees() {
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getManager, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }
    // 5 nhân viên có tuổi cao nhất
    @Override
    public List<Employee> top5OldestEmployees() {
        return employees.stream()
                .sorted(Comparator.comparing(Employee::getBirthday))
                .limit(5)
                .collect(Collectors.toList());
    }
    //5 nhân viên lương max
    @Override
    public List<Employee> top5HighestPaidEmployees() {
        return employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(5)
                .collect(Collectors.toList());
    }
    public void displayDepartments() {
        for (Derpartment department : derpartments) {
            System.out.println("Department ID: " + department.getDepartmentId());
            System.out.println("Department Name: " + department.getDepartmentName());
            System.out.println("Total Members: " + department.getTotalMembers());
        }
    }
    public void displayEmployees() {
        for (Employee employee : employees) {
            System.out.println("Employee ID: " + employee.getEmployeeId());
            System.out.println("Employee Name: " + employee.getEmployeeName());
        }
    }
}
