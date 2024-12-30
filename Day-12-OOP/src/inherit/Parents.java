package inherit;

sealed class Parents permits Child {
    String name;
    Integer id;
    String email;

}

non-sealed class Child extends Parents {

}
