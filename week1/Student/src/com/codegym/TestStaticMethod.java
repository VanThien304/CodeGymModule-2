package com.codegym;

public class TestStaticMethod {

        public static void main(String[] args) {
            Student.change(); //calling change method
            //creating objects
            Student s1 = new Student(111, "Thien");
            Student s2 = new Student(123, "PvThien");
            Student s3 = new Student(233, "TBlue");

            //calling display method

            s1.display();
            s2.display();
            s3.display();


    }
}
