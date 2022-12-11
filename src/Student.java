public class Student {
    int age;
    String name;

    public Student(int age, String name) {
        if (name==null){
            throw new MyException("Aty berilbedi");
        }else {
            setName(name);
        }
        if(age>0){
            throw new MyException("Jashy ters");
        }else {
            this.age = age;
        }
    }

    public Student() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0){
            throw new MyException("Jashy ters");
        }else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null){
            throw new MyException("Aty berilbedi");
        }else {
            this.name = name;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
