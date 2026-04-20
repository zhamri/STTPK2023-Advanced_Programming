package my.sttpk2023;

public class Student {
    private String name;
    private int matricNo;

    public Student(String name, int matricNo) {
        this.name = name;
        this.matricNo = matricNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMatricNo() {
        return matricNo;
    }

    public void setMatricNo(int matricNo) {
        this.matricNo = matricNo;
    }
}
