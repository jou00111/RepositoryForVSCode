package practice;

public class PersonMain {
    public static void main(String[] args) {
        Person1 ikuto = new Person1();
        ikuto.name = "幾人";
        ikuto.age = 23;

        Person2 toma = new Person2();
        toma.name = "藤間";
        toma.age = 25;

        ikuto.introduce();
        toma.introduce();
    }
}
