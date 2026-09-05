# 🧩 Core Java – OOPs Concepts

A structured collection of **Core Java OOPs interview questions and answers**, organized topic-wise for Java Backend Developer interview preparation.

---

## ❓ Questions

# 1. Class

1. [What is a Class?](#what-is-a-class)

# 2. Object

1. [What is an Object?](#what-is-an-object)
2. [What is Object class? Explain Object class methods.](#what-is-object-class-explain-object-class-methods)
3. [What are the different ways of creating objects?](#what-are-the-different-ways-of-creating-objects)

# 3. Encapsulation

1. [What is Encapsulation?](#what-is-encapsulation)
2. [How to achieve Encapsulation in Java?](#how-to-achieve-encapsulation-in-java)

# 4. Inheritance

1. [What is Inheritance?](#what-is-inheritance)
2. [What is Diamond Problem? Or Why Java does not support Multiple Inheritance?](#what-is-diamond-problem-or-why-java-does-not-support-multiple-inheritance)
3. [Can multiple inheritance be possible in Java using abstract class?](#can-multiple-inheritance-be-possible-in-java-using-abstract-class)

# 5. Polymorphism

1. [What is Polymorphism?](#what-is-polymorphism)

# 6. Abstraction

1. [What is Abstraction?](#what-is-abstraction)
2. [What happens if normal class has abstract method?](#what-happens-if-normal-class-has-abstract-method)
3. [Can we create objects of abstract classes?](#can-we-create-objects-of-abstract-classes)
4. [Why abstract classes can have constructors?](#why-abstract-classes-can-have-constructors)

# 7. Method Overloading

1. [What is Method Overloading?](#what-is-method-overloading)
2. [Can we overload constructors and methods?](#can-we-overload-constructors-and-methods)

# 8. Method Overriding

1. [What is Method Overriding?](#what-is-method-overriding)
2. [Can we override main method?](#can-we-override-main-method)
3. [Can we overload main method?](#can-we-overload-main-method)
4. [Can JVM execute overloaded main method?](#can-jvm-execute-overloaded-main-method)
5. [What is the difference between Method Overloading and Method Overriding?](#what-is-the-difference-between-method-overloading-and-method-overriding)

# 9. Abstract Class

1. [What is an Abstract Class?](#what-is-an-abstract-class)
2. [Can we create objects of abstract classes?](#can-we-create-objects-of-abstract-classes)
3. [Why can abstract classes have constructors?](#why-can-abstract-classes-have-constructors)
4. [What happens if a normal class has an abstract method?](#what-happens-if-a-normal-class-has-an-abstract-method)

# 10. Interface

1. [What is an Interface?](#what-is-an-interface)
2. [What is the difference between Abstract Class and Interface?](#what-is-the-difference-between-abstract-class-and-interface)
3. [Can interface extend another interface?](#can-interface-extend-another-interface)
4. [Can class implement multiple interfaces?](#can-class-implement-multiple-interfaces)
5. [Can you override default methods in Java 8?](#can-you-override-default-methods-in-java-8)

# 11. Final, Private and Static Methods

1. [What is the difference between final, private and static methods in overriding?](#what-is-the-difference-between-final-private-and-static-methods-in-overriding)

# 12. `super` Keyword

1. [What is super keyword used for?](#what-is-super-keyword-used-for)

# 13. `this` Keyword

1. [What is this keyword used for?](#what-is-this-keyword-used-for)

# 14. Constructors

1. [What is Constructor?](#what-is-constructor)
2. [What are the types of Constructors?](#what-are-the-types-of-constructors)
3. [Can constructor be private? Why?](#can-constructor-be-private-why)
4. [Can we overload constructors?](#can-we-overload-constructors)
5. [Can we overload methods?](#can-we-overload-methods)

# 15. `static` Keyword

1. [What is Static?](#what-is-static)
2. [How does static work at different levels?](#how-does-static-work-at-different-levels)
3. [What are the side effects of overusing static in large codebases?](#what-are-the-side-effects-of-overusing-static-in-large-codebases)
4. [What happens when main is not static?](#what-happens-when-main-is-not-static)
5. [Can multiple static blocks exist?](#can-multiple-static-blocks-exist)
6. [What is the execution order of static blocks and main?](#what-is-the-execution-order-of-static-blocks-and-main)

# 16. Marker Interface

1. [What is Marker Interface?](#what-is-marker-interface)
2. [How to create your own Marker Interface?](#how-to-create-your-own-marker-interface)
3. [What are the real-time usages of Marker Interface?](#what-are-the-real-time-usages-of-marker-interface)

# 17. Annotations

1. [What are Annotations?](#what-are-annotations)
2. [How to create your own Annotation?](#how-to-create-your-own-annotation)

# 18. Enums

1. [What are Enums?](#what-are-enums)

# 19. SOLID Principles

1. [What is SOLID Principle?](#what-is-solid-principle)
2. [What is Single Responsibility Principle (SRP)?](#what-is-single-responsibility-principle-srp)
3. [What is Open/Closed Principle (OCP)?](#what-is-openclosed-principle-ocp)
4. [What is Liskov Substitution Principle (LSP)?](#what-is-liskov-substitution-principle-lsp)
5. [What is Interface Segregation Principle (ISP)?](#what-is-interface-segregation-principle-isp)
6. [What is Dependency Inversion Principle (DIP)?](#what-is-dependency-inversion-principle-dip)

---

## 📝 Answers

# 1. Class

### What is a Class?

A **class** is a blueprint or template used to create objects.

A class defines the **state and behavior** that its objects can have.

A class can contain:

* Variables / fields
* Methods
* Constructors
* Blocks
* Nested classes
* Interfaces

### Example

```java
class Employee {

    int id;
    String name;

    void display() {
        System.out.println(id + " " + name);
    }
}
```

Here, `Employee` is a class.

### Interview Answer

> A class is a blueprint or template that defines the state and behavior of objects. It can contain fields, methods, constructors, and other members.

[⬆ Back to Class Questions](#-questions)

---

# 2. Object

### What is an Object?

An **object** is an instance of a class.

An object has three important characteristics:

* **State** – represented by variables
* **Behavior** – represented by methods
* **Identity** – uniquely identifies the object

### Example

```java
class Employee {

    int id;
    String name;

    void display() {
        System.out.println(id + " " + name);
    }
}
```

Creating an object:

```java
Employee employee = new Employee();
```

Here:

```text
Employee        → Class
employee        → Reference variable
new Employee()  → Object
```

### Interview Answer

> An object is a runtime instance of a class. It has state represented by fields, behavior represented by methods, and identity associated with that particular instance.

[⬆ Back to Object Questions](#-questions)

---

### What is Object class? Explain Object class methods.

`Object` is the **root class of the Java class hierarchy**.

It belongs to the `java.lang` package.

Every Java class directly or indirectly inherits from `Object`, except `Object` itself.

Some important methods provided by `Object` are:

| Method        | Purpose                                    |
| ------------- | ------------------------------------------ |
| `equals()`    | Compares objects for logical equality      |
| `hashCode()`  | Returns hash code of an object             |
| `toString()`  | Returns string representation of an object |
| `getClass()`  | Returns runtime class information          |
| `clone()`     | Creates a copy when cloning is supported   |
| `wait()`      | Causes current thread to wait              |
| `notify()`    | Wakes one waiting thread                   |
| `notifyAll()` | Wakes all waiting threads                  |

### Example

```java
Employee employee = new Employee();

System.out.println(employee.toString());
System.out.println(employee.getClass());
```

### Interview Answer

> `Object` is the root class of Java's class hierarchy. It provides common methods such as `equals()`, `hashCode()`, `toString()`, `getClass()`, `clone()`, `wait()`, `notify()`, and `notifyAll()`.

[⬆ Back to Object Questions](#-questions)

---

### What are the different ways of creating objects?

There are several ways to create objects in Java.

### 1. Using `new` keyword

This is the most common approach.

```java
Employee employee = new Employee();
```

### 2. Using `Class.newInstance()`

Historically, reflection allowed:

```java
Employee employee =
        Employee.class.newInstance();
```

However, `Class.newInstance()` is deprecated in modern Java. Prefer:

```java
Employee employee =
        Employee.class.getDeclaredConstructor().newInstance();
```

### 3. Using `Constructor.newInstance()`

Reflection can be used to invoke a constructor.

```java
Constructor<Employee> constructor =
        Employee.class.getDeclaredConstructor();

Employee employee =
        constructor.newInstance();
```

### 4. Using `clone()`

If a class supports cloning:

```java
Employee copy =
        (Employee) employee.clone();
```

### 5. Using Deserialization

An object can be reconstructed from serialized data.

```java
ObjectInputStream input =
        new ObjectInputStream(fileInputStream);

Employee employee =
        (Employee) input.readObject();
```

### 6. Using Factory Methods

Objects can also be created through factory methods.

```java
Calendar calendar =
        Calendar.getInstance();
```

### 7. Using Dependency Injection

Frameworks such as Spring can create and manage objects.

```java
@Service
class EmployeeService {
}
```

### Interview Answer

> The most common way is using the `new` keyword. Other approaches include reflection, cloning, deserialization, factory methods, and dependency injection frameworks such as Spring.

[⬆ Back to Object Questions](#-questions)

---

# 3. Encapsulation

### What is Encapsulation?

**Encapsulation** is the process of bundling data and the methods that operate on that data into a single unit while restricting direct access to the internal state.

In Java, encapsulation is commonly achieved using:

* `private` fields
* Public/protected methods
* Getters and setters
* Validation logic

### Example

```java
class Employee {

    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {

        if (salary >= 0) {
            this.salary = salary;
        }
    }
}
```

The field cannot be directly accessed from outside the class.

### Interview Answer

> Encapsulation is the process of wrapping data and behavior together and controlling access to the internal state of an object.

[⬆ Back to Encapsulation Questions](#-questions)

---

### How to achieve Encapsulation in Java?

Encapsulation is commonly achieved by:

1. Declaring fields as `private`
2. Providing controlled access through methods
3. Applying validation where required
4. Hiding implementation details

### Example

```java
class BankAccount {

    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
        }
    }
}
```

Instead of allowing:

```java
account.balance = -1000;
```

the class controls how the balance can be modified.

### Interview Answer

> We achieve encapsulation mainly by making fields private and providing controlled access through methods. This also allows us to apply validation and protect the object's internal state.

[⬆ Back to Encapsulation Questions](#-questions)

---

# 4. Inheritance

### What is Inheritance?

**Inheritance** is an OOP mechanism where one class acquires properties and behavior from another class.

Java uses the `extends` keyword for class inheritance.

### Example

```java
class Animal {

    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Barking");
    }
}
```

Here, `Dog` inherits the `eat()` method from `Animal`.

### Advantages

* Code reuse
* Method overriding
* Runtime polymorphism
* Establishes an IS-A relationship

### Types supported with classes

* Single inheritance
* Multilevel inheritance
* Hierarchical inheritance

Java does not support multiple inheritance of classes.

### Interview Answer

> Inheritance allows a child class to acquire accessible properties and behavior from a parent class. In Java, class inheritance is achieved using `extends`.

[⬆ Back to Inheritance Questions](#-questions)

---

### What is Diamond Problem? Or Why Java does not support Multiple Inheritance?

The **Diamond Problem** occurs when a class inherits the same method through multiple parent classes and the compiler cannot determine which implementation should be used.

Example:

```text
        A
       / \
      B   C
       \ /
        D
```

Suppose `A` has:

```java
void show() {
    System.out.println("A");
}
```

If both `B` and `C` inherit from `A`, and `D` inherits from both `B` and `C`, Java would have ambiguity about which `show()` implementation should be used.

Therefore, Java does not support multiple inheritance of classes.

### What about Interfaces?

Java allows a class to implement multiple interfaces.

If multiple interfaces provide conflicting default methods, the implementing class must resolve the conflict.

```java
interface A {

    default void show() {
        System.out.println("A");
    }
}

interface B {

    default void show() {
        System.out.println("B");
    }
}

class C implements A, B {

    @Override
    public void show() {
        A.super.show();
    }
}
```

### Interview Answer

> Java does not support multiple inheritance of classes mainly to avoid ambiguity such as the Diamond Problem. However, Java supports multiple inheritance of type through interfaces, with rules to resolve default-method conflicts.

[⬆ Back to Inheritance Questions](#-questions)

---

### Can multiple inheritance be possible in Java using abstract class?

**No.**

An abstract class is still a class, so Java does not allow a class to extend multiple abstract classes.

This is invalid:

```java
class Child extends ParentA, ParentB {
}
```

A class can extend only **one class**.

However, it can implement multiple interfaces:

```java
class Child implements InterfaceA, InterfaceB {
}
```

### Interview Answer

> Multiple inheritance cannot be achieved using abstract classes because Java allows a class to extend only one class. Multiple inheritance of type can be achieved through interfaces.

[⬆ Back to Inheritance Questions](#-questions)

---

# 5. Polymorphism

### What is Polymorphism?

**Polymorphism** means "many forms."

It allows the same interface, method name, or reference to represent different behavior.

There are two major types:

### 1. Compile-Time Polymorphism

Achieved using **method overloading**.

```java
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

### 2. Runtime Polymorphism

Achieved using **method overriding**.

```java
class Animal {

    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
```

Then:

```java
Animal animal = new Dog();

animal.sound();
```

The actual implementation is selected at runtime.

### Interview Answer

> Polymorphism means one interface or reference can represent multiple forms. Compile-time polymorphism is achieved through method overloading, while runtime polymorphism is achieved through method overriding.

[⬆ Back to Polymorphism Questions](#-questions)

---

# 6. Abstraction

### What is Abstraction?

**Abstraction** means hiding implementation details and exposing only the essential functionality.

Java mainly provides abstraction through:

* Abstract classes
* Interfaces

### Example

```java
abstract class Vehicle {

    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped");
    }
}
```

The caller knows that `start()` exists but does not need to know how it works internally.

### Real-World Example

When we use:

```java
List<String> names =
        new ArrayList<>();
```

we use the `List` abstraction without needing to know all internal implementation details of `ArrayList`.

### Interview Answer

> Abstraction focuses on what an object does rather than how it does it. In Java, it is mainly achieved using abstract classes and interfaces.

[⬆ Back to Abstraction Questions](#-questions)

---

### What happens if normal class has abstract method?

If a class contains an abstract method, the class itself must be declared `abstract`.

This is invalid:

```java
class Vehicle {

    abstract void start();
}
```

It results in a compilation error.

Correct:

```java
abstract class Vehicle {

    abstract void start();
}
```

### Interview Answer

> If a class contains an abstract method, that class must be declared abstract. Otherwise, the compiler reports an error.

[⬆ Back to Abstraction Questions](#-questions)

---

### Can we create objects of abstract classes?

**No, we cannot directly instantiate an abstract class.**

This is invalid:

```java
abstract class Vehicle {
}

Vehicle vehicle =
        new Vehicle();
```

However, an abstract class reference can point to a concrete subclass object:

```java
Vehicle vehicle =
        new Car();
```

This is commonly used for runtime polymorphism.

### Interview Answer

> We cannot directly create an object of an abstract class because it may contain abstract methods without implementations. But we can create a reference of the abstract class type pointing to a concrete subclass object.

[⬆ Back to Abstraction Questions](#-questions)

---

### Why abstract classes can have constructors?

An abstract class can have a constructor because its constructor is executed when a subclass object is created.

### Example

```java
abstract class Vehicle {

    Vehicle() {
        System.out.println("Vehicle constructor");
    }
}

class Car extends Vehicle {

    Car() {
        System.out.println("Car constructor");
    }
}
```

When:

```java
Car car = new Car();
```

the output is:

```text
Vehicle constructor
Car constructor
```

The parent constructor initializes the parent portion of the child object.

### Interview Answer

> Abstract classes can have constructors because the constructor is used to initialize common state when a subclass object is created.

[⬆ Back to Abstraction Questions](#-questions)

---

# 7. Method Overloading

### What is Method Overloading?

**Method Overloading** means having multiple methods with the same name but different parameter lists.

It provides **compile-time polymorphism**.

### Example

```java
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}
```

The overloaded methods must differ in their parameter list.

They can differ by:

* Number of parameters
* Type of parameters
* Order of parameters

### Important

Changing only the return type is not method overloading.

Invalid:

```java
int add(int a, int b) {
    return a + b;
}

double add(int a, int b) {
    return a + b;
}
```

### Interview Answer

> Method overloading occurs when multiple methods have the same name but different parameter lists. It is an example of compile-time polymorphism.

[⬆ Back to Method Overloading Questions](#-questions)

---

### Can we overload constructors and methods?

**Yes.**

Constructors can be overloaded:

```java
class Employee {

    Employee() {
    }

    Employee(int id) {
    }

    Employee(int id, String name) {
    }
}
```

Methods can also be overloaded:

```java
void display() {
}

void display(int id) {
}

void display(String name) {
}
```

### Important Point

The parameter list must be different.

Changing only the return type does not work.

[⬆ Back to Method Overloading Questions](#-questions)

---

# 8. Method Overriding

### What is Method Overriding?

**Method Overriding** occurs when a subclass provides its own implementation of an inherited method.

It provides **runtime polymorphism**.

### Example

```java
class Animal {

    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
```

Then:

```java
Animal animal = new Dog();

animal.sound();
```

Output:

```text
Dog barks
```

The method is selected based on the actual object at runtime.

### Important Rules

* Method name must be the same.
* Parameter list must be the same.
* Return type must be compatible.
* Access level cannot be more restrictive.
* `final` methods cannot be overridden.
* `private` methods cannot be overridden.
* `static` methods are hidden, not overridden.

[⬆ Back to Method Overriding Questions](#-questions)

---

### Can we override main method?

**No.**

The main method is declared `static`:

```java
public static void main(String[] args)
```

Static methods are not overridden.

They are associated with the class rather than participating in runtime method dispatch.

### Interview Answer

> We cannot override the main method because it is static. Static methods are hidden rather than overridden.

[⬆ Back to Method Overriding Questions](#-questions)

---

### Can we overload main method?

**Yes.**

We can define multiple `main()` methods with different parameter lists.

```java
public static void main(String[] args) {
    System.out.println("Standard main");
}

public static void main(int value) {
    System.out.println("Overloaded main");
}
```

This is valid method overloading.

[⬆ Back to Method Overriding Questions](#-questions)

---

### Can JVM execute overloaded main method?

The Java launcher looks for the standard application entry point:

```java
public static void main(String[] args)
```

For example:

```java
public static void main(int value) {
}
```

is an overloaded method, but it is not the standard entry point.

Therefore, the launcher starts execution through the recognized `main(String[] args)` method.

[⬆ Back to Method Overriding Questions](#-questions)

---

### What is the difference between Method Overloading and Method Overriding?

| Feature      | Method Overloading                | Method Overriding         |
| ------------ | --------------------------------- | ------------------------- |
| Polymorphism | Compile-time                      | Runtime                   |
| Parameters   | Must be different                 | Must be same              |
| Inheritance  | Not mandatory                     | Required                  |
| Binding      | Early binding                     | Dynamic dispatch          |
| Purpose      | Multiple forms of same operation  | Change inherited behavior |
| Return type  | Cannot differ only by return type | Must be same or covariant |
| `static`     | Can overload                      | Static methods are hidden |

### Interview Answer

> Overloading means same method name with different parameters and provides compile-time polymorphism. Overriding means a subclass provides a new implementation of an inherited method and provides runtime polymorphism.

[⬆ Back to Method Overriding Questions](#-questions)

---

# 9. Abstract Class

### What is an Abstract Class?

An **abstract class** is a class declared using the `abstract` keyword.

It can contain:

* Abstract methods
* Concrete methods
* Instance variables
* Static variables
* Constructors
* Initialization blocks

### Example

```java
abstract class Vehicle {

    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped");
    }
}
```

A subclass can provide the implementation:

```java
class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts");
    }
}
```

### Interview Answer

> An abstract class is a partially implemented class that can contain both abstract and concrete methods. It is useful when related classes need to share common state and behavior.

[⬆ Back to Abstract Class Questions](#-questions)

---

### Can we create objects of abstract classes?

No, an abstract class cannot be directly instantiated.

```java
Vehicle vehicle =
        new Vehicle();
```

This is invalid.

But:

```java
Vehicle vehicle =
        new Car();
```

is valid because `Car` is concrete.

[⬆ Back to Abstract Class Questions](#-questions)

---

### Why can abstract classes have constructors?

An abstract class constructor is used to initialize the common state inherited by subclasses.

```java
abstract class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }
}
```

When a subclass object is created, the abstract class constructor is executed.

[⬆ Back to Abstract Class Questions](#-questions)

---

### What happens if a normal class has an abstract method?

A class containing an abstract method must itself be abstract.

```java
abstract class Vehicle {

    abstract void start();
}
```

A concrete subclass must implement the abstract method unless the subclass is also abstract.

[⬆ Back to Abstract Class Questions](#-questions)

---

# 10. Interface

### What is an Interface?

An **interface** defines a contract that implementing classes agree to follow.

Modern Java interfaces can contain:

* Abstract methods
* Default methods
* Static methods
* Private methods
* Constants

### Example

```java
interface Payment {

    void pay();
}
```

Implementation:

```java
class CreditCardPayment
        implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment successful");
    }
}
```

### Interview Answer

> An interface defines a contract or capability that classes can implement. It is commonly used to achieve abstraction, loose coupling, and multiple inheritance of type.

[⬆ Back to Interface Questions](#-questions)

---

### What is the difference between Abstract Class and Interface?

| Feature              | Abstract Class        | Interface                                   |
| -------------------- | --------------------- | ------------------------------------------- |
| Keyword              | `abstract class`      | `interface`                                 |
| Constructor          | Yes                   | No                                          |
| Instance variables   | Yes                   | No                                          |
| Abstract methods     | Yes                   | Yes                                         |
| Concrete methods     | Yes                   | Yes, through default/private/static methods |
| Multiple inheritance | No                    | A class can implement multiple interfaces   |
| Fields               | Normal fields allowed | Fields are implicitly `public static final` |
| Relationship         | `extends`             | `implements`                                |

### When to use Abstract Class?

Use an abstract class when related classes need:

* Common state
* Common implementation
* Shared behavior

### When to use Interface?

Use an interface when you want:

* A contract
* A capability
* Loose coupling
* Multiple implementations

### Interview Answer

> I prefer an abstract class when closely related classes need shared state or implementation. I prefer an interface when I need to define a contract or capability that can have multiple implementations.

[⬆ Back to Interface Questions](#-questions)

---

### Can interface extend another interface?

**Yes.**

An interface can extend another interface.

```java
interface Animal {

    void eat();
}

interface Dog extends Animal {

    void bark();
}
```

An interface can also extend multiple interfaces:

```java
interface A {
}

interface B {
}

interface C extends A, B {
}
```

[⬆ Back to Interface Questions](#-questions)

---

### Can class implement multiple interfaces?

**Yes.**

```java
interface Printable {

    void print();
}

interface Scannable {

    void scan();
}

class Machine
        implements Printable, Scannable {

    @Override
    public void print() {
    }

    @Override
    public void scan() {
    }
}
```

This is one of the ways Java supports multiple inheritance of type.

[⬆ Back to Interface Questions](#-questions)

---

### Can you override default methods in Java 8?

**Yes.**

A class can override a default method provided by an interface.

```java
interface Vehicle {

    default void start() {
        System.out.println("Vehicle starts");
    }
}

class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car starts");
    }
}
```

If two interfaces provide conflicting default methods, the implementing class must resolve the conflict.

[⬆ Back to Interface Questions](#-questions)

---

# 11. Final, Private and Static Methods

### What is the difference between final, private and static methods in overriding?

These three types behave differently with respect to inheritance and overriding.

| Method    | Inherited? | Can be overridden? | Behavior            |
| --------- | ---------- | ------------------ | ------------------- |
| `final`   | Yes        | No                 | Prevents overriding |
| `private` | No         | No                 | Not inherited       |
| `static`  | Yes        | No                 | Method hiding       |

### `final` Method

```java
class Parent {

    final void show() {
    }
}
```

Child classes cannot override it.

### `private` Method

```java
class Parent {

    private void show() {
    }
}
```

The method is not inherited by the child.

### `static` Method

```java
class Parent {

    static void show() {
    }
}

class Child extends Parent {

    static void show() {
    }
}
```

This is **method hiding**, not overriding.

### Interview Answer

> A final method cannot be overridden, a private method is not inherited and therefore cannot be overridden, and a static method is associated with the class and can only be hidden.

[⬆ Back to Final, Private and Static Questions](#-questions)

---

# 12. `super` Keyword

### What is super keyword used for?

`super` refers to the **immediate parent class object/part of the current object**.

It is commonly used for three purposes.

### 1. Access Parent Class Variable

```java
class Parent {

    int value = 10;
}

class Child extends Parent {

    int value = 20;

    void display() {
        System.out.println(super.value);
    }
}
```

### 2. Call Parent Class Method

```java
class Parent {

    void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {

    @Override
    void show() {

        super.show();

        System.out.println("Child");
    }
}
```

### 3. Call Parent Class Constructor

```java
class Parent {

    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {

    Child() {

        super();

        System.out.println("Child constructor");
    }
}
```

`super()` must be the first statement in a constructor.

### Interview Answer

> The `super` keyword is used to access the immediate parent class's fields and methods and to invoke the parent class constructor.

[⬆ Back to `super` Questions](#-questions)

---

# 13. `this` Keyword

### What is this keyword used for?

`this` refers to the **current object**.

It can be used to:

1. Access current class variables
2. Resolve variable shadowing
3. Invoke another constructor
4. Pass the current object
5. Return the current object

### Example – Variable Shadowing

```java
class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }
}
```

Here:

```text
this.name → instance variable
name      → constructor parameter
```

### Constructor Chaining

```java
class Employee {

    Employee() {
        this(100);
    }

    Employee(int id) {
        System.out.println(id);
    }
}
```

### Interview Answer

> The `this` keyword refers to the current object. It is commonly used to access instance variables, resolve variable shadowing, invoke another constructor, and pass or return the current object.

[⬆ Back to `this` Questions](#-questions)

---

# 14. Constructors

### What is Constructor?

A **constructor** is a special member of a class used to initialize objects.

Characteristics:

* Constructor name must match the class name.
* It does not have a return type.
* It executes when an object is created.
* Constructors can be overloaded.
* Constructors are not inherited.
* Constructors cannot be overridden.

### Example

```java
class Employee {

    Employee() {
        System.out.println("Constructor called");
    }
}
```

### Interview Answer

> A constructor is a special member of a class that is invoked during object creation and is mainly used to initialize the object's state.

[⬆ Back to Constructor Questions](#-questions)

---

### What are the types of Constructors?

The commonly discussed types are:

### 1. No-Argument Constructor

```java
class Employee {

    Employee() {
    }
}
```

### 2. Parameterized Constructor

```java
class Employee {

    Employee(int id, String name) {
    }
}
```

### Important Point

If you do not declare any constructor, the compiler provides a default no-argument constructor.

But once you declare a constructor, the compiler does not automatically provide a no-argument constructor.

[⬆ Back to Constructor Questions](#-questions)

---

### Can constructor be private? Why?

**Yes.**

A constructor can be private.

It prevents direct object creation from outside the class.

### Example

```java
class Singleton {

    private Singleton() {
    }
}
```

Private constructors are commonly used in:

* Singleton pattern
* Utility classes
* Factory-based object creation

### Example

```java
class Utility {

    private Utility() {
    }

    static void print() {
        System.out.println("Utility");
    }
}
```

[⬆ Back to Constructor Questions](#-questions)

---

### Can we overload constructors?

**Yes.**

Constructors can be overloaded by changing their parameter lists.

```java
class Employee {

    Employee() {
    }

    Employee(int id) {
    }

    Employee(int id, String name) {
    }
}
```

This is constructor overloading.

[⬆ Back to Constructor Questions](#-questions)

---

### Can we overload methods?

**Yes.**

Methods can be overloaded by changing their parameter list.

```java
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

Changing only the return type is not enough.

[⬆ Back to Constructor Questions](#-questions)

---

# 15. `static` Keyword

### What is Static?

`static` indicates that a member belongs to the **class rather than an individual object**.

Static can be used with:

* Variables
* Methods
* Blocks
* Nested classes

### Example

```java
class Employee {

    static String company =
            "ABC Technologies";
}
```

All Employee objects can share the same static variable.

### Interview Answer

> The static keyword is used to define class-level members that belong to the class rather than individual objects.

[⬆ Back to Static Questions](#-questions)

---

### How does static work at different levels?

### Static Variable

A static variable belongs to the class.

```java
class Employee {

    static String company = "ABC";
}
```

### Static Method

A static method belongs to the class.

```java
class Calculator {

    static int add(int a, int b) {
        return a + b;
    }
}
```

Calling:

```java
Calculator.add(10, 20);
```

### Static Block

A static block executes during class initialization.

```java
class Demo {

    static {

        System.out.println(
            "Static block"
        );
    }
}
```

### Static Nested Class

A nested class can be static.

```java
class Outer {

    static class Inner {
    }
}
```

[⬆ Back to Static Questions](#-questions)

---

### What are the side effects of overusing static in large codebases?

Overusing `static` can cause several problems.

### 1. Tight Coupling

Classes can become strongly dependent on global state.

### 2. Difficult Unit Testing

Static dependencies can be harder to isolate and mock.

### 3. Shared Mutable State

Static mutable variables are shared by multiple threads and objects.

### 4. Reduced Flexibility

Static methods do not participate in runtime overriding.

### 5. Hidden Dependencies

Global/static state can make it difficult to understand where data is coming from or being modified.

### Interview Answer

> Static is useful for class-level functionality, but overusing it can introduce shared state, increase coupling, make testing harder, and reduce flexibility. In backend applications, I prefer dependency injection for services and dependencies instead of relying heavily on static state.

[⬆ Back to Static Questions](#-questions)

---

### What happens when main is not static?

The traditional Java application entry point must be:

```java
public static void main(String[] args)
```

If `static` is removed:

```java
public void main(String[] args)
```

the Java launcher cannot use it as the standard application entry point.

The reason is that the launcher needs to invoke the entry point without first creating an instance of the class.

### Interview Answer

> The main method is static so that the Java launcher can invoke it without creating an object of the class first.

[⬆ Back to Static Questions](#-questions)

---

### Can multiple static blocks exist?

**Yes.**

A class can contain multiple static blocks.

```java
class Demo {

    static {
        System.out.println("Static Block 1");
    }

    static {
        System.out.println("Static Block 2");
    }

    public static void main(String[] args) {
        System.out.println("Main");
    }
}
```

Output:

```text
Static Block 1
Static Block 2
Main
```

Static blocks execute in the order in which they appear during class initialization.

[⬆ Back to Static Questions](#-questions)

---

### What is the execution order of static blocks and main?

For a normally launched Java application:

```text
Class Loading / Initialization
        ↓
Static Variable Initialization
        ↓
Static Blocks
        ↓
main()
```

Example:

```java
class Demo {

    static int value = 10;

    static {
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }
}
```

Output:

```text
Static block
Main method
```

### Interview Answer

> During class initialization, static fields and static initialization blocks are processed before the `main()` method executes.

[⬆ Back to Static Questions](#-questions)

---

# 16. Marker Interface

### What is Marker Interface?

A **Marker Interface** is an interface that does not define any methods or fields for implementing classes.

It is used to mark a class as having a particular capability or characteristic.

### Example

```java
interface MyMarker {
}
```

A class can implement it:

```java
class Employee implements MyMarker {
}
```

We can check:

```java
if (employee instanceof MyMarker) {
    System.out.println(
        "Employee is marked"
    );
}
```

### Interview Answer

> A marker interface is an empty interface used to provide metadata or indicate a special capability of a class.

[⬆ Back to Marker Interface Questions](#-questions)

---

### How to create your own Marker Interface?

Create an empty interface:

```java
interface Auditable {
}
```

Then implement it:

```java
class Employee implements Auditable {
}
```

Now the application can identify classes that implement `Auditable`.

[⬆ Back to Marker Interface Questions](#-questions)

---

### What are the real-time usages of Marker Interface?

Examples include:

### `Serializable`

```java
class Employee
        implements Serializable {
}
```

It indicates that objects can participate in Java serialization.

### `Cloneable`

```java
class Employee
        implements Cloneable {
}
```

It indicates that the class supports cloning through the `Object.clone()` mechanism.

### Interview Answer

> Common examples of marker interfaces include `Serializable` and `Cloneable`. They communicate metadata or capabilities to the Java runtime or APIs.

[⬆ Back to Marker Interface Questions](#-questions)

---

# 17. Annotations

### What are Annotations?

Annotations are **metadata** that provide additional information about Java program elements.

They can be used on:

* Classes
* Methods
* Fields
* Parameters
* Constructors
* Packages
* Other program elements

Examples:

```java
@Override
@Deprecated
@SuppressWarnings
```

Frameworks such as Spring heavily use annotations.

Examples:

```java
@Service
@RestController
@Autowired
@Entity
```

### Interview Answer

> Annotations are metadata that provide additional information about program elements. They can be processed by the compiler, tools, frameworks, or runtime reflection.

[⬆ Back to Annotation Questions](#-questions)

---

### How to create your own Annotation?

We can define a custom annotation using `@interface`.

### Example

```java
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {

    String value();
}
```

Using it:

```java
class Employee {

    @MyAnnotation("Employee Method")
    public void display() {
        System.out.println("Employee");
    }
}
```

The annotation can be read using Reflection:

```java
Method method =
        Employee.class
                .getMethod("display");

MyAnnotation annotation =
        method.getAnnotation(
            MyAnnotation.class
        );

System.out.println(
    annotation.value()
);
```

### Important Meta-Annotations

| Annotation    | Purpose                                        |
| ------------- | ---------------------------------------------- |
| `@Retention`  | Defines how long annotation is retained        |
| `@Target`     | Defines where annotation can be used           |
| `@Documented` | Includes annotation in generated documentation |
| `@Inherited`  | Allows class-level annotations to be inherited |

[⬆ Back to Questions](#-questions)

---

# 18. Enums

### What are Enums?

An `enum` is a special Java type used to represent a **fixed set of constants**.

### Example

```java
enum Status {

    ACTIVE,
    INACTIVE,
    PENDING
}
```

Using it:

```java
Status status =
        Status.ACTIVE;
```

Enums provide type safety compared with using arbitrary integer or string constants.

### Enums can also contain:

* Fields
* Methods
* Constructors
* Implemented interfaces

### Example

```java
enum Status {

    ACTIVE("Active"),
    INACTIVE("Inactive");

    private String value;

    Status(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
```

### Important Point

Enum constructors are implicitly private.

An enum cannot extend another class because it already extends `java.lang.Enum`.

However, an enum can implement interfaces.

### Interview Answer

> An enum is a special Java type used to represent a fixed set of constants. Enums can also contain fields, methods, constructors, and can implement interfaces.

[⬆ Back to Questions](#-questions)

---

# 19. SOLID Principles

### What is SOLID Principle?

**SOLID** is a set of five object-oriented design principles that help us write code that is:

* Maintainable
* Flexible
* Testable
* Loosely coupled
* Easier to extend

SOLID stands for:

| Letter | Principle                       |
| ------ | ------------------------------- |
| **S**  | Single Responsibility Principle |
| **O**  | Open/Closed Principle           |
| **L**  | Liskov Substitution Principle   |
| **I**  | Interface Segregation Principle |
| **D**  | Dependency Inversion Principle  |

### Interview Answer

> SOLID is a set of five object-oriented design principles that help us design maintainable, loosely coupled, flexible, and testable software.

[⬆ Back to Questions](#-questions)

---

### What is Single Responsibility Principle (SRP)?

> **A class should have one reason to change.**

A class should ideally have one well-defined responsibility.

### Bad Design

```java
class EmployeeService {

    void calculateSalary() {
    }

    void generateReport() {
    }

    void sendEmail() {
    }
}
```

This class has multiple responsibilities.

### Better Design

```java
class SalaryService {

    void calculateSalary() {
    }
}

class ReportService {

    void generateReport() {
    }
}

class EmailService {

    void sendEmail() {
    }
}
```

Each class now has a focused responsibility.

### Interview Answer

> SRP means a class should have one primary responsibility and one reason to change.

[⬆ Back to Questions](#-questions)

---

### What is Open/Closed Principle (OCP)?

> **Software entities should be open for extension but closed for modification.**

This means we should be able to add new behavior without unnecessarily modifying stable existing code.

### Example

```java
interface Payment {

    void pay();
}
```

Implementations:

```java
class CreditCardPayment
        implements Payment {

    @Override
    public void pay() {
        System.out.println(
            "Credit Card Payment"
        );
    }
}
```

```java
class UPIPayment
        implements Payment {

    @Override
    public void pay() {
        System.out.println(
            "UPI Payment"
        );
    }
}
```

We can add:

```java
class WalletPayment
        implements Payment {

    @Override
    public void pay() {
        System.out.println(
            "Wallet Payment"
        );
    }
}
```

without modifying the existing payment implementations.

### Interview Answer

> OCP means existing code should be closed for unnecessary modification but open for extension. We can achieve this through abstractions, interfaces, and polymorphism.

[⬆ Back to Questions](#-questions)

---

### What is Liskov Substitution Principle (LSP)?

> **Objects of a child class should be replaceable for objects of the parent class without breaking the expected behavior of the application.**

Example:

```java
class Animal {

    void sound() {
        System.out.println(
            "Animal sound"
        );
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println(
            "Dog barks"
        );
    }
}
```

This should work correctly:

```java
Animal animal = new Dog();

animal.sound();
```

The child class should respect the contract expected from the parent.

### Interview Answer

> LSP means a subclass should be safely substitutable for its parent class without changing the expected correctness or behavior of the application.

[⬆ Back to Questions](#-questions)

---

### What is Interface Segregation Principle (ISP)?

> **A class should not be forced to depend on methods that it does not use.**

Instead of creating one large interface, create smaller, focused interfaces.

### Bad Design

```java
interface Machine {

    void print();

    void scan();

    void fax();
}
```

A simple printer may not need `scan()` or `fax()`.

### Better Design

```java
interface Printer {

    void print();
}

interface Scanner {

    void scan();
}

interface Fax {

    void fax();
}
```

Now a class can implement only the capabilities it requires.

### Interview Answer

> ISP recommends creating smaller, focused interfaces so that implementing classes are not forced to implement methods they do not need.

[⬆ Back to Questions](#-questions)

---

### What is Dependency Inversion Principle (DIP)?

> **High-level modules should not depend directly on low-level modules. Both should depend on abstractions.**

### Tightly Coupled

```java
class OrderService {

    private MySQLDatabase database =
            new MySQLDatabase();
}
```

`OrderService` directly depends on `MySQLDatabase`.

### Better Design

```java
interface Database {

    void save();
}
```

Implementation:

```java
class MySQLDatabase
        implements Database {

    @Override
    public void save() {
        System.out.println(
            "Saving to MySQL"
        );
    }
}
```

Service:

```java
class OrderService {

    private final Database database;

    OrderService(Database database) {
        this.database = database;
    }

    void createOrder() {
        database.save();
    }
}
```

Now `OrderService` depends on the abstraction `Database`.

This improves:

* Loose coupling
* Testability
* Maintainability
* Flexibility

### Interview Answer

> DIP means high-level business logic should depend on abstractions rather than concrete implementations. In Spring applications, dependency injection is commonly used to achieve this.

[⬆ Back to Questions](#-questions)

---


[⬆ Go to OOPs Questions](#-questions)
