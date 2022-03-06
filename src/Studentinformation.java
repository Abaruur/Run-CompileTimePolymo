import java.util.ArrayList;
import java.util.Iterator;

public class Studentinformation {

    public void SetStudentinfo(int rol, String name, int age)
    {
        ArrayList<Student> al=new ArrayList<Student>();
        Student st = new Student();
        st.setAge(age);//adding Student class object
        st.setRollno(rol);
        st.setName(name);

        al.add(st);
        for(Student a : al){
            int agee = st.getAge();
            String Namee = st.getName();
            int rolnumbere = st.getRollno();

            System.out.println(Namee + " " + agee + " " + rolnumbere);
        }

    }

}
