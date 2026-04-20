package my.sttpk2023;

import java.util.ArrayList;

public class ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<Student>();
        Student student;

        studentList.add(new Student("Siti", 10001)); // simpan pd indeks 0
        studentList.add(new Student("John", 10002)); // // simpan pd indeks 1

        System.out.println("The size of array list #1 = " + studentList.size());
        System.out.println("test1 = " + studentList.get(0));
        System.out.println("test2 = " + studentList.get(1));
        for (int i = 0; i < studentList.size(); i++)
            System.out.println(studentList.get(i).getName() + "\t" + studentList.get(i).getMatricNo());
        // studentList.get(0).getName() => siti,  studentList.get(0).getMatricNo()=>10001
        // studentList.get(1).getName() => John,  studentList.get(1).getMatricNo()=>10002

        System.out.println("");
        student = new Student("Raja", 10003);
        studentList.add(student); // simpan pd indeks 2
        student = new Student("Ameng", 10004);
        studentList.add(student); // // simpan pd indeks 3
        student = new Student("Aling", 10005);
        studentList.add(student); // // simpan pd indeks 4

        System.out.println("The size of array list #2 = " + studentList.size());
        for (int i = 0; i < studentList.size(); i++)
            System.out.println(studentList.get(i).getName() + "\t" + studentList.get(i).getMatricNo());


        // data removal
        System.out.println("");
        int deletedMatric = 10004;  // data to be deleted
        int index = -1; // -1 means not found
        //searching process
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getMatricNo() == deletedMatric) {
                index = i;
                System.out.println(deletedMatric + " is found at index = " + index);
                studentList.remove(index);
                System.out.println(studentList.get(i).getName() + " has been removed successfully");

            }
        }

        if (index == -1)
            System.out.println(deletedMatric + " is not found");

        System.out.println("");
        System.out.println("After deletion process");
        System.out.println("The size of array list #3 = " + studentList.size());
        for (int i = 0; i < studentList.size(); i++)
            System.out.println(studentList.get(i).getName() + "\t" + studentList.get(i).getMatricNo());

        // data update

        String searchData = "Raja";
        String updatedData = "Raju";  // raja will be replaced by Raju
        index = -1; // -1 means not found
        //searching process
        System.out.println("");
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getName().equalsIgnoreCase(searchData)) {
                index = i; //i=2
                System.out.println(searchData + " is found at index = " + index);
                studentList.get(i).setName(updatedData);
                System.out.println(studentList.get(i).getName() + " has been updated successfully");
            }
        }

        System.out.println("");
        System.out.println("After update process #1");
        for (int i = 0; i < studentList.size(); i++)
            System.out.println(studentList.get(i).getName() + "\t" + studentList.get(i).getMatricNo());


        System.out.println("");
        student = new Student("Vivian", 10006); // data / record to be updated
        String searchName = "Aling";
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getName().equalsIgnoreCase(searchName)) {
                System.out.println(searchName + " is found at index = " + i);
                studentList.set(i, student); // studentList.set(3, student)
                System.out.println(studentList.get(i).getName() + " has been updated successfully");
            }
        }

        System.out.println("");
        System.out.println("After update process #2 - update Aling to Vivian");
        for (int i = 0; i < studentList.size(); i++)
            System.out.println(studentList.get(i).getName() + "\t" + studentList.get(i).getMatricNo());
    } // main method
} // class
