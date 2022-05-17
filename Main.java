import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try {
      Scanner skan = new Scanner(System.in);
      Service1 s = new Service1();
      int x=4;
      String name;
      String forename;
      int age;
      String born;
      System.out.println("Witaj!");
      while(x!=0)
        {
          System.out.println("1-nowy student 2-wyswietl wszystkich");
          x=skan.nextInt();
          switch(x)
            {
                case 1:
                {
                  Scanner skan1 = new Scanner(System.in);
                  System.out.println("imie");
                  name=skan1.nextLine();
                  System.out.println("nazwisko");
                  forename=skan1.nextLine();
                  System.out.println("wiek ");
                  age=skan.nextInt();
                  System.out.println("Podaj date urodz");
                  born=skan1.nextLine();
                  s.addStudent(new Student(name, forename, age,born));
                }break;

                case 2:
                {
                  var students = s.getStudents();
                  for(Student current : students)
                    {
                  System.out.println(current.ToString());
                    }
                }break;
                
            }
            
        }
      
     
    } catch (IOException e) {

    }
  }
}