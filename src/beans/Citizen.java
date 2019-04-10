package beans;

public class Citizen {
    private String aadhar;
    private String giveName;
    private String fatherName;
    private String dob;
    private String mobile;

    public String getAadhar() {
        return aadhar;
    }

    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }

    public String getGiveName() {
        return giveName;
    }

    public void setGiveName(String giveName) {
        this.giveName = giveName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return String.format("%-15s: %s\n%-15s: %s\n%-15s: %s\n%-15s: %s\n%-15s: %s\n", "Aadhar No", this.getAadhar(), "Given Name", this.getGiveName(), "Father's Name", this.getAadhar(), "DOB", this.getDob(), "Mobile No", this.getMobile());
    }
}
