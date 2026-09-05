# 🧩 Core Java – Basics

A structured collection of **Core Java Basics interview questions and answers**, organized topic-wise for easy interview preparation.

---

## ❓ Questions

# 1. Java

1. [What is Java?](#what-is-java)
2. [What are the main features of Java?](#what-are-the-main-features-of-java)

# 2. Platform Independence

1. [Why is Java Platform Independent?](#why-is-java-platform-independent)

# 3. JDK, JRE & JVM

1. [What is JDK?](#what-is-jdk)
2. [What is JRE?](#what-is-jre)
3. [What is JVM?](#what-is-jvm)
4. [What is the difference between JDK, JRE, and JVM?](#what-is-the-difference-between-jdk-jre-and-jvm)

# 4. Access Modifiers

1. [What are Access Modifiers in Java?](#what-are-access-modifiers-in-java)
2. [What is the difference between private, default, protected, and public?](#what-is-the-difference-between-private-default-protected-and-public)

# 5. `==` vs `.equals()`

1. [What is the difference between `==` and `.equals()`?](#what-is-the-difference-between--and-equals)
2. [What happens when comparing String literals using `==`?](#what-happens-when-comparing-string-literals-using-)
3. [What happens when comparing Strings created using `new`?](#what-happens-when-comparing-strings-created-using-new)
4. [What is Integer caching?](#what-is-integer-caching)
5. [How does `==` work with primitive data types?](#how-does--work-with-primitive-data-types)

# 6. `final` vs `finally` vs `finalize()`

1. [What is `final`?](#what-is-final)
2. [What is `finally`?](#what-is-finally)
3. [Can `finally` be prevented from executing?](#can-finally-be-prevented-from-executing)
4. [What is `finalize()`?](#what-is-finalize)
5. [What is the difference between `final`, `finally`, and `finalize()`?](#what-is-the-difference-between-final-finally-and-finalize)

# 7. Java Runtime Environment

1. [Can a Java Application Run Without Installing a JRE?](#can-a-java-application-run-without-installing-a-jre)

# 8. Object-Oriented Nature of Java

1. [Is Java 100% Object-Oriented?](#is-java-100-object-oriented)

# 9. `System.out.println()`

1. [What exactly is `System.out.println()` in Java?](#what-exactly-is-systemoutprintln-in-java)
2. [What is `System`?](#what-is-system)
3. [What is `out`?](#what-is-out)
4. [What is `println()`?](#what-is-println)

# 10. Primitive Data Types & Memory

1. [How are Primitive Data Types Stored in Memory?](#how-are-primitive-data-types-stored-in-memory)
2. [How is a Local Primitive Variable Stored?](#how-is-a-local-primitive-variable-stored)
3. [How is an Instance Variable Stored?](#how-is-an-instance-variable-stored)
4. [How is a Static Variable Stored?](#how-is-a-static-variable-stored)

--

## 📝 Answers

### What is Java?

Java is a **high-level, class-based, object-oriented, general-purpose programming language**.

Java is widely used for:

* Web applications
* Mobile applications
* Desktop applications
* Enterprise applications
* Distributed applications
* Backend applications
* Cloud-based applications

### History of Java

* Originally developed at **Sun Microsystems**.
* Created by **James Gosling** and his team.
* Officially released in **1995**.
* The original project was called **Oak** before being renamed Java.

### 🎯 Interview Answer

> Java is a high-level, class-based, object-oriented, general-purpose programming language designed to be platform independent through the use of bytecode and the JVM.

[⬆ Back to Questions](#-questions)

---

### What are the main features of Java?

The main features of Java are:

* **Object-Oriented** – Based on classes and objects.
* **Platform Independent** – Java bytecode can run on different platforms using a compatible JVM.
* **Robust** – Provides strong type checking, exception handling, and automatic memory management.
* **Secure** – Provides features such as bytecode verification and controlled runtime execution.
* **Portable** – Java bytecode can be moved across platforms with compatible Java runtimes.
* **Multithreaded** – Supports concurrent execution using threads and concurrency APIs.
* **Distributed** – Provides APIs and technologies for distributed applications.
* **High Performance** – JIT compilation optimizes frequently executed code.
* **Automatic Garbage Collection** – JVM automatically manages object memory reclamation.
* **Architecture Neutral** – Bytecode is not tied to a specific processor architecture.

[⬆ Back to Questions](#-questions)

---

### Why is Java Platform Independent?

Java is platform independent because Java source code is compiled into **platform-neutral bytecode** rather than platform-specific machine code.

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

The process is:

1. `javac` converts the `.java` source file into bytecode.
2. The bytecode is stored in a `.class` file.
3. The JVM executes the bytecode.
4. JVM implementations are available for different operating systems.
5. Therefore, the same bytecode can run on different operating systems with compatible JVM implementations.

### Example

The same `.class` file can conceptually run on:

```text
Windows → JVM
Linux   → JVM
macOS   → JVM
```

This is commonly described as:

> **WORA – Write Once, Run Anywhere**

### 🎯 Interview Answer

> Java is platform independent because Java source code is compiled into platform-neutral bytecode, and that bytecode is executed by a JVM specific to the underlying operating system.

[⬆ Back to Questions](#-questions)

---

### What is JDK?

**JDK** stands for **Java Development Kit**.

It is used for **developing Java applications** and provides development tools along with the runtime components required to run Java applications.

### Common JDK tools include:

* Java compiler – `javac`
* Java launcher – `java`
* Debugging tools
* Monitoring tools
* Other development utilities
* Runtime components

### Example

```bash
javac Test.java
```

The `javac` compiler converts the Java source code into bytecode.

```text
Test.java
   ↓
 javac
   ↓
Test.class
```

[⬆ Back to JDK, JRE & JVM Questions](#-questions)

---

### What is JRE?

**JRE** stands for **Java Runtime Environment**.

Historically, the JRE provided the components required to **run Java applications**, including:

* JVM
* Java class libraries
* Supporting runtime files

### Important

Modern Java distributions are generally centered around the **JDK**. Oracle no longer distributes a standalone JRE in the same way it historically did.

### 🎯 Interview Answer

> JRE historically provided the runtime environment required to execute Java applications, including the JVM and Java libraries. With modern Java releases, applications are commonly run using a JDK or a custom runtime image.

[⬆ Back to JDK, JRE & JVM Questions](#-questions)

---

### What is JVM?

**JVM** stands for **Java Virtual Machine**.

The JVM is responsible for **executing Java bytecode**.

Different operating systems have different JVM implementations.

### Execution Flow

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

### Major JVM responsibilities

* Loading classes
* Verifying bytecode
* Executing bytecode
* Memory management
* Garbage collection
* Runtime optimization

[⬆ Back to Questions](#-questions)

---

### What is the difference between JDK, JRE, and JVM?

| Component | Full Form                | Purpose                                                        |
| --------- | ------------------------ | -------------------------------------------------------------- |
| **JDK**   | Java Development Kit     | Used to develop Java applications                              |
| **JRE**   | Java Runtime Environment | Historically provided the environment to run Java applications |
| **JVM**   | Java Virtual Machine     | Executes Java bytecode                                         |

### Relationship

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

[⬆ Back to Questions](#-questions)

---

### What are Access Modifiers in Java?

Access modifiers control the **visibility and accessibility** of classes, methods, constructors, and fields.

Java provides four access levels:

* `private`
* `default` / package-private
* `protected`
* `public`

### Access Modifier Comparison

| Modifier    | Same Class | Same Package | Subclass in Different Package | Anywhere |
| ----------- | ---------- | ------------ | ----------------------------- | -------- |
| `private`   | ✅          | ❌            | ❌                             | ❌        |
| `default`   | ✅          | ✅            | ❌                             | ❌        |
| `protected` | ✅          | ✅            | ✅*                            | ❌        |
| `public`    | ✅          | ✅            | ✅                             | ✅        |

> **Note:** A `protected` member can be accessed by a subclass in another package through inheritance, subject to Java's access rules. It is not generally accessible through an arbitrary parent-class object reference from another package.

### Example

```java
public class Student {

    private int id;

    String name;              // default

    protected String course;

    public String college;
}
```

[⬆ Back to Questions](#-questions)

---

### What is the difference between private, default, protected, and public?

### `private`

Accessible only within the **same class**.

```text
private → Same class
```

### `default`

Also called **package-private**.

Accessible within the **same package**.

```text
default → Same package
```

### `protected`

Accessible:

* Within the same package
* By subclasses in other packages through inheritance

```text
protected → Same package + subclass
```

### `public`

Accessible wherever the containing class/member is accessible.

```text
public → Everywhere
```

### Shortcut

```text
private    → Same class
default    → Same package
protected  → Same package + subclass
public     → Everywhere
```

[⬆ Back to Questions](#-questions)

---

### What is the difference between `==` and `.equals()`?

The behavior depends on whether you are comparing **primitive values or objects**.

### `==`

For primitives:

* Compares the actual values.

For objects:

* Compares whether both references refer to the same object.

### `.equals()`

`.equals()` is inherited from `Object`.

Its behavior depends on the class implementation. For classes such as `String`, it is overridden to perform **logical/content equality**.

### Example

```java
String a = "Hello";
String b = "Hello";

System.out.println(a == b);       // true
System.out.println(a.equals(b));  // true
```

[⬆ Back to Questions](#-questions)

---

### What happens when comparing String literals using `==`?

Consider:

```java
String a = "Hello";
String b = "Hello";

System.out.println(a == b);       // true
System.out.println(a.equals(b));  // true
```

Both references normally point to the **same interned String object**.

Java's String Pool allows identical string literals to share the same object.

Therefore:

```text
a == b          → true
a.equals(b)     → true
```

### Why?

String literals are interned by the JVM, so the same literal can refer to the same pooled object.

[⬆ Back to Questions](#-questions)

---

### What happens when comparing Strings created using `new`?

Consider:

```java
String c = new String("Hello");
String d = new String("Hello");

System.out.println(c == d);       // false
System.out.println(c.equals(d));  // true
```

Two separate `String` objects are explicitly created.

Therefore:

```text
c == d          → false
c.equals(d)     → true
```

`==` checks **reference identity**, while `equals()` checks **logical content equality** for `String`.

[⬆ Back to Questions](#-questions)

---

### What is Integer caching?

Java caches certain boxed integer values.

For typical Java implementations, `Integer` values from **-128 to 127** are cached by default.

Example:

```java
Integer a1 = 100;
Integer b1 = 100;

System.out.println(a1 == b1);       // true
System.out.println(a1.equals(b1));  // true
```

Both variables can refer to the same cached `Integer` object.

Outside the common cache range:

```java
Integer c1 = 200;
Integer d1 = 200;

System.out.println(c1 == d1);       // false
System.out.println(c1.equals(d1));  // true
```

### Interview Tip

Do not use `==` to compare wrapper values when you mean numerical equality.

Prefer:

```java
a1.equals(b1)
```

[⬆ Back to Questions](#-questions)

---

### How does `==` work with primitive data types?

For primitive data types, `==` compares the **actual values**.

Example:

```java
int x = 24;
int y = 24;

System.out.println(x == y); // true
```

Here:

```text
x = 24
y = 24
```

Therefore:

```text
x == y → true
```

[⬆ Back to Questions](#-questions)

---

### What is `final`?

The `final` keyword can be used with:

* Variables
* Methods
* Classes

### Final Variable

A final variable cannot be reassigned.

```java
final int x = 10;

// x = 20; // Compilation error
```

### Final Method

A final method cannot be overridden.

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

// class Dog extends Animal {} // Compilation error
```

### Easy Way to Remember

```text
final variable → Cannot be reassigned
final method   → Cannot be overridden
final class    → Cannot be extended
```

[⬆ Back to `final` vs `finally` vs `finalize()` Questions](#-questions)

---

### What is `finally`?

`finally` is a block associated with `try`/`catch`.

It normally executes after the `try`/`catch` processing and is commonly used for cleanup operations such as:

* Closing files
* Releasing resources
* Closing database connections
* Cleanup operations

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

### Output

```text
Try block
Finally block
```

[⬆ Back to Questions](#-questions)

---

### Can `finally` be prevented from executing?

Yes.

For example, `System.exit(0)` terminates the JVM before the `finally` block can execute.

```java
try {
    System.out.println("Hello");
    System.exit(0);
} finally {
    System.out.println("Finally");
}
```

The JVM terminates before the `finally` block is executed.

### Interview Tip

> The `finally` block normally executes, but it may not execute in situations such as JVM termination using `System.exit()`.

[⬆ Back to Questions](#-questions)

---

### What is `finalize()`?

`finalize()` was an old object-finalization mechanism associated with garbage collection.

It was intended to provide an opportunity for cleanup before an object was reclaimed.

However:

* It is **deprecated since Java 9**.
* Its execution is **not guaranteed**.
* It should not be used for resource management.
* Modern Java recommends explicit resource management and **try-with-resources**.

### Legacy Example

```java
@Override
protected void finalize() throws Throwable {
    System.out.println("Finalize called");
}
```

### Interview Tip

> `finalize()` was a legacy and unreliable finalization mechanism. It has been deprecated and should not be used for resource management. Modern Java recommends try-with-resources and explicit cleanup.

[⬆ Back to Questions](#-questions)

---

### What is the difference between `final`, `finally`, and `finalize()`?

| Keyword / Method | Purpose                                                              |
| ---------------- | -------------------------------------------------------------------- |
| `final`          | Prevents reassignment, overriding, or inheritance depending on usage |
| `finally`        | Block normally executed after `try`/`catch` processing               |
| `finalize()`     | Deprecated legacy object-finalization mechanism                      |

### Easy Way to Remember

```text
final    → Restriction
finally  → Cleanup block
finalize → Legacy finalization
```

[⬆ Back to Questions](#-questions)

---

### Can a Java Application Run Without Installing a JRE?

A Java application needs a **compatible Java runtime** containing the JVM and the required runtime libraries.

Historically, the JRE provided this runtime.

With modern Java, an application can be executed using:

* A JDK
* A custom runtime image
* A runtime created using tools such as `jlink`

### 🎯 Interview Answer

> A Java application cannot execute without a compatible Java runtime. Historically this runtime was provided by the JRE; with modern Java, a JDK or custom runtime image can provide the required runtime components.

[⬆ Back to Questions](#-questions)

---

### Is Java 100% Object-Oriented?

**No, Java is not 100% object-oriented.**

Java supports primitive data types such as:

```text
byte
short
int
long
float
double
char
boolean
```

Primitive values are **not objects**.

For example:

```java
int age = 25;
```

Here, `age` is a primitive variable rather than a reference to an `Integer` object.

Java also has static members that belong to the class rather than to individual objects.

### 🎯 Interview Answer

> Java is primarily an object-oriented programming language, but it is not a pure object-oriented language because it supports primitive data types and language features that do not require objects.

[⬆ Back to Questions](#-questions)

---

### What exactly is `System.out.println()` in Java?

Consider:

```java
System.out.println("Hello");
```

It consists of three main parts:

```text
System → out → println()
```

### `System`

`System` is the `java.lang.System` class.

### `out`

`out` is a `public static final` field of `System`.

Its declared type is `PrintStream`.

### `println()`

`println()` is a method of the `PrintStream` class.

### Conceptual Flow

```text
System
   ↓
out
   ↓
PrintStream object
   ↓
println()
```

Therefore:

```java
System.out.println("Hello");
```

means that the `println()` method is being called on the `PrintStream` object referenced by `System.out`.

[⬆ Back to `System.out.println()` Questions](#-questions)

---

### What is `System`?

`System` is the `java.lang.System` class.

It provides functionality related to:

* Standard input
* Standard output
* Standard error
* System properties
* Environment information
* JVM termination

Example:

```java
System.out.println("Hello");
```

Here, `System` refers to the `java.lang.System` class.

[⬆ Back to `System.out.println()` Questions](#-questions)

---

### What is `out`?

`out` is a `public static final` field declared in the `System` class.

Its declared type is:

```java
PrintStream
```

It refers to the standard output stream.

Conceptually:

```text
System
   ↓
out
   ↓
PrintStream
```

[⬆ Back to `System.out.println()` Questions](#-questions)

---

### What is `println()`?

`println()` is a method of the `PrintStream` class.

It writes the supplied value to the output stream and adds a line separator.

### Example

```java
System.out.println("Hello");
System.out.println("Java");
```

### Output

```text
Hello
Java
```

[⬆ Back to Questions](#-questions)

---

### How are Primitive Data Types Stored in Memory?

Primitive variables store **primitive values directly** rather than object references.

A common conceptual model is:

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
Class-level State
```

### Important Interview Point

The exact physical memory layout is **JVM implementation dependent**.

### 🎯 Safer Interview Answer

> Primitive values are stored directly rather than as object references. Local variables are associated with stack frames, instance fields with objects, and static fields with class-level state. The exact physical memory representation is JVM implementation dependent.

[⬆ Back to Questions](#-questions)

---

### How is a Local Primitive Variable Stored?

A local primitive variable declared inside a method is associated with that method's **stack frame**.

Example:

```java
public static void main(String[] args) {

    int a = 10;
}
```

Conceptually:

```text
Stack Frame
┌─────────────┐
│ a = 10      │
└─────────────┘
```

The variable belongs to the current method invocation.

[⬆ Back to Primitive Data Types & Memory Questions](#-questions)

---

### How is an Instance Variable Stored?

An instance variable belongs to an object.

Example:

```java
class Student {

    int age = 20;
}

Student student = new Student();
```

Conceptually:

```text
Stack
   │
   │ student reference
   ↓
Heap
┌─────────────────┐
│ Student Object  │
│ age = 20        │
└─────────────────┘
```

The object and its instance fields are associated with heap memory.

The reference variable `student` belongs to the current stack frame in this conceptual model.

[⬆ Back to Primitive Data Types & Memory Questions](#-questions)

---

### How is a Static Variable Stored?

A static variable belongs to the **class**, rather than to an individual object.

Example:

```java
class Test {

    static int count = 50;
}
```

Conceptually:

```text
Class Test
    ↓
Static field
    ↓
count = 50
```

---
