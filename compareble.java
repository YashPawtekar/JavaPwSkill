import java.util.*;

class StudentNewN implements Comparable<StudentNewN> {
    public String StudenName;
    public String Studendiv;
    public int StudenClass;

    public StudentNewN(String studenName, String studendiv, int studenClass) {
        StudenName = studenName;
        Studendiv = studendiv;
        StudenClass = studenClass;
    }

    public String getStudenName() {
        return StudenName;
    }

    public String getStudendiv() {
        return Studendiv;
    }

    public int getStudenClass() {
        return StudenClass;
    }

    @Override
    public String toString() {
        return "StudenName=" + StudenName + ", Studendiv=" + Studendiv + ", StudenClass=" + StudenClass;
    }

    public int compare(StudentNewN st){
        if (this.StudenClass> st.StudenClass) {
                        return 1;
                    } else {
                        return -1;
                    }
    }

    @Override
    public int compareTo(StudentNewN o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

}
  //   Step 1
// class alpha implements Comparator<StudentNewN> {
//     public int compare(StudentNewN a, StudentNewN b) {
//         if (a.StudenClass<b.StudenClass) {
//             return 1;
//         } else {
//             return -1;
//         }
//     }
// }

public class compareble {
    public static void main(String[] args) {
        StudentNewN stu = new StudentNewN("Yash", "A", 10);
        StudentNewN stu2 = new StudentNewN("varad", "c", 2);
        StudentNewN stu1 = new StudentNewN("jay", "b", 5);

        //   Step 1
        // alpha al = new alpha();



        //   Step 2
        // Comparator<StudentNewN> cm = (StudentNewN a, StudentNewN b)->{
        //                 if (a.StudenClass<b.StudenClass) {
        //                     return 1;
        //                 } else {
        //                     return -1;
        //                 }
                    
        // };

        List<StudentNewN> list = new ArrayList<StudentNewN>();
        list.add(stu);
        list.add(stu1);
        list.add(stu2);
    //    Collections.sort(list, cm);
        System.out.println(list);
    }
}
