package com.company;

public class Person {
  public String name;
  public int age;
  public float height;

  public Person(String name, int age, float height) {
    this.name = name;
    this.age = age;
    this.height = height;
  }

  public void getInfo(){
    System.out.println("Name: "+this.name);
    System.out.println("Age: "+this.age);
    System.out.println("Height: "+this.height);
  }
  public static void main(String[] args) {
    Person a = new Person("Thien", 26, 1.7f);
    a.getInfo();
  }

//    a.setVal("Tien");
//    a.getInfo();
//  }
}


