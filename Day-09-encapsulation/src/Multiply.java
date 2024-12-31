
// example Class Son extends Mother, Father.

class Mother {
    String name;
    Integer age;
}

class Father {
    String email;
    Integer password;
}


// we call Hierarchical inherit
class Son1 {}
class Son2{}

// we call hybrid inherit
class GrandSon {}

// Will be errors, we can't
// class can't extend from multiplied class.
// class Son extends Mother, Father {
//
//}

// It-a, it means class hae a relationship with another class





// Has-a : has a relationship
// example : this class have a relationship with class Son1 because
// the class Child1 have a Object from Son1
class Child1 {

    Son1 son1 = new Son1();
}

public class Multiply {
}
