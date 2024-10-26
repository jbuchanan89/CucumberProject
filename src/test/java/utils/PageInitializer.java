package utils;

import pages.AddEmployeePage;
import pages.LoginPage;

public class PageInitializer {


    public static LoginPage loginPage;
    public static AddEmployeePage addEmployeePage;
//    public static DashboardPage dashboardPage;


    public static void initializePageObjects(){
        loginPage = new LoginPage();
        addEmployeePage = new AddEmployeePage();
//        employeeSearchPage = new EmployeeSearchPage();
//        dashboardPage = new DashboardPage();

    }
}
