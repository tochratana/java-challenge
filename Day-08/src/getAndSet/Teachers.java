package getAndSet;

import java.util.Arrays;

class Teachers {

    String name ;
    String email;
    Integer age;

    @Override
    public String toString() {
        return "Teachers{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    Teachers(){};
    Teachers(String name, String email, Integer age){
        this.age = age;
        this.name = name;
        this.email = email;
    }

    public static void main(String[] args) {
        Teachers[] teachers = new Teachers[5];
        teachers[0] = new Teachers("Ratana","ratana@gmail.com",12);
        teachers[1] = new Teachers("Chakra","vichaka@gamil.com",23);
        teachers[2] = new Teachers("Chakra","vichaka@gamil.com",23);
        System.out.println(Arrays.toString(teachers));

    }
}
