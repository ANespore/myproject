public class Person {

    public String name;
    public String gender;
    public String greeting ()

    {
        return "Hello, I am " + name  + "  My age:  "  + age  + "   "  + celebrateBirthday();
    }

    private int age;
    public int getAge()
    {
        return age;
    }

    public void setAge(int userAge) {
      age = userAge;

    }

    public String celebrateBirthday() {
       // age++;
       return   "Next year I will be:"  + ++age;
    }
}
