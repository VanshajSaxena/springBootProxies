package org.example.classes;

public class Man implements Person {
  private String name;
  private String age;
  private String city;
  private String country;

  /**
   * @param name
   * @param age
   * @param city
   * @param country
   */
  public Man(String name, String age, String city, String country) {
    this.name = name;
    this.age = age;
    this.city = city;
    this.country = country;
  }

  @Override
  public void introduce(String name) {
    System.out.println("My name is " + this.name);
  }

  @Override
  public void sayAge(String age) {
    System.out.println("I am " + this.age + " years old");
  }

  @Override
  public void sayWhereFrom(String city, String country) {
    System.out.println("I live in the city of " + this.city + " in " + this.country);
  }

  public String getName() {
    return this.name;
  }

}
