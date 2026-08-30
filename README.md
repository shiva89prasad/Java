# 🧩 Core Java – Basics

## 1. What is Java?

Java is a **high-level, class-based, object-oriented, general-purpose programming language** used to develop:

* Web applications
* Mobile applications
* Desktop applications
* Enterprise applications
* Distributed applications

### History

* Java was originally developed at **Sun Microsystems**.
* It was created by **James Gosling and his team**.
* Java was officially released in **1995**.
* The original project was called **Oak** before being renamed Java.

---

## 2. Why is Java Platform Independent?

Java is platform independent because Java source code is compiled into **bytecode**, rather than directly into machine-specific code.

### How it works

```text
Java Source Code
       ↓
   Java Compiler
       ↓
   Bytecode (.class)
       ↓
       JVM
       ↓
 Operating System
```

### Explanation

1. The Java compiler (`javac`) converts `.java` source code into **bytecode**.
2. Bytecode is stored in `.class` files.
3. The **JVM (Java Virtual Machine)** executes the bytecode.
4. JVM implementations are available for different operating systems.

Therefore, the same Java bytecode can run on different operating systems as long as a compatible JVM is available.

This is known as:

> **WORA – Write Once, Run Anywhere**

---

# 3. Difference Between JDK, JRE, and JVM

| Component | Full Form                | Purpose                                                    |
| --------- | ------------------------ | ---------------------------------------------------------- |
| **JDK**   | Java Development Kit     | Used to develop Java applications                          |
| **JRE**   | Java Runtime Environment | Provides the environment required to run Java applications |
| **JVM**   | Java Virtual Machine     | Executes Java bytecode                                     |

### JDK

**JDK** stands for **Java Development Kit**.

It is used for **developing Java applications**.

The JDK contains:

* JRE/runtime components
* JVM
* Java compiler (`javac`)
* Debugging tools
* Other development tools

Example:

```bash
javac Test.java
```

The `javac` compiler converts Java source code into bytecode.

---

### JRE

**JRE** stands for **Java Runtime Environment**.

It provides the components required to **run Java applications**, including:

* JVM
* Java class libraries
* Supporting runtime files

> **Note:** Since modern Java distributions are generally designed around the JDK, a standalone JRE is no longer distributed by Oracle for newer Java releases in the same way it was historically.

---

### JVM

**JVM** stands for **Java Virtual Machine**.

It is responsible for executing Java bytecode.

The JVM provides platform independence because different operating systems have different JVM implementations.

```text
Java Code
   ↓
Compiler
   ↓
Bytecode
   ↓
JVM
   ↓
OS-specific execution
```

---

# 4. What are Access Modifiers in Java?

Access modifiers control the **visibility and accessibility** of classes, methods, constructors, and fields.

Java provides four access levels:

* `private`
* default (package-private)
* `protected`
* `public`

### Access Modifier Table

| Modifier    | Same Class | Same Package | Subclass in Different Package | Anywhere |
| ----------- | ---------: | -----------: | ----------------------------: | -------: |
| `private`   |          ✅ |            ❌ |                             ❌ |        ❌ |
| default     |          ✅ |            ✅ |                             ❌ |        ❌ |
| `protected` |          ✅ |            ✅ |                            ✅* |        ❌ |
| `public`    |          ✅ |            ✅ |                             ✅ |        ✅ |

> **Note:** `protected` members are accessible from a subclass in another package through inheritance, subject to Java's access rules. They are not generally accessible through an arbitrary parent-class object reference from that different package.

### Example

```java
public class Student {

    private int id;
    String name;              // default
    protected String course;
    public String college;
}
```

---

# 5. Difference Between `==` and `.equals()`

The behavior depends on whether we are comparing **primitive values** or **objects**.

### `==`

* For primitive types, `==` compares their **values**.
* For objects, `==` compares whether two references point to the **same object**.

### `.equals()`

* `.equals()` is a method defined in `Object`.
* It is generally used to compare the **logical/content equality** of objects.
* The actual behavior depends on how the class overrides `equals()`.

---

## Example 1: String Literals

```java
String a = "Hello";
String b = "Hello";

System.out.println(a == b);       // true
System.out.println(a.equals(b));  // true
```

Both references point to the same string literal in the **String Pool**.

---

## Example 2: Using `new`

```java
String c = new String("Hello");
String d = new String("Hello");

System.out.println(c == d);       // false
System.out.println(c.equals(d));  // true
```

Here, two different `String` objects are created.

Therefore:

```text
c == d          → false
c.equals(d)     → true
```

---

## Example 3: Integer Caching

```java
Integer a1 = 100;
Integer b1 = 100;

System.out.println(a1 == b1);       // true
System.out.println(a1.equals(b1));  // true
```

For typical Java implementations, `Integer` values from **-128 to 127** are cached by default.

Therefore, autoboxing can reuse the same cached object.

### Outside the commonly cached range

```java
Integer c1 = 200;
Integer d1 = 200;

System.out.println(c1 == d1);       // false
System.out.println(c1.equals(d1));  // true
```

`c1` and `d1` generally refer to different `Integer` objects.

> **Interview Tip:** Never use `==` to compare the values of wrapper objects such as `Integer`. Use `.equals()` instead.

---

## Example 4: Primitive Data Types

```java
int x = 24;
int y = 24;

System.out.println(x == y);  // true
```

For primitives, `==` compares the actual values.

---

# 6. Difference Between `final`, `finally`, and `finalize()`

These three terms are completely different.

| Keyword/Method | Purpose                                                                 |
| -------------- | ----------------------------------------------------------------------- |
| `final`        | Prevents modification, overriding, or inheritance                       |
| `finally`      | Block used for cleanup after `try`/`catch`                              |
| `finalize()`   | Old object-finalization mechanism; deprecated and no longer recommended |

---

## `final`

The `final` keyword can be used with:

* Variables
* Methods
* Classes

### Final Variable

A final variable cannot be reassigned after initialization.

```java
final int x = 10;

// x = 20;  // Compilation error
```

### Final Method

A final method cannot be overridden by a subclass.

```java
class Animal {

    final void show() {
        System.out.println("Animal");
    }
}
```

```java
class Dog extends Animal {

    // Cannot override show()
}
```

### Final Class

A final class cannot be extended.

```java
final class Animal {
}
```

```java
// class Dog extends Animal { }  // Compilation error
```

---

## `finally`

`finally` is a block associated with `try`/`catch` that is normally executed after the `try`/`catch` processing.

It is commonly used for cleanup operations such as:

* Closing files
* Closing database resources
* Releasing resources

### Example

```java
try {
    System.out.println("Try block");
} catch (Exception e) {
    System.out.println("Catch block");
} finally {
    System.out.println("Finally block");
}
```

Output:

```text
Try block
Finally block
```

### Can `finally` be prevented from executing?

Yes, in certain situations.

For example:

```java
try {
    System.out.println("Hello");
    System.exit(0);
} finally {
    System.out.println("Finally");
}
```

`System.exit(0)` terminates the JVM, so the `finally` block does not execute.

> **Interview Tip:** Avoid saying "`finally` always executes." It normally executes, but there are exceptional situations such as JVM termination.

---

## `finalize()`

`finalize()` was an old method associated with object finalization before garbage collection.

It was intended to provide an opportunity for cleanup before an object was reclaimed.

However:

* It is **deprecated since Java 9**.
* It is unreliable for resource management.
* It should not be used for normal cleanup.
* Modern Java recommends alternatives such as **try-with-resources** and explicit resource management.

Example of the old mechanism:

```java
@Override
protected void finalize() throws Throwable {
    System.out.println("Finalize called");
}
```

> **Interview Tip:** Do not say "`finalize()` is used to clean memory." Garbage collection is responsible for reclaiming memory. `finalize()` was an unreliable notification mechanism associated with object finalization.

---

# 7. Can a Java Application Run Without Installing a JRE?

### Short Answer

A Java application needs a **Java runtime environment**, including a JVM and required runtime libraries, to execute.

Historically, this was provided by installing a JRE.

With modern Java distributions, applications are commonly run using a **JDK** or a custom runtime image created using tools such as `jlink`.

Therefore, the better interview answer is:

> A Java application cannot execute without a compatible Java runtime. Historically this runtime was provided by the JRE; with modern Java, a JDK or custom runtime image can provide the required runtime components.

---

# 8. Is Java 100% Object-Oriented?

**No.**

Java is not considered a purely object-oriented language because it supports **primitive data types** such as:

```java
byte
short
int
long
float
double
char
boolean
```

Primitive values are not objects.

For example:

```java
int age = 25;
```

Here, `age` is a primitive variable, not an object.

Java also supports static members, which belong to the class rather than to individual objects.

> **Interview Answer:** Java is primarily an object-oriented programming language, but it is not a pure object-oriented language because it supports primitive data types and other language features that do not require objects.

---

# 9. What Exactly is `System.out.println()` in Java?

Consider:

```java
System.out.println("Hello");
```

It consists of three parts:

### `System`

`System` is a class from the `java.lang` package.

```java
java.lang.System
```

It provides various system-related facilities.

---

### `out`

`out` is a **public static final field** of the `System` class.

Its type is:

```java
PrintStream
```

So:

```java
System.out
```

refers to a `PrintStream` object.

---

### `println()`

`println()` is a method of the `PrintStream` class.

It prints the supplied value and then moves the cursor to the next line.

Therefore:

```java
System.out.println("Hello");
```

can conceptually be understood as:

```text
System
  ↓
out
  ↓
PrintStream object
  ↓
println()
```

---

# 10. How are Primitive Data Types Stored in Memory?

Primitive variables store **primitive values directly**.

The exact physical memory layout is an implementation/JVM detail, so it is better not to say that every primitive variable is always stored in a particular memory area.

For interview purposes, we commonly discuss them based on where the variable is declared.

---

## Local Primitive Variable

A local variable is declared inside a method.

```java
public static void main(String[] args) {

    int a = 10;
}
```

Conceptually:

```text
Stack Frame
------------
a = 10
```

The local variable `a` belongs to the method's stack frame.

---

## Instance Variable

An instance variable belongs to an object.

```java
class Student {

    int age = 20;
}
```

When an object is created:

```java
Student student = new Student();
```

the object and its instance fields are associated with heap memory.

Conceptually:

```text
Heap
----------------
Student Object
----------------
age = 20
```

The local reference variable `student` itself is part of the current stack frame, while the referenced object resides on the heap.

---

## Static Variable

A static variable belongs to the class rather than to individual objects.

```java
class Test {

    static int count = 50;
}
```

Conceptually:

```text
Class-level data
----------------
count = 50
```

### Important JVM Note

Older Java interview explanations often say:

> "Static variables are stored in the Method Area."

This is a simplified model.

In modern JVM implementations, the exact physical storage and implementation details are JVM-specific. The **Method Area is a JVM specification concept**, while **Metaspace** is an implementation detail used by HotSpot for class metadata.

Therefore, a safer interview answer is:

> Instance fields are associated with objects on the heap, local variables belong to stack frames, and static fields belong to the class. The exact physical memory representation is JVM implementation dependent.

---

# 🎯 Quick Interview Revision

| Topic                | Key Point                                                       |
| -------------------- | --------------------------------------------------------------- |
| Java                 | High-level, class-based, object-oriented language               |
| Platform Independent | Bytecode runs on JVM implementations for different platforms    |
| JDK                  | Used to develop Java applications                               |
| JRE                  | Provides runtime environment                                    |
| JVM                  | Executes bytecode                                               |
| `private`            | Accessible only within the same class                           |
| default              | Accessible within the same package                              |
| `protected`          | Same package + inherited access                                 |
| `public`             | Accessible wherever the class/member is accessible              |
| `==`                 | Primitive value comparison / object reference comparison        |
| `.equals()`          | Logical equality of objects, depending on implementation        |
| `final`              | Prevents reassignment/overriding/inheritance depending on usage |
| `finally`            | Cleanup block associated with exception handling                |
| `finalize()`         | Deprecated legacy finalization mechanism                        |
| Pure OOP?            | No, because Java has primitive types                            |
| `System.out`         | `PrintStream` object referenced by a static field               |
| Local variable       | Belongs to a stack frame                                        |
| Instance variable    | Associated with an object                                       |
| Static variable      | Belongs to the class                                            |
