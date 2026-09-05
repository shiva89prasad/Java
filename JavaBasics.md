# 🧩 Core Java – Basics

A structured collection of **Core Java Basics interview questions and answers**, organized topic-wise for easy interview preparation.

---

## 📚 Topics

1. [Java](#1-java)
2. [Platform Independence](#2-platform-independence)
3. [JDK, JRE & JVM](#3-jdk-jre--jvm)
4. [Access Modifiers](#4-access-modifiers)
5. [`==` vs `.equals()`](#5--vs-equals)
6. [`final` vs `finally` vs `finalize()`](#6-final-vs-finally-vs-finalize)
7. [Java Runtime Environment](#7-java-runtime-environment)
8. [Object-Oriented Nature of Java](#8-object-oriented-nature-of-java)
9. [`System.out.println()`](#9-systemoutprintln)
10. [Primitive Data Types & Memory](#10-primitive-data-types--memory)

---

# 1. Java

## ❓ Questions

1. [What is Java?](#what-is-java)
2. [What are the main features of Java?](#what-are-the-main-features-of-java)

---

## 📝 Answers

### What is Java?

Java is a **high-level, class-based, object-oriented, general-purpose programming language**.

Java is widely used for developing:

* Web applications
* Mobile applications
* Desktop applications
* Enterprise applications
* Distributed applications
* Backend applications
* Cloud-based applications

### History

* Java was originally developed at **Sun Microsystems**.
* It was created by **James Gosling and his team**.
* Java was officially released in **1995**.
* The original project was called **Oak** before being renamed Java.

### Interview Answer

> Java is a high-level, class-based, object-oriented, general-purpose programming language designed to be platform independent through the use of bytecode and the JVM.

[⬆ Back to Java Questions](#-questions)

---

### What are the main features of Java?

Some important features of Java are:

* Object-oriented
* Platform independent
* Robust
* Secure
* Portable
* Multithreaded
* Distributed
* High performance through JIT compilation
* Automatic garbage collection
* Architecture neutral

[⬆ Back to Java Questions](#-questions)

---

# 2. Platform Independence

## ❓ Questions

1. [Why is Java Platform Independent?](#why-is-java-platform-independent)

---

## 📝 Answers

### Why is Java Platform Independent?

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

This concept is commonly expressed as:

> **WORA – Write Once, Run Anywhere**

### Interview Answer

> Java is platform independent because Java source code is compiled into platform-neutral bytecode, and that bytecode is executed by a JVM specific to the underlying operating system.

[⬆ Back to Platform Independence Questions](#-questions)

---

# 3. JDK, JRE & JVM

## ❓ Questions

1. [What is JDK?](#what-is-jdk)
2. [What is JRE?](#what-is-jre)
3. [What is JVM?](#what-is-jvm)
4. [What is the difference between JDK, JRE, and JVM?](#what-is-the-difference-between-jdk-jre-and-jvm)

---

## 📝 Answers

### What is JDK?

**JDK** stands for **Java Development Kit**.

It is used for **developing Java applications**.

The JDK provides development tools and runtime components required for Java development.

It includes tools such as:

* Java compiler (`javac`)
* Java launcher (`java`)
* Debugging and monitoring tools
* Other development utilities
* Runtime components required to run Java applications

Example:

```bash
javac Test.java
```

The `javac` compiler converts Java source code into bytecode.

[⬆ Back to JDK, JRE & JVM Questions](#-questions)

---

### What is JRE?

**JRE** stands for **Java Runtime Environment**.

Historically, it provided the components required to **run Java applications**, including:

* JVM
* Java class libraries
* Supporting runtime files

> **Important:** Modern Java distributions are generally centered around the JDK, and Oracle no longer distributes a standalone JRE in the same way it historically did for older releases.

### Interview Answer

> JRE historically provided the runtime environment required to execute Java applications, including the JVM and Java libraries. With modern Java releases, applications are commonly run using a JDK or a custom runtime image.

[⬆ Back to JDK, JRE & JVM Questions](#-questions)

---

### What is JVM?

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

The JVM is responsible for activities such as:

* Loading classes
* Verifying bytecode
* Executing bytecode
* Memory management
* Garbage collection
* Runtime optimization

[⬆ Back to JDK, JRE & JVM Questions](#-questions)

---

### What is the difference between JDK, JRE, and JVM?

| Component | Full Form                | Purpose                                                        |
| --------- | ------------------------ | -------------------------------------------------------------- |
| **JDK**   | Java Development Kit     | Used to develop Java applications                              |
| **JRE**   | Java Runtime Environment | Historically provided the environment to run Java applications |
| **JVM**   | Java Virtual Machine     | Executes Java bytecode                                         |

### Relationship

Conceptually, for traditional Java distributions:

```text
JDK
├── Development Tools
│   └── javac
│
└── Runtime Components
    ├── JVM
    └── Java Libraries
```

### Easy Way to Remember

```text
JDK → Develop
JRE → Run
JVM → Execute Bytecode
```

[⬆ Back to JDK, JRE & JVM Questions](#-questions)

---

# 4. Access Modifiers

## ❓ Questions

1. [What are Access Modifiers in Java?](#what-are-access-modifiers-in-java)
2. [What is the difference between private, default, protected, and public?](#what-is-the-difference-between-private-default-protected-and-public)

---

## 📝 Answers

### What are Access Modifiers in Java?

Access modifiers control the **visibility and accessibility** of classes, methods, constructors, and fields.

Java provides four access levels:

* `private`
* default / package-private
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

[⬆ Back to Access Modifier Questions](#-questions)

---

### What is the difference between private, default, protected, and public?

#### `private`

Accessible only within the same class.

```java
private int id;
```

#### Default

If no access modifier is specified, the member has **package-private** access.

```java
int id;
```

Accessible within the same package.

#### `protected`

Accessible:

* Within the same package
* In subclasses in other packages through inheritance

```java
protected int id;
```

#### `public`

Accessible wherever the containing class/member is accessible.

```java
public int id;
```

### Interview Shortcut

```text
private    → Same class
default    → Same package
protected  → Same package + subclass
public     → Everywhere
```

[⬆ Back to Access Modifier Questions](#-questions)

---

# 5. `==` vs `.equals()`

## ❓ Questions

1. [What is the difference between `==` and `.equals()`?](#what-is-the-difference-between--and-equals)
2. [What happens when comparing String literals using `==`?](#what-happens-when-comparing-string-literals-using-)
3. [What happens when comparing Strings created using `new`?](#what-happens-when-comparing-strings-created-using-new)
4. [What is Integer caching?](#what-is-integer-caching)
5. [How does `==` work with primitive data types?](#how-does--work-with-primitive-data-types)

---

## 📝 Answers

### What is the difference between `==` and `.equals()`?

The behavior depends on whether we are comparing **primitive values** or **objects**.

### `==`

For primitive types:

> `==` compares the actual values.

For objects:

> `==` compares whether two references refer to the same object.

### `.equals()`

`.equals()` is a method inherited from `Object`.

It is generally used to compare the **logical/content equality** of objects.

The exact behavior depends on how the class implements or overrides `equals()`.

### Example

```java
String a = "Hello";
String b = "Hello";

System.out.println(a == b);       // true
System.out.println(a.equals(b));  // true
```

[⬆ Back to `==` vs `.equals()` Questions](#-questions)

---

### What happens when comparing String literals using `==`?

Consider:

```java
String a = "Hello";
String b = "Hello";

System.out.println(a == b);       // true
System.out.println(a.equals(b));  // true
```

Both references normally point to the same interned string literal.

The String Pool allows identical string literals to share the same object.

Therefore:

```text
a == b         → true
a.equals(b)    → true
```

[⬆ Back to `==` vs `.equals()` Questions](#-questions)

---

### What happens when comparing Strings created using `new`?

Consider:

```java
String c = new String("Hello");
String d = new String("Hello");

System.out.println(c == d);       // false
System.out.println(c.equals(d));  // true
```

Two separate `String` objects are created.

Therefore:

```text
c == d         → false
c.equals(d)    → true
```

`==` checks reference identity, while `equals()` checks String content.

[⬆ Back to `==` vs `.equals()` Questions](#-questions)

---

### What is Integer caching?

Java provides caching for certain boxed integer values.

For typical Java implementations, `Integer` values from **-128 to 127** are cached by default.

Example:

```java
Integer a1 = 100;
Integer b1 = 100;

System.out.println(a1 == b1);       // true
System.out.println(a1.equals(b1));  // true
```

Because of autoboxing and caching, both references can refer to the same cached object.

Outside the commonly cached range:

```java
Integer c1 = 200;
Integer d1 = 200;

System.out.println(c1 == d1);       // false
System.out.println(c1.equals(d1));  // true
```

> **Interview Tip:** Do not use `==` to compare the values of wrapper objects such as `Integer`. Use `.equals()` when logical equality is required.

[⬆ Back to `==` vs `.equals()` Questions](#-questions)

---

### How does `==` work with primitive data types?

For primitive data types, `==` compares the actual values.

```java
int x = 24;
int y = 24;

System.out.println(x == y);  // true
```

Since both variables contain `24`, the result is `true`.

[⬆ Back to `==` vs `.equals()` Questions](#-questions)

---

# 6. `final` vs `finally` vs `finalize()`

## ❓ Questions

1. [What is `final`?](#what-is-final)
2. [What is `finally`?](#what-is-finally)
3. [Can `finally` be prevented from executing?](#can-finally-be-prevented-from-executing)
4. [What is `finalize()`?](#what-is-finalize)
5. [What is the difference between `final`, `finally`, and `finalize()`?](#what-is-the-difference-between-final-finally-and-finalize)

---

## 📝 Answers

### What is `final`?

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

### Final Class

A final class cannot be extended.

```java
final class Animal {
}
```

```java
// class Dog extends Animal { }  // Compilation error
```

[⬆ Back to `final` vs `finally` vs `finalize()` Questions](#-questions)

---

### What is `finally`?

`finally` is a block associated with `try`/`catch`.

It is normally executed after the `try`/`catch` processing.

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

[⬆ Back to `final` vs `finally` vs `finalize()` Questions](#-questions)

---

### Can `finally` be prevented from executing?

Yes.

Although `finally` normally executes, there are situations where it may not execute.

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

> **Interview Tip:** Avoid saying "`finally` always executes." Say **"finally normally executes, except in situations such as JVM termination."**

[⬆ Back to `final` vs `finally` vs `finalize()` Questions](#-questions)

---

### What is `finalize()`?

`finalize()` was an old object-finalization mechanism associated with garbage collection.

It was intended to provide an opportunity for cleanup before an object was reclaimed.

However:

* It was deprecated in **Java 9**.
* It is unreliable for resource management.
* It should not be used for normal cleanup.
* Modern Java recommends **try-with-resources** and explicit resource management.

Example of the old mechanism:

```java
@Override
protected void finalize() throws Throwable {
    System.out.println("Finalize called");
}
```

> **Interview Tip:** Do not say "`finalize()` is used to clean memory." Garbage collection is responsible for reclaiming memory. `finalize()` was an unreliable notification mechanism associated with object finalization.

[⬆ Back to `final` vs `finally` vs `finalize()` Questions](#-questions)

---

### What is the difference between `final`, `finally`, and `finalize()`?

| Keyword / Method | Purpose                                                              |
| ---------------- | -------------------------------------------------------------------- |
| `final`          | Prevents reassignment, overriding, or inheritance depending on usage |
| `finally`        | Block normally executed after `try`/`catch` processing               |
| `finalize()`     | Deprecated legacy object-finalization mechanism                      |

### Easy Way to Remember

```text
final     → Restriction
finally   → Cleanup block
finalize  → Legacy finalization
```

[⬆ Back to `final` vs `finally` vs `finalize()` Questions](#-questions)

---

# 7. Java Runtime Environment

## ❓ Questions

1. [Can a Java Application Run Without Installing a JRE?](#can-a-java-application-run-without-installing-a-jre)

---

## 📝 Answers

### Can a Java Application Run Without Installing a JRE?

A Java application needs a **compatible Java runtime**, including a JVM and the required runtime libraries, to execute.

Historically, this runtime was provided by installing a **JRE**.

With modern Java distributions, applications can commonly be run using:

* A JDK
* A custom runtime image
* A runtime image created using tools such as `jlink`

Therefore, the better interview answer is:

> A Java application cannot execute without a compatible Java runtime. Historically this runtime was provided by the JRE; with modern Java, a JDK or custom runtime image can provide the required runtime components.

[⬆ Back to Java Runtime Environment Questions](#-questions)

---

# 8. Object-Oriented Nature of Java

## ❓ Questions

1. [Is Java 100% Object-Oriented?](#is-java-100-object-oriented)

---

## 📝 Answers

### Is Java 100% Object-Oriented?

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

Here, `age` is a primitive variable.

Java also supports static members, which belong to the class rather than individual objects.

### Interview Answer

> Java is primarily an object-oriented programming language, but it is not a pure object-oriented language because it supports primitive data types and language features that do not require objects.

[⬆ Back to Object-Oriented Nature Questions](#-questions)

---

# 9. `System.out.println()`

## ❓ Questions

1. [What exactly is `System.out.println()` in Java?](#what-exactly-is-systemoutprintln-in-java)
2. [What is `System`?](#what-is-system)
3. [What is `out`?](#what-is-out)
4. [What is `println()`?](#what-is-println)

---

## 📝 Answers

### What exactly is `System.out.println()` in Java?

Consider:

```java
System.out.println("Hello");
```

It consists of three main parts:

```text
System
  ↓
out
  ↓
println()
```

### `System`

`System` is a class from the `java.lang` package.

```java
java.lang.System
```

It provides various system-related facilities.

### `out`

`out` is a **public static final field** of the `System` class.

Its type is:

```java
PrintStream
```

Therefore:

```java
System.out
```

refers to a `PrintStream` object.

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

[⬆ Back to `System.out.println()` Questions](#-questions)

---

### What is `System`?

`System` is a class from the `java.lang` package.

```java
java.lang.System
```

It provides system-level facilities such as:

* Standard input
* Standard output
* Standard error
* System properties
* Environment-related information
* JVM termination

[⬆ Back to `System.out.println()` Questions](#-questions)

---

### What is `out`?

`out` is a `public static final` field in the `System` class.

Its declared type is:

```java
PrintStream
```

Therefore:

```java
System.out
```

refers to the standard output stream.

[⬆ Back to `System.out.println()` Questions](#-questions)

---

### What is `println()`?

`println()` is a method provided by `PrintStream`.

It:

1. Writes the supplied value to the output stream.
2. Adds a line separator.

Example:

```java
System.out.println("Hello");
System.out.println("Java");
```

Output:

```text
Hello
Java
```

[⬆ Back to `System.out.println()` Questions](#-questions)

---

# 10. Primitive Data Types & Memory

## ❓ Questions

1. [How are Primitive Data Types Stored in Memory?](#how-are-primitive-data-types-stored-in-memory)
2. [How is a Local Primitive Variable stored?](#how-is-a-local-primitive-variable-stored)
3. [How is an Instance Variable stored?](#how-is-an-instance-variable-stored)
4. [How is a Static Variable stored?](#how-is-a-static-variable-stored)

---

## 📝 Answers

### How are Primitive Data Types Stored in Memory?

Primitive variables store **primitive values directly**.

However, the exact physical memory layout is a **JVM implementation detail**. Therefore, it is better not to claim that every primitive variable is always stored in one particular memory area.

For interview purposes, we commonly discuss them based on where the variable is declared.

```text
Local variable
     ↓
Stack Frame

Instance field
     ↓
Object
     ↓
Heap

Static field
     ↓
Class-level state
```

[⬆ Back to Primitive Data Types & Memory Questions](#-questions)

---

### How is a Local Primitive Variable stored?

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

[⬆ Back to Primitive Data Types & Memory Questions](#-questions)

---

### How is an Instance Variable stored?

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

The local reference variable `student` belongs to the current stack frame, while the referenced object is associated with heap memory.

[⬆ Back to Primitive Data Types & Memory Questions](#-questions)

---

### How is a Static Variable stored?

A static variable belongs to the **class rather than to individual objects**.

```java
class Test {

    static int count = 50;
}
```

Conceptually:

```text
Class-level state
-----------------
count = 50
```

### Important JVM Interview Point

Older Java interview explanations often say:

> "Static variables are stored in the Method Area."

This is a simplified explanation.

The **Method Area** is a JVM specification concept, while **Metaspace** is a HotSpot implementation detail primarily associated with class metadata.

The exact physical representation of static fields is JVM implementation dependent.

### Safer Interview Answer

> Instance fields are associated with objects on the heap, local variables belong to stack frames, and static fields belong to the class. The exact physical memory representation is JVM implementation dependent.

[⬆ Back to Primitive Data Types & Memory Questions](#-questions)

---

# 🎯 Quick Interview Revision

| Topic                    | Key Point                                                       |
| ------------------------ | --------------------------------------------------------------- |
| **Java**                 | High-level, class-based, object-oriented language               |
| **Platform Independent** | Bytecode runs on JVM implementations for different platforms    |
| **JDK**                  | Used to develop Java applications                               |
| **JRE**                  | Historically provided runtime environment                       |
| **JVM**                  | Executes Java bytecode                                          |
| `private`                | Accessible only within the same class                           |
| `default`                | Accessible within the same package                              |
| `protected`              | Same package + inherited access                                 |
| `public`                 | Accessible wherever the member is accessible                    |
| `==`                     | Primitive value comparison / object reference comparison        |
| `.equals()`              | Logical equality depending on implementation                    |
| `final`                  | Prevents reassignment/overriding/inheritance depending on usage |
| `finally`                | Cleanup block associated with exception handling                |
| `finalize()`             | Deprecated legacy finalization mechanism                        |
| Pure OOP?                | No, because Java has primitive types                            |
| `System.out`             | `PrintStream` object referenced by a static field               |
| Local variable           | Belongs to a stack frame                                        |
| Instance variable        | Associated with an object                                       |
| Static variable          | Belongs to the class                                            |

---

## 🔝 Back to Core Java – Basics

[⬆ Go to Topics](#-topics)
