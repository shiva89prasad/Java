# ☕ Java OOPs Concepts – Interview Questions & Answers

A structured collection of **Java Object-Oriented Programming (OOPs) interview questions and answers**, designed for Java developers preparing for technical interviews.

> 📌 **Quick Navigation:** Click any question below to jump directly to its answer.
> 🔙 Every answer contains a **Back to Questions** link.

---

## 📚 Table of Contents

* [1. Class & Object](#1-class--object)
* [2. Encapsulation](#2-encapsulation)
* [3. Inheritance](#3-inheritance)
* [4. Polymorphism](#4-polymorphism)
* [5. Abstraction](#5-abstraction)
* [6. Method Overloading & Overriding](#6-method-overloading--overriding)
* [7. Abstract Class & Interface](#7-abstract-class--interface)
* [8. IS-A & HAS-A Relationship](#8-is-a--has-a-relationship)
* [9. `this` & `super` Keywords](#9-this--super-keywords)
* [10. Constructors](#10-constructors)
* [11. Static Keyword](#11-static-keyword)
* [12. Final, Private & Static Methods](#12-final-private--static-methods)
* [13. Main Method](#13-main-method)
* [14. Marker Interfaces](#14-marker-interfaces)
* [15. Annotations](#15-annotations)
* [16. Enums](#16-enums)
* [17. SOLID Principles](#17-solid-principles)
* [18. Quick Revision](#18-quick-revision)

---

# 1. Class & Object

## ❓ Questions

1. [What is a Class?](#what-is-a-class)
2. [What is an Object?](#what-is-an-object)
3. [What is the Object class? Explain Object class methods.](#what-is-the-object-class-explain-object-class-methods)
4. [What are the different ways of creating objects in Java?](#what-are-the-different-ways-of-creating-objects-in-java)

---

## What is a Class?

A **class** is a user-defined blueprint or template used to create objects.

A class can contain:

* Fields / variables
* Methods
* Constructors
* Blocks
* Nested classes
* Interfaces

### Example

```java
class Employee {

    private int id;
    private String name;

    void display() {
        System.out.println(id + " " + name);
    }
}
```

Here, `Employee` is a class.

[⬆ Back to Questions](#-questions)

---

## What is an Object?

An **object** is an instance of a class.

An object has:

* **State** → represented by fields
* **Behavior** → represented by methods
* **Identity** → uniquely identifies the object

### Example

```java
Employee employee = new Employee();
```

Here:

* `Employee` → class
* `employee` → reference variable
* `new Employee()` → object creation

[⬆ Back to Questions](#-questions)

---

## What is the Object class? Explain Object class methods.

`Object` is the root superclass of almost every Java class.

It belongs to the:

```java
java.lang
```

package.

Some important methods provided by `Object` are:

| Method        | Purpose                                  |
| ------------- | ---------------------------------------- |
| `equals()`    | Compares objects for logical equality    |
| `hashCode()`  | Returns hash code of an object           |
| `toString()`  | Returns string representation            |
| `clone()`     | Creates a copy when cloning is supported |
| `wait()`      | Causes the current thread to wait        |
| `notify()`    | Wakes one waiting thread                 |
| `notifyAll()` | Wakes all waiting threads                |
| `getClass()`  | Returns runtime class information        |

### Example

```java
Employee employee = new Employee();

System.out.println(employee.toString());
System.out.println(employee.getClass());
```

[⬆ Back to Questions](#-questions)

---

## What are the different ways of creating objects in Java?

Common approaches include:

### 1. Using `new`

```java
Employee employee = new Employee();
```

### 2. Using `clone()`

Creates a copy of an existing object when the class supports cloning.

```java
Employee copy = (Employee) employee.clone();
```

### 3. Using Deserialization

An object can be reconstructed from a serialized stream.

```java
ObjectInputStream input =
        new ObjectInputStream(fileInputStream);

Employee employee =
        (Employee) input.readObject();
```

### 4. Using Dependency Injection

Frameworks such as Spring can create and manage objects.

```java
@Service
class EmployeeService {
}
```

### 5. Using Factory Methods

Objects can be created through factory methods.

```java
Calendar calendar = Calendar.getInstance();
```

[⬆ Back to Questions](#-questions)

---

# 2. Encapsulation

## ❓ Questions

1. [What is Encapsulation?](#what-is-encapsulation)
2. [How do you achieve Encapsulation in Java?](#how-do-you-achieve-encapsulation-in-java)

---

## What is Encapsulation?

**Encapsulation** is the process of wrapping data and the methods that operate on that data into a single unit and controlling direct access to the data.

Usually, fields are declared `private` and accessed through methods.

### Example

```java
class Employee {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```

Here, direct access to `name` is restricted.

[⬆ Back to Questions](#-questions)

---

## How do you achieve Encapsulation in Java?

Encapsulation can commonly be achieved by:

### 1. Declaring variables as `private`

```java
private String name;
```

### 2. Providing controlled access

Using getter and setter methods:

```java
public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}
```

### Benefits

* Data hiding
* Controlled access
* Better maintainability
* Improved security
* Easier validation

[⬆ Back to Questions](#-questions)

---

# 3. Inheritance

## ❓ Questions

1. [What is Inheritance?](#what-is-inheritance)
2. [What is the Diamond Problem?](#what-is-the-diamond-problem-or-why-does-java-not-support-multiple-inheritance-of-classes)
3. [Can multiple inheritance be achieved using an abstract class?](#can-multiple-inheritance-be-achieved-using-an-abstract-class)

---

## What is Inheritance?

**Inheritance** is a mechanism where one class acquires properties and behavior from another class.

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

Here, `Dog` inherits from `Animal`.

### Types of inheritance supported through classes

* Single inheritance
* Multilevel inheritance
* Hierarchical inheritance

Java does **not** support multiple inheritance of classes.

Multiple inheritance of type can be achieved using interfaces.

[⬆ Back to Questions](#-questions)

---

## What is the Diamond Problem? Or Why does Java not support Multiple Inheritance of Classes?

The **Diamond Problem** occurs when a class inherits the same method through multiple inheritance paths and the compiler cannot determine which implementation should be used.

### Example

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

If both `B` and `C` inherit from `A`, and `D` inherits from both `B` and `C`, Java would have ambiguity about which inherited implementation should be used.

Therefore, Java does not support multiple inheritance of classes.

### What about Interfaces?

Interfaces can contain `default` methods, so ambiguity can still occur.

```java
interface A {

    default void show() {
        System.out.println("A show");
    }
}

interface B {

    default void show() {
        System.out.println("B show");
    }
}

class C implements A, B {

    @Override
    public void show() {
        A.super.show();
    }
}
```

The child class must resolve the conflict.

[⬆ Back to Questions](#-questions)

---

## Can multiple inheritance be achieved using an abstract class?

**No.**

Java does not allow a class to extend multiple classes, regardless of whether those classes are abstract or concrete.

```java
class C extends A, B { // Compilation error
}
```

However, a class can implement multiple interfaces:

```java
class C implements A, B {
}
```

[⬆ Back to Questions](#-questions)

---

# 4. Polymorphism

## ❓ Questions

1. [What is Polymorphism?](#what-is-polymorphism)
2. [What is the difference between Method Overloading and Method Overriding?](#what-is-the-difference-between-method-overloading-and-method-overriding)

---

## What is Polymorphism?

**Polymorphism** means "many forms."

In Java, the same method or reference can behave differently depending on the situation.

There are two major forms:

### Compile-Time Polymorphism

Achieved using **method overloading**.

### Runtime Polymorphism

Achieved using **method overriding**.

### Example

```java
Animal animal = new Dog();

animal.sound();
```

The reference type is `Animal`, but the actual object is `Dog`.

Therefore, the overridden `Dog` implementation can be executed at runtime.

[⬆ Back to Questions](#-questions)

---

# 5. Abstraction

## ❓ Questions

1. [What is Abstraction?](#what-is-abstraction)
2. [What happens if a normal class contains an abstract method?](#what-happens-if-a-normal-class-contains-an-abstract-method)
3. [Can we create objects of an abstract class?](#can-we-create-objects-of-an-abstract-class)
4. [Why can abstract classes have constructors?](#why-can-abstract-classes-have-constructors)

---

## What is Abstraction?

**Abstraction** means exposing essential functionality while hiding implementation details.

Java provides abstraction mainly through:

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

The caller knows that `start()` exists but does not need to know its implementation.

[⬆ Back to Questions](#-questions)

---

## What happens if a normal class contains an abstract method?

A class containing an abstract method must be declared `abstract`.

Otherwise, the compiler generates a compilation error.

### Incorrect

```java
class Vehicle {

    abstract void start();
}
```

### Correct

```java
abstract class Vehicle {

    abstract void start();
}
```

[⬆ Back to Questions](#-questions)

---

## Can we create objects of an abstract class?

**No, we cannot directly create an object of an abstract class.**

```java
abstract class Vehicle {
}
```

This is invalid:

```java
Vehicle v = new Vehicle(); // Compilation error
```

However, we can create a reference of the abstract class type pointing to a concrete subclass object.

```java
Vehicle v = new Car();
```

[⬆ Back to Questions](#-questions)

---

## Why can abstract classes have constructors?

Abstract classes can have constructors because their constructors are executed when a subclass object is created.

They can be used to initialize common state.

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

The `Vehicle` constructor executes before the `Car` constructor.

[⬆ Back to Questions](#-questions)

---

# 6. Method Overloading & Overriding

## ❓ Questions

1. [What is Method Overloading?](#what-is-method-overloading)
2. [What is Method Overriding?](#what-is-method-overriding)
3. [What is the difference between Method Overloading and Method Overriding?](#what-is-the-difference-between-method-overloading-and-method-overriding)

---

## What is Method Overloading?

Method overloading occurs when multiple methods have the **same name but different parameter lists**.

It is an example of:

* Compile-time polymorphism
* Static polymorphism
* Early binding

### Example

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

[⬆ Back to Questions](#-questions)

---

## What is Method Overriding?

Method overriding occurs when a subclass provides a specific implementation of a method inherited from its superclass.

It is an example of:

* Runtime polymorphism
* Dynamic polymorphism
* Late binding

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

[⬆ Back to Questions](#-questions)

---

## What is the difference between Method Overloading and Method Overriding?

| Feature      | Overloading                                   | Overriding              |
| ------------ | --------------------------------------------- | ----------------------- |
| Polymorphism | Compile-time                                  | Runtime                 |
| Parameters   | Must be different                             | Must match              |
| Return type  | Can differ, but cannot be the only difference | Same or covariant       |
| Binding      | Early binding                                 | Late binding            |
| Inheritance  | Not required                                  | Required                |
| Annotation   | Not required                                  | `@Override` recommended |

[⬆ Back to Questions](#-questions)

---

# 7. Abstract Class & Interface

## ❓ Questions

1. [What is the difference between Abstract Class and Interface?](#what-is-the-difference-between-abstract-class-and-interface)
2. [Can an interface extend another interface?](#can-an-interface-extend-another-interface)
3. [Can a class implement multiple interfaces?](#can-a-class-implement-multiple-interfaces)
4. [Can we override default methods in Java 8?](#can-we-override-default-methods-in-java-8)

---

## What is the difference between Abstract Class and Interface?

| Feature              | Abstract Class                      | Interface                                   |
| -------------------- | ----------------------------------- | ------------------------------------------- |
| Purpose              | Shared state/behavior + abstraction | Contract / capability                       |
| Methods              | Abstract + concrete methods         | Abstract, default, static, private methods  |
| Variables            | Instance variables allowed          | Fields are implicitly `public static final` |
| Constructors         | Yes                                 | No                                          |
| Multiple inheritance | Cannot extend multiple classes      | A class can implement multiple interfaces   |
| Keyword              | `extends`                           | `implements`                                |

### When should you use an Abstract Class?

Use an abstract class when related classes need to share:

* Common state
* Common implementation
* Common behavior

### When should you use an Interface?

Use an interface when you want to define a contract or capability that can be implemented by unrelated classes.

[⬆ Back to Questions](#-questions)

---

## Can an interface extend another interface?

**Yes.**

An interface can extend one or more interfaces.

```java
interface Animal {
    void eat();
}

interface Dog extends Animal {
    void bark();
}
```

An interface cannot extend a class.

[⬆ Back to Questions](#-questions)

---

## Can a class implement multiple interfaces?

**Yes.**

```java
interface A {
    void methodA();
}

interface B {
    void methodB();
}

class C implements A, B {

    public void methodA() {
    }

    public void methodB() {
    }
}
```

This is one way Java supports multiple inheritance of type.

[⬆ Back to Questions](#-questions)

---

## Can we override default methods in Java 8?

**Yes.**

A class implementing an interface can override its default method.

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

[⬆ Back to Questions](#-questions)

---

# 8. IS-A & HAS-A Relationship

## ❓ Questions

1. [What is an IS-A relationship?](#what-is-an-is-a-relationship)
2. [What is a HAS-A relationship?](#what-is-a-has-a-relationship)
3. [What is the difference between IS-A and HAS-A?](#what-is-the-difference-between-is-a-and-has-a)

---

## What is an IS-A relationship?

An **IS-A** relationship represents inheritance.

```java
class Animal {
}

class Dog extends Animal {
}
```

A `Dog` **IS-A** `Animal`.

### Used when

* Inheritance is appropriate
* Polymorphism is required
* Parent behavior should be reused

[⬆ Back to Questions](#-questions)

---

## What is a HAS-A relationship?

A **HAS-A** relationship represents composition or aggregation through object references.

```java
class Engine {
}

class Car {

    private Engine engine;
}
```

A `Car` **HAS-A** `Engine`.

### Used when

* One object depends on another object
* Composition is preferred over unnecessary inheritance
* Behavior needs to be delegated to another object

[⬆ Back to Questions](#-questions)

---

## What is the difference between IS-A and HAS-A?

| IS-A                                 | HAS-A                                   |
| ------------------------------------ | --------------------------------------- |
| Based on inheritance                 | Based on composition/aggregation        |
| Uses `extends` / `implements`        | Uses object references                  |
| Represents parent-child relationship | Represents object ownership/association |
| Example: Dog IS-A Animal             | Example: Car HAS-A Engine               |

[⬆ Back to Questions](#-questions)

---

# 9. `this` & `super` Keywords

## ❓ Questions

1. [What is the `this` keyword used for?](#what-is-the-this-keyword-used-for)
2. [What is the `super` keyword used for?](#what-is-the-super-keyword-used-for)

---

## What is the `this` keyword used for?

`this` refers to the **current object**.

It is commonly used to:

* Access current object's fields
* Resolve variable shadowing
* Call another constructor using `this()`
* Pass the current object as an argument
* Return the current object

### Example

```java
class Employee {

    private String name;

    Employee(String name) {
        this.name = name;
    }
}
```

[⬆ Back to Questions](#-questions)

---

## What is the `super` keyword used for?

`super` refers to the immediate parent class.

It can be used to:

* Access superclass fields
* Call superclass methods
* Call superclass constructor

### Example

```java
class Animal {

    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    void sound() {

        super.sound();

        System.out.println("Dog sound");
    }
}
```

### Important points

* `super()` calls the parent constructor.
* `super()` must be the first statement in a constructor.
* `super` cannot be used directly in a static context.

[⬆ Back to Questions](#-questions)

---

# 10. Constructors

## ❓ Questions

1. [What is a Constructor?](#what-is-a-constructor)
2. [What are the types of Constructors?](#what-are-the-types-of-constructors)
3. [Can a constructor be private?](#can-a-constructor-be-private)
4. [Can we overload constructors?](#can-we-overload-constructors)
5. [Can we overload methods?](#can-we-overload-methods)

---

## What is a Constructor?

A constructor is a special member used to initialize an object.

Characteristics:

* Name must match the class name.
* It does not have a return type.
* It is invoked when an object is created.
* Constructors can be overloaded.

### Example

```java
class Employee {

    Employee() {
        System.out.println("Constructor called");
    }
}
```

[⬆ Back to Questions](#-questions)

---

## What are the types of Constructors?

Commonly discussed types are:

### 1. No-Argument Constructor

```java
Employee() {
}
```

### 2. Parameterized Constructor

```java
Employee(int id, String name) {
}
```

### Important Interview Point

Java provides a **default constructor automatically only when you do not declare any constructor**.

[⬆ Back to Questions](#-questions)

---

## Can a constructor be private?

**Yes.**

A private constructor prevents direct object creation from outside the class.

It is commonly used in:

* Singleton implementations
* Utility classes
* Factory-based object creation

### Example

```java
class Singleton {

    private Singleton() {
    }
}
```

[⬆ Back to Questions](#-questions)

---

## Can we overload constructors?

**Yes.**

Constructors can be overloaded by changing their parameter list.

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

[⬆ Back to Questions](#-questions)

---

## Can we overload methods?

**Yes.**

Methods can be overloaded by changing their parameter list.

```java
void print() {
}

void print(int value) {
}

void print(String value) {
}
```

[⬆ Back to Questions](#-questions)

---

# 11. Static Keyword

## ❓ Questions

1. [What is `static` in Java?](#what-is-static-in-java)
2. [How does `static` work at different levels?](#how-does-static-work-at-different-levels)
3. [What are the side effects of overusing static in large codebases?](#what-are-the-side-effects-of-overusing-static-in-large-codebases)
4. [Can we have multiple static blocks in a class?](#can-we-have-multiple-static-blocks-in-a-class)
5. [What is the execution order of static blocks and main()?](#what-is-the-execution-order-of-static-blocks-and-main)

---

## What is `static` in Java?

`static` means that a member belongs to the **class rather than to individual objects**.

Static members can be accessed without creating an object, depending on their access level.

[⬆ Back to Questions](#-questions)

---

## How does `static` work at different levels?

### Static Variable

A static variable belongs to the class and is shared among instances.

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

It can be called as:

```java
Calculator.add(10, 20);
```

### Static Block

A static block is executed when the class is initialized.

```java
class Demo {

    static {
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }
}
```

### Static Nested Class

A class nested inside another class can be declared `static`.

```java
class Outer {

    static class Inner {
    }
}
```

[⬆ Back to Questions](#-questions)

---

## What are the side effects of overusing static in large codebases?

Overusing static members can lead to:

### 1. Tight Coupling

Code becomes strongly dependent on global/static state.

### 2. Difficult Testing

Static dependencies can make unit testing and mocking harder.

### 3. Shared Mutable State

Static mutable variables are shared across objects and threads.

### 4. Reduced Flexibility

Static methods cannot participate in runtime method overriding.

Therefore, static should be used where class-level behavior is actually appropriate.

[⬆ Back to Questions](#-questions)

---

## Can we have multiple static blocks in a class?

**Yes.**

A class can contain multiple static blocks.

```java
class Demo {

    static {
        System.out.println("Block 1");
    }

    static {
        System.out.println("Block 2");
    }

    public static void main(String[] args) {
        System.out.println("Main");
    }
}
```

They execute in the order in which they appear in the class.

[⬆ Back to Questions](#-questions)

---

## What is the execution order of static blocks and main()?

For a normally launched Java class:

```text
Class Initialization
        ↓
Static Blocks
        ↓
main()
```

Example:

```java
class Demo {

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

[⬆ Back to Questions](#-questions)

---

# 12. Final, Private & Static Methods

## ❓ Questions

1. [Can final methods be overridden?](#can-final-methods-be-overridden)
2. [Can private methods be overridden?](#can-private-methods-be-overridden)
3. [Can static methods be overridden?](#can-static-methods-be-overridden)
4. [What is the difference between final, private and static methods?](#what-is-the-difference-between-final-private-and-static-methods)

---

## Can final methods be overridden?

**No.**

A `final` method is inherited but cannot be overridden by a subclass.

```java
class Parent {

    final void show() {
    }
}

class Child extends Parent {

    // Compilation error
    // void show() {}
}
```

[⬆ Back to Questions](#-questions)

---

## Can private methods be overridden?

**No.**

Private methods are not inherited by subclasses, so they cannot be overridden.

A child class can define a method with the same signature, but it is a separate method.

[⬆ Back to Questions](#-questions)

---

## Can static methods be overridden?

**No.**

Static methods belong to the class rather than the object.

If a subclass declares a static method with the same signature, it is called **method hiding**, not overriding.

```java
class Parent {

    static void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {

    static void show() {
        System.out.println("Child");
    }
}
```

[⬆ Back to Questions](#-questions)

---

## What is the difference between final, private and static methods?

| Feature       | `final`                      | `private`           | `static`                 |
| ------------- | ---------------------------- | ------------------- | ------------------------ |
| Inherited     | Yes                          | No                  | Yes                      |
| Can override? | No                           | No                  | No                       |
| Reason        | Prevent overriding           | Hide implementation | Class-level behavior     |
| Binding       | Runtime dispatch unavailable | Not inherited       | Compile-time/class-based |

[⬆ Back to Questions](#-questions)

---

# 13. Main Method

## ❓ Questions

1. [Can we override the main method?](#can-we-override-the-main-method)
2. [Can we overload the main method?](#can-we-overload-the-main-method)
3. [Can JVM execute an overloaded main method?](#can-jvm-execute-an-overloaded-main-method)
4. [What happens when main() is not static?](#what-happens-when-main-is-not-static)

---

## Can we override the main method?

**No.**

The traditional Java entry point:

```java
public static void main(String[] args)
```

is static.

Static methods are not overridden.

They can be hidden.

[⬆ Back to Questions](#-questions)

---

## Can we overload the main method?

**Yes.**

We can create another `main()` method with a different parameter list.

```java
public static void main(String[] args) {
    System.out.println("Original main");
}

public static void main(int value) {
    System.out.println("Overloaded main");
}
```

[⬆ Back to Questions](#-questions)

---

## Can JVM execute an overloaded main method?

The Java launcher looks for the recognized entry-point signature:

```java
public static void main(String[] args)
```

An overloaded method such as:

```java
public static void main(int value)
```

is not selected automatically as the application entry point.

[⬆ Back to Questions](#-questions)

---

## What happens when main() is not static?

The Java launcher cannot use a non-static method as the traditional application entry point.

For example:

```java
public void main(String[] args) {
}
```

will not work as the standard entry point.

The launcher reports that a proper static `main` method is required.

[⬆ Back to Questions](#-questions)

---

# 14. Marker Interfaces

## ❓ Questions

1. [What is a Marker Interface?](#what-is-a-marker-interface)
2. [How do you create a custom Marker Interface?](#how-do-you-create-a-custom-marker-interface)
3. [What are real-time examples of Marker Interfaces?](#what-are-real-time-examples-of-marker-interfaces)

---

## What is a Marker Interface?

A **marker interface** is an interface that does not declare methods or fields.

It is used to mark a class with a particular characteristic.

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

The class can then be identified using:

```java
if (employee instanceof MyMarker) {
    // Special handling
}
```

[⬆ Back to Questions](#-questions)

---

## How do you create a custom Marker Interface?

### Step 1: Create the interface

```java
interface MyMarker {
}
```

### Step 2: Implement it

```java
class Employee implements MyMarker {
}
```

### Step 3: Check it

```java
if (employee instanceof MyMarker) {
    System.out.println("Marked object");
}
```

[⬆ Back to Questions](#-questions)

---

## What are real-time examples of Marker Interfaces?

Examples include:

* `Serializable`
* `Cloneable`

### Example

```java
class Employee implements Serializable {
}
```

`Serializable` indicates that objects of the class can participate in Java's serialization mechanism.

[⬆ Back to Questions](#-questions)

---

# 15. Annotations

## ❓ Questions

1. [What are Annotations in Java?](#what-are-annotations-in-java)
2. [How do you create a custom Annotation?](#how-do-you-create-a-custom-annotation)
3. [What are @Retention and @Target?](#what-are-retention-and-target)
4. [How can an Annotation be read at runtime?](#how-can-an-annotation-be-read-at-runtime)

---

## What are Annotations in Java?

Annotations are metadata that provide additional information about program elements.

They can be used by:

* Compiler
* Tools
* Frameworks
* Runtime reflection

Examples:

```java
@Override
@Deprecated
@SuppressWarnings
```

Frameworks such as Spring make extensive use of annotations.

[⬆ Back to Questions](#-questions)

---

## How do you create a custom Annotation?

### Step 1: Define the annotation

```java
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyAnnotation {

    String value();
}
```

### Step 2: Use the annotation

```java
class Employee {

    @MyAnnotation("Employee Method")
    public void display() {
        System.out.println("Employee");
    }
}
```

### Step 3: Read it using Reflection

```java
Method method =
        Employee.class.getMethod("display");

MyAnnotation annotation =
        method.getAnnotation(MyAnnotation.class);

System.out.println(annotation.value());
```

[⬆ Back to Questions](#-questions)

---

## What are @Retention and @Target?

| Feature      | Meaning                                             |
| ------------ | --------------------------------------------------- |
| `@interface` | Used to declare a custom annotation                 |
| `@Retention` | Defines how long annotation information is retained |
| `@Target`    | Defines where the annotation can be used            |
| Reflection   | Allows runtime inspection of annotations            |

### Retention Policies

```java
RetentionPolicy.SOURCE
RetentionPolicy.CLASS
RetentionPolicy.RUNTIME
```

### Target Example

```java
@Target(ElementType.METHOD)
```

This means the annotation can be applied to methods.

[⬆ Back to Questions](#-questions)

---

## How can an Annotation be read at runtime?

If an annotation uses:

```java
@Retention(RetentionPolicy.RUNTIME)
```

it can be accessed using Reflection.

```java
MyAnnotation annotation =
        method.getAnnotation(MyAnnotation.class);
```

This is commonly used by frameworks to inspect metadata.

[⬆ Back to Questions](#-questions)

---

# 16. Enums

## ❓ Questions

1. [What are Enums in Java?](#what-are-enums-in-java)
2. [Can Enums have fields, methods and constructors?](#can-enums-have-fields-methods-and-constructors)
3. [Can an Enum be extended?](#can-an-enum-be-extended)

---

## What are Enums in Java?

An `enum` is a special Java type used to represent a fixed set of constants.

### Example

```java
enum Status {

    ACTIVE,
    INACTIVE,
    PENDING
}
```

Usage:

```java
Status status = Status.ACTIVE;
```

Each enum constant is implicitly:

```text
public
static
final
```

[⬆ Back to Questions](#-questions)

---

## Can Enums have fields, methods and constructors?

**Yes.**

Enums can contain:

* Fields
* Constructors
* Methods

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

[⬆ Back to Questions](#-questions)

---

## Can an Enum be extended?

**No.**

Enums implicitly extend:

```java
java.lang.Enum
```

Java does not support extending another class from an enum.

However, an enum can implement interfaces.

```java
interface Printable {
    void print();
}

enum Status implements Printable {

    ACTIVE;

    @Override
    public void print() {
        System.out.println("Active");
    }
}
```

[⬆ Back to Questions](#-questions)

---

# 17. SOLID Principles

## ❓ Questions

1. [What are SOLID Principles?](#what-are-solid-principles)
2. [What is Single Responsibility Principle?](#1-single-responsibility-principle-srp)
3. [What is Open/Closed Principle?](#2-openclosed-principle-ocp)
4. [What is Liskov Substitution Principle?](#3-liskov-substitution-principle-lsp)
5. [What is Interface Segregation Principle?](#4-interface-segregation-principle-isp)
6. [What is Dependency Inversion Principle?](#5-dependency-inversion-principle-dip)

---

## What are SOLID Principles?

**SOLID** is a set of five design principles that help developers create software that is:

* Maintainable
* Flexible
* Testable
* Scalable
* Easier to modify

SOLID stands for:

| Letter | Principle                       |
| ------ | ------------------------------- |
| S      | Single Responsibility Principle |
| O      | Open/Closed Principle           |
| L      | Liskov Substitution Principle   |
| I      | Interface Segregation Principle |
| D      | Dependency Inversion Principle  |

[⬆ Back to Questions](#-questions)

---

## 1. Single Responsibility Principle (SRP)

> A class should have one reason to change.

In simple terms, a class should focus on **one responsibility**.

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

The class has multiple responsibilities.

### Better Design

```java
class SalaryService {
}

class ReportService {
}

class EmailService {
}
```

Each class has a focused responsibility.

[⬆ Back to Questions](#-questions)

---

## 2. Open/Closed Principle (OCP)

> Software entities should be open for extension but closed for modification.

This means we should be able to add new behavior without repeatedly modifying existing, stable code.

A common approach is to use abstractions and polymorphism.

### Example

```java
interface Payment {

    void pay();
}

class CreditCardPayment implements Payment {

    public void pay() {
        System.out.println("Credit Card Payment");
    }
}

class UPIPayment implements Payment {

    public void pay() {
        System.out.println("UPI Payment");
    }
}
```

A new payment type can be added by implementing the interface.

[⬆ Back to Questions](#-questions)

---

## 3. Liskov Substitution Principle (LSP)

> Subtypes should be replaceable for their base types without breaking expected behavior.

If `B` is a subtype of `A`, code using `A` should generally be able to work with `B` without unexpected behavior.

### Example

```java
Animal animal = new Dog();
animal.sound();
```

`Dog` should respect the behavioral contract expected from `Animal`.

[⬆ Back to Questions](#-questions)

---

## 4. Interface Segregation Principle (ISP)

> A class should not be forced to depend on methods it does not use.

Instead of creating one large interface, create smaller, focused interfaces.

### Example

```java
interface Printer {
    void print();
}

interface Scanner {
    void scan();
}
```

A class only implements the capabilities it actually needs.

[⬆ Back to Questions](#-questions)

---

## 5. Dependency Inversion Principle (DIP)

> High-level modules should not depend directly on low-level modules. Both should depend on abstractions.

### Example

Instead of:

```java
class OrderService {

    private MySQLDatabase database =
            new MySQLDatabase();
}
```

Prefer:

```java
interface Database {
    void save();
}

class MySQLDatabase implements Database {

    public void save() {
    }
}

class OrderService {

    private Database database;

    OrderService(Database database) {
        this.database = database;
    }
}
```

Now `OrderService` depends on the abstraction rather than a specific database implementation.

This also makes the code easier to test and change.

[⬆ Back to Questions](#-questions)

---

# 18. Quick Revision

## 🧠 OOPs Concepts at a Glance

| Concept              | Key Point                                                     |
| -------------------- | ------------------------------------------------------------- |
| **Class**            | Blueprint for objects                                         |
| **Object**           | Instance of a class                                           |
| **Encapsulation**    | Bundling data and controlling access                          |
| **Inheritance**      | Acquiring behavior from another class                         |
| **Polymorphism**     | One interface/reference, multiple forms                       |
| **Abstraction**      | Hiding implementation details                                 |
| **Overloading**      | Same method name, different parameters                        |
| **Overriding**       | Subclass provides its own implementation                      |
| **IS-A**             | Inheritance relationship                                      |
| **HAS-A**            | Composition/association relationship                          |
| **`this`**           | Current object                                                |
| **`super`**          | Parent class                                                  |
| **`static`**         | Class-level member                                            |
| **`final`**          | Prevents modification/extension/overriding depending on usage |
| **Marker Interface** | Interface used as a marker                                    |
| **Annotation**       | Metadata                                                      |
| **Enum**             | Fixed set of constants                                        |
| **SOLID**            | Object-oriented design principles                             |

---

# 🎯 Interview Preparation Tips

When answering OOPs questions in an interview, try to structure your answer as:

```text
1. Definition
2. Key points
3. Real-world example
4. Java example
5. Interview-specific point
```

For example:

> **What is Polymorphism?**

Start with the definition:

> Polymorphism means one interface or reference can represent multiple forms.

Then explain:

* Compile-time polymorphism → Overloading
* Runtime polymorphism → Overriding

Then provide a short Java example.

This approach makes the answer **clear, structured, and suitable for an intermediate-level Java developer interview**.

---

## ⭐ More Java Interview Questions

This OOPs section can be extended with:

* Java Basics
* Strings & Arrays
* Exception Handling
* Collections
* Java 8 Features
* Multithreading
* JVM & Memory Management
* Generics
* Serialization
* Java Design Patterns
* Spring Core
* Spring Boot
* Spring Data JPA
* Spring Security
* REST API
* Microservices
* Spring Cloud
* Kafka

---

### 🔙 Back to Top

[⬆ Go to Table of Contents](#-table-of-contents)
