package Lesson_5;

public class Employee {
    private String Name;
    private String Position;
    private String Email;
    private String Phone;
    private int Salary;
    private int Age;

    //  2. Конструктор класса который заполняет эти поля при создании объекта.
    public Employee(String Name, String Position, String Email, String Phone, int Salary, int Age) {
        this.Name = Name;
        this.Position = Position;
        this.Email = Email;
        this.Phone = Phone;
        this.Salary = Salary;
        this.Age = Age;
    }

    // 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    public void infoPersons() {
        System.out.println("Name: " + Name +  " , Position: " + Position + " , Email: " + Email + " , Phone: " + Phone + " , Salary: " + Salary + " , Age: " + Age);
    }

    //      4. Создать массив из 5 сотрудников.
    public static void main(String[] args){
        Employee[]persons = new Employee[5];
        persons[0] = new Employee("Melnikov D.P.","Director","111@.com","+79745260412",100000,45);
        persons[1] = new Employee("Zubarev A.A.","Deputy Director","111@.com","+79745260412",90000,42);
        persons[2] = new Employee("Medvedev D.I.","Programmer","111@.com","+79745260412",80000,33);
        persons[3] = new Employee("Simonov F.O.","Tester ","111@.com","+79745260412",70000,31);
        persons[4] = new Employee("Spirin S.M.","PR Manager","111@.com","+79745260412",60000,25);

//  5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
        for (int i =0; i < persons.length; i++){
            if(persons[i].Age > 40)
                System.out.println("Over 40 years old:  " +  persons[i].Name + "  age- " +  persons[i].Age);
        }
        System.out.println();
//информацияя о сотруднике
        persons[0].infoPersons();

    }
}
