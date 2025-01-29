package static_vs_instance;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 5; i++){
            LPAStudent student = new LPAStudent(
                "S000" + i,
                switch (i){
                case 1 -> "Ratana";
                case 2 -> "Dara";
                case 3 -> "Mina";
                case 4 -> "Mika";
                case 5 -> "Vicar";
                default -> "Anonymous";
                },
                "12/03/2000",
                "DavOop");
            System.out.println(student);
        }


        Student pojoStudent = new Student("S0006","POJO","23/03/2003","Backend");
        LPAStudent recordStudent = new LPAStudent("S0007","Record","22/09/2005","AI");
        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        System.out.println(pojoStudent.getName() + " thinking about "+ pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " thinking about "+ recordStudent.classList());



    }
}
