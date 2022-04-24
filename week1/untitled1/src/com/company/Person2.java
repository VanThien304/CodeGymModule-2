package com.company;

public class Person2 extends Person {
        String university;
        public Person2(String name, int age, float height, String university){
            super(name, age, height);
            this.university = university;
        }

        public void getInfo(){
            super.getInfo();
            System.out.println("Uni: "+this.university);
        }

        public static void main(String[] args) {
            com.company.Person2 a = new com.company.Person2("Thinh", 23, 7.5f, "Hue Uni");
            a.getInfo();
        }
}
