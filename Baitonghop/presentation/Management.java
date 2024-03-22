package Baitonghop.presentation;

import Baitonghop.business.design.IGenericDesign;
import Baitonghop.business.designImpl.IImplement;
import Baitonghop.config.InputMethods;

public class Management {

    public static void main(String[] args) {
        while (true){
            System.out.println("=============== MENU QUẢN TRỊ =================");
            System.out.println("1.Quản trị phòng ban");
            System.out.println("2.Quản trị nhân viên");
            System.out.println("0. Thoát");
            System.out.println("------------------------------------------------");
            System.out.print("Nhập lựa chọn: ");
            int choice = InputMethods.getInteger();
            switch (choice){
                case 1:
                    break;
                case 2:
                    EmployeeManagement.displayEmployeeMenu();
                    break;
            }
        }
    }

}
