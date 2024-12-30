# Constructor Challenge Exercise

So for this challenge, you'll want to:
1. Create a new class, called Customer, with three fields:
- name
- credit limit
- email address.
2. Create the getter methods only for each field.  You don't need to create the setters.
- First, create a constructor for all three fields which should assign the arguments directly to the instance fields.
```java
    User(String name, String email, Integer id){
    this.name = name;
    this.email = email;
    this.id = id;
}
```
- Second, create a no-args constructor that calls another constructor, passing some literal values for each argument.
```java
User(){
    this("Name","email","ID");
}
```
- And lastly, create a constructor with just the name and email parameters, which also calls another constructor.
```java
User(String name, String email){
        this(name,email,null);
    }
```
3. Create object to call those user.