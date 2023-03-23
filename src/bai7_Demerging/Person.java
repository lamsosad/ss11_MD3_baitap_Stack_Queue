package bai7_Demerging;

public class Person {
    private String name;
    private boolean sex;
    private String birthDate;

    public Person() {
    }

    public Person(String name, boolean sex, String birthDate) {
        this.name = name;
        this.sex = sex;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public boolean isSex() {
        return sex;
    }

    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }
}
