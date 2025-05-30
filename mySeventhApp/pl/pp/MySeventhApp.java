package pl.pp;

public class MySeventhApp {
    public String forename;
    public String surname;
    public int age;
    public String address;
    public int year_of_birth;

    public MySeventhApp() {
    }

    public MySeventhApp(String initForename, String initSurname, int initAge, String initAddress, int initYearOfBirth) {
        forename = initForename;
        surname = initSurname;
        age = initAge;
        address = initAddress;
        year_of_birth = initYearOfBirth;
    }

    public void hiToAll() {
        System.out.println("My name is " + forename + " " + surname + ". I am " + age + " years old.");
    }

    public int growOld(int years) {
        age += years;
        return age;
    }

    public int beYounger() {
        age -= 1;
        return age;
    }

    public String getName() {
        return forename;
    }

    public void setName(String nameToSet) {
        forename = nameToSet;
    }

    public static void main(String[] args) {
        MySeventhApp person = new MySeventhApp("Alice", "Smith", 30, "456 Park Ave", 1995);
        person.hiToAll();

        System.out.println("Growing older by 5 years...");
        person.growOld(5);
        person.hiToAll();

        System.out.println("Getting younger by 1 year...");
        person.beYounger();
        person.hiToAll();
    }
}