package studentManagement;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class studentManagementModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eid;

    private String fname;
    private String lname;
    private String designation;
    private Date dob;
    private Date doj;

    // Default Constructor
    public studentManagementModel() {
    }

    // Parameterized Constructor
    public studentManagementModel(String fname, String lname,
            String designation, Date dob, Date doj) {

        this.fname = fname;
        this.lname = lname;
        this.designation = designation;
        this.dob = dob;
        this.doj = doj;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    @Override
    public String toString() {
        return "studentManagementModel [eid=" + eid +
                ", fname=" + fname +
                ", lname=" + lname +
                ", designation=" + designation +
                ", dob=" + dob +
                ", doj=" + doj + "]";
    }
}