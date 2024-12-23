package model;

import java.util.UUID;

public class OutPut {
    public static void main(String[] args) {
        Teacher teacher =
                new Teacher("Toch Ratana",19, UUID.randomUUID());
        System.out.println(teacher);

        System.out.println("His name is : " + teacher.name());
        System.out.println("His age is  : " + teacher.age());
        System.out.println(teacher.teacherInfo());
    }
}
