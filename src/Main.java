import linkedList.Animal;
import linkedList.Cat;
import linkedList.Dog;
import linkedList.Mouse;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args)/* throws IOException */ {
//        FileWriter fileWriter = new FileWriter("song15");
//        fileWriter.write("Moё сердце\n");
//        fileWriter.write("Сплин\n");
//        fileWriter.write("Мы не знали друг друга\n" +
//                "До этого лета,\n" +
//               "Моё сердце замерло.\n");
//
//        fileWriter.close();
//
//        FileReader fileReader = new FileReader("song15");
//        Scanner scanner = new Scanner(fileReader);
//
//        Song song = new Song();
//        song.setTitle(scanner.nextLine());
//        song.setAuthor(scanner.nextLine());
//        System.out.println("Название: "+song.getTitle());
//        System.out.println("Автор: "+song.getAuthor());
//        System.out.print("Текст: ");
//        while (scanner.hasNextLine()) {
//            song.setText(scanner.nextLine());
//            System.out.println(song.getText());
//        }
//        fileReader.close();
//        
//        try {
//            Student student1 = new Student();
//            Student student2 = new Student(-25,"Nur");
//            Student student3 = new Student(0,null);
//            Student student4 = new Student(45,"Bay");
//            Student student5 = new Student(55,"Vir");
//            Student student6 = new Student();
//
//            student1.setAge(25);
//            student1.setName("Sher");
//            student6.setAge(65);
//            student6.setName(null);
//
//
//            ArrayList<Student> arrayList1 = new ArrayList<Student>();
//            arrayList1.add(student1);
//            arrayList1.add(student2);
//            arrayList1.add(student3);
//            arrayList1.add(student4);
//            arrayList1.add(student5);
//            arrayList1.add(student6);
//
//            System.out.println(arrayList1.get(0));
//            System.out.println(arrayList1.get(1));
//            System.out.println(arrayList1.get(2));
//            System.out.println(arrayList1.get(3));
//            System.out.println(arrayList1.get(4));
//            System.out.println(arrayList1.get(5));
//            System.out.println(arrayList1.get(7));
//
//            for (Student a : arrayList1) {
//                System.out.println(a);
//            }
//        }catch (ArrayIndexOutOfBoundsException netIndex){
//            System.out.println("Net indexa");
//            netIndex.getMessage();
//        }catch (MyException exception){
//            System.out.println("Negativ age");
//            exception.getMessage();
//        }finally {
//            System.out.println("Buttu");
//        }

//        Д/З №23
//        ArrayList<Integer> san50=new  ArrayList<>();
//        for (int i = 1; i <=50 ; i++) {
//            san50.add(i);
//        }
//        for (int san51:san50) {
//            System.out.println(san51);
//        }
//        ArrayList<Integer> jupsan=new  ArrayList<>();
//        for (int i = 2; i <=100; i+=2) {
//            jupsan.add(i);
//        }
//        for (int jupsan1:jupsan) {
//            System.out.println(jupsan1);
//        }
//        ArrayList<Integer> taksan=new  ArrayList<>();
//        for (int i = 1; i < 100; i+=2) {
//            taksan.add(i);
//        }
//        for (int tak :taksan) {
//            System.out.println(tak);
//        }


        LinkedList<Animal> animals = new LinkedList<>();
        LinkedList<Animal> cats = new LinkedList<>();
        for (int i = 1; i <= 50; i++) {
            animals.add(new Cat(i));
            animals.add(new Dog(i));
        }
        int counterCat = 0;
        int counterDog = 0;
        int mouseAge = 1;
        for (int i = 1; i < animals.size(); i++) {
            if (animals.get(i) instanceof Cat) {
                counterCat++;
                if (counterCat == 5) {
                    animals.remove(i);
                    counterCat = 0;
                }
            }
            if (animals.get(i) instanceof Dog) {
                counterDog++;
                if (counterDog == 3) {
                    animals.add(i + 1, new Mouse(mouseAge));
                    counterDog = 0;
                    mouseAge++;
                }
            }

        }
        for (int i = 0; i < animals.size() - 1; i++) {
            if (animals.get(i) instanceof Mouse) {
                if (animals.get(i - 1) instanceof Cat) {
                    cats.add(animals.get(i - 1));
                    animals.remove(i - 1);
                }
                if (animals.get(i + 1) instanceof Cat) {
                    cats.add(animals.get(i + 1));
                    animals.remove(i + 1);
                }
            }
        }

        int catAge = 0;
        int dogAge = 0;
        int mouseAge1 = 0;
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof Dog) {
                dogAge += animals.get(i).getAge();
            }
            if (animals.get(i) instanceof Cat) {
                catAge += animals.get(i).getAge();
            }
            if (animals.get(i) instanceof Mouse) {
                mouseAge1 += animals.get(i).getAge();
            }
        }
        System.out.println("CatAge: " + catAge);
        System.out.println("DogAge: " + dogAge);
        System.out.println("MouseAge: " + mouseAge1);
        System.out.println(animals);

    }
}