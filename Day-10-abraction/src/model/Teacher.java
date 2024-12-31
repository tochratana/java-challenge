package model;

import java.util.UUID;
record Parents (Integer money, String house){}

public record Teacher(String name, int age, UUID uuid) {
    public String teacherInfo() {
        return "Teacher: " + name + ", Age: " + age + ", ID: " + uuid;
    }
}

record Student (){}