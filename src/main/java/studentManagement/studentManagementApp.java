package studentManagement;

import java.sql.Date;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class studentManagementApp {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;
        boolean repeatOn = true;

        while (repeatOn) {

            System.out.println("\n1.Add Employee");
            System.out.println("2.Get Employee By Id");
            System.out.println("3.Update Employee");
            System.out.println("4.Delete Employee");
            System.out.println("5.HQL Query");
            System.out.println("6.Get All Employees");
            System.out.println("7.Exit");

            System.out.print("Enter Choice : ");

            while (!s.hasNextInt()) {
                System.out.print("Invalid input! Enter a number: ");
                s.next();
            }

            choice = s.nextInt();

            switch (choice) {

            case 1:
                addEmployee();
                break;

            case 2:
                System.out.print("Enter Employee Id : ");

                while (!s.hasNextInt()) {
                    System.out.print("Invalid Employee Id! Enter a number: ");
                    s.next();
                }

                int getId = s.nextInt();
                getEmployee(getId);
                break;

            case 3:
                System.out.print("Enter Employee Id : ");

                while (!s.hasNextInt()) {
                    System.out.print("Invalid Employee Id! Enter a number: ");
                    s.next();
                }

                int updateId = s.nextInt();
                updateEmployee(updateId);
                break;

            case 4:
                System.out.print("Enter Employee Id : ");

                while (!s.hasNextInt()) {
                    System.out.print("Invalid Employee Id! Enter a number: ");
                    s.next();
                }

                int deleteId = s.nextInt();
                removeEmployee(deleteId);
                break;

            case 5:
                invokeHQL();
                break;

            case 6:
                getAllEmployees();
                break;

            case 7:
                repeatOn = false;
                System.out.println("Application Closed...");
                break;

            default:
                System.out.println("Please enter a choice between 1 and 7");
            }
        }

        s.close();
    }

    // Your existing methods
    public static void addEmployee() {

        SessionFactory sf = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session = sf.openSession();

        try {

            Transaction tx = session.beginTransaction();

            studentManagementModel emp = new studentManagementModel();

            s.nextLine();

            System.out.print("Enter First Name : ");
            emp.setFname(s.nextLine());

            System.out.print("Enter Last Name : ");
            emp.setLname(s.nextLine());

            System.out.print("Enter Designation : ");
            emp.setDesignation(s.nextLine());

            System.out.print("Enter DOB (yyyy-mm-dd) : ");
            emp.setDob(Date.valueOf(s.nextLine()));

            System.out.print("Enter DOJ (yyyy-mm-dd) : ");
            emp.setDoj(Date.valueOf(s.nextLine()));

            session.persist(emp);

            tx.commit();

            System.out.println("Employee Saved Successfully");
            System.out.println("Generated Employee Id : " + emp.getEid());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
            sf.close();
        }
    }

    public static void getEmployee(int id) {
        System.out.println("Get Employee : " + id);
    }

    public static void updateEmployee(int id) {
        System.out.println("Update Employee : " + id);
    }

    public static void removeEmployee(int id) {
        System.out.println("Delete Employee : " + id);
    }

    public static void invokeHQL() {
        System.out.println("HQL Query Executed");
    }

    public static void getAllEmployees() {
        System.out.println("Displaying All Employees");
    }
}