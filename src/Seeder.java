/**
 * Created by mcd on 20/03/16.
 */
public class Seeder {

    public static void seed(SPLinkedList students, SPLinkedList professors, DLinkedList departments, CLinkedList courses)
    {
        // Departments
        DNode compu = departments.add("Compu", 1);
        DNode electro = departments.add("Electro", 2);
        DNode petro = departments.add("Petro", 3);

        // Students
        students.add("Mahmoud Magdy", 3342, "email", compu, 0, 0);
        students.add("Tarek AlQaddy", 3168, "email", compu, 0, 0);
        students.add("Foo", 3131, "email", electro, 0, 0);
        students.add("Bar", 3333, "email", electro, 0, 0);
        students.add("Baz", 3132, "email", petro, 0, 0);

        // Professors
        professors.add("Foo", 1, "test", compu, 0, 1);
        professors.add("Bar", 2, "test", compu, 0, 1);
        professors.add("Baz", 3, "test", electro, 0, 1);
        professors.add("Test", 4, "test", petro, 0, 1);

        courses.add("Math4",22);
        courses.add("Prog II",25);
        courses.add("Data Structure",28);
        courses.add("Circuits",30);
        courses.getNode(30).addStudent("Foo",students);
        courses.getNode(30).addStudent("Bar",students);
        System.out.println(students.getNode("Foo").getCourses().size+"\n");
        students.getNode("Foo").removeCourse(courses.getNode(30),courses,1,0);

        System.out.println(courses.getNode(30).getNoOfStudents()+"\n");
        System.out.println(students.getNode("Foo").getCourses().size+"\n");

    }

}
