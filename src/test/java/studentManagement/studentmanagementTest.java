package studentManagement;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class studentmanagementTest {

    @Test
    void testGetEmployee() {

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        studentManagementApp.getEmployee(101);

        assertTrue(output.toString().contains("Get Employee : 101"));
    }

    @Test
    void testUpdateEmployee() {

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        studentManagementApp.updateEmployee(101);

        assertTrue(output.toString().contains("Update Employee : 101"));
    }

    @Test
    void testRemoveEmployee() {

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        studentManagementApp.removeEmployee(101);

        assertTrue(output.toString().contains("Delete Employee : 101"));
    }

    @Test
    void testInvokeHQL() {

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        studentManagementApp.invokeHQL();

        assertTrue(output.toString().contains("HQL Query Executed"));
    }

    @Test
    void testGetAllEmployees() {

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        studentManagementApp.getAllEmployees();

        assertTrue(output.toString().contains("Displaying All Employees"));
    }
}