# 🧩 Core Java – Strings & Arrays

A structured collection of **Core Java Strings & Arrays interview questions and answers**, organized topic-wise for easy interview preparation.

---

## ❓ Questions

### Strings

1. [What is the difference between String, StringBuilder, and StringBuffer?](#what-is-the-difference-between-string-stringbuilder-and-stringbuffer)
2. [Why are Strings immutable in Java?](#why-are-strings-immutable-in-java)
3. [How to create an immutable class?](#how-to-create-an-immutable-class)
4. [Why does String use a char[] internally and why is it immutable?](#why-does-string-use-a-char-internally-and-why-is-it-immutable)
5. [What is String Pool in Java?](#what-is-string-pool-in-java)
6. [What are the different ways of creating String objects in Java?](#what-are-the-different-ways-of-creating-string-objects-in-java)
7. [toCharArray() – What is it?](#tochararray--what-is-it)
8. [Which one is preferable for password storage – String or char[]?](#which-one-is-preferable-for-password-storage--string-or-char)

### Arrays

9. [What is the difference between Array and ArrayList?](#what-is-the-difference-between-array-and-arraylist)

### Immutable Classes

10. [Apart from String class, do we have any other immutable classes in Java?](#apart-from-string-class-do-we-have-any-other-immutable-classes-in-java)

---

## 📝 Answers

### What is the difference between String, StringBuilder, and StringBuffer?

### String

* `String` is a sequence of characters.
* It is **immutable**, meaning once a String object is created, its value cannot be changed.
* Any modification creates a new String object.

Example:

```java
String str = "Java";

str = str.concat(" Programming");

System.out.println(str);
```

The original String object `"Java"` is not modified. A new String object is created.

### StringBuilder

* `StringBuilder` is **mutable**.
* It allows modification of the same object.
* It is **not thread-safe**.
* It generally provides better performance than `StringBuffer` in single-threaded scenarios.

Example:

```java
StringBuilder builder = new StringBuilder("Java");

builder.append(" Programming");

System.out.println(builder);
```

### StringBuffer

* `StringBuffer` is **mutable**.
* It is **thread-safe**.
* Its methods are synchronized.
* Synchronization can introduce additional overhead compared with `StringBuilder`.

Example:

```java
StringBuffer buffer = new StringBuffer("Java");

buffer.append(" Programming");

System.out.println(buffer);
```

### Difference

| Feature                       | String                                         | StringBuilder                        | StringBuffer                                               |
| ----------------------------- | ---------------------------------------------- | ------------------------------------ | ---------------------------------------------------------- |
| Mutability                    | Immutable                                      | Mutable                              | Mutable                                                    |
| Thread Safety                 | Immutable objects are inherently safe to share | Not thread-safe                      | Thread-safe                                                |
| Synchronization               | Not applicable                                 | No synchronization                   | Synchronized methods                                       |
| Performance for modifications | Lower                                          | Generally faster                     | Generally slower than StringBuilder                        |
| Typical Usage                 | Constant/text values                           | Single-threaded string modifications | Shared mutable string operations requiring synchronization |

### Easy Way to Remember

```text
String        → Immutable
StringBuilder → Mutable + Not Thread-Safe
StringBuffer  → Mutable + Thread-Safe
```

[⬆ Back to Questions](#-questions)

---

### Why are Strings immutable in Java?

Strings are immutable, which means that once a String object is created, its value cannot be changed.

For example:

```java
String str = "Java";

str.concat(" Programming");

System.out.println(str);
```

The value of `str` remains:

```text
Java
```

because `concat()` creates a new String instead of modifying the existing String.

### Why did Java make String immutable?

String immutability provides several important benefits.

#### 1. Security

Strings are commonly used for sensitive or important values such as:

* Usernames
* Password-related data
* Database URLs
* File paths
* Class names
* Network addresses

Because Strings cannot be modified after creation, they are safer to share between different parts of an application.

#### 2. Thread Safety

Immutable objects are inherently safe to share between threads because their state cannot change after creation.

Therefore, multiple threads can safely use the same String object without synchronization for modifications.

#### 3. String Pool Optimization

Java maintains a **String Pool** for interned strings.

Because String objects are immutable, the same String object can safely be shared by multiple references.

Example:

```java
String a = "Java";
String b = "Java";
```

Both references can refer to the same pooled String object.

#### 4. Hashing and Collections

String is commonly used as a key in collections such as `HashMap`.

Because a String's value and hash code do not change after creation, it is safe to use as a key.

Example:

```java
Map<String, Integer> map = new HashMap<>();

map.put("Java", 10);
```

### Interview Answer

> String is immutable in Java because immutability provides security, thread-safety, String Pool sharing, and stable hash codes when Strings are used as keys in collections.

[⬆ Back to Questions](#-questions)

---

### How to create an immutable class?

To create an immutable class, follow these common rules:

### 1. Declare the class as `final`

A `final` class cannot be extended.

```java
final class Employee {
}
```

This prevents subclasses from changing the behavior of the class.

### 2. Make fields `private` and `final`

This prevents direct external access and reassignment.

```java
private final String name;
private final int age;
```

### 3. Do not provide setters

Avoid methods that modify the object's state.

```java
// No setter methods
```

### 4. Initialize fields through the constructor

Assign the values when the object is created.

```java
final class Employee {

    private final String name;
    private final int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
```

### 5. Handle mutable fields carefully

If the class contains mutable objects such as:

* `Date`
* `List`
* `Map`
* `Set`
* Arrays

you should use defensive copies where necessary.

### Example

```java
final class Student {

    private final String name;
    private final List<String> subjects;

    public Student(String name, List<String> subjects) {
        this.name = name;
        this.subjects = List.copyOf(subjects);
    }

    public String getName() {
        return name;
    }

    public List<String> getSubjects() {
        return subjects;
    }
}
```

### Interview Answer

> To create an immutable class, declare the class as final, make fields private and final, initialize them through the constructor, avoid setters, and use defensive copies or immutable collections for mutable fields.

[⬆ Back to Questions](#-questions)

---

### Why does String use a char[] internally and why is it immutable?

Historically, Java's `String` implementation used a `char[]` internally to store characters.

However, this is an important **version-dependent detail**.

Since **Java 9**, modern JDK implementations use a `byte[]` together with a coder flag as part of **Compact Strings**, rather than always using a `char[]`.

### Conceptually

A String needs an internal representation to store its character data efficiently.

Older Java implementations:

```text
String
   ↓
char[]
   ↓
Character data
```

Modern Java implementations can use:

```text
String
   ↓
byte[]
   ↓
Compact String representation
```

depending on the characters being stored.

### Why is String immutable?

String is immutable so that:

* String Pool objects can be safely shared.
* Strings can be safely used across threads.
* Hash codes remain stable.
* Security-sensitive values cannot be changed through an existing reference.
* JVM optimizations can safely reuse String objects.

### Interview Answer

> Historically, String used a `char[]` internally, but modern Java implementations use a `byte[]` with Compact Strings where appropriate. String is immutable so that its value cannot change after creation, enabling safe sharing, String Pool optimization, thread safety, and stable hash codes.

[⬆ Back to Questions](#-questions)

---

### What is String Pool in Java?

The **String Pool**, also called the **String Constant Pool**, is a special area used by the JVM to store and reuse interned String objects.

In modern Java implementations, the String Pool is located in the **Java Heap**.

### Example

```java
String str1 = "Java";
String str2 = "Java";

System.out.println(str1 == str2);
```

Output:

```text
true
```

Both references can point to the same pooled String object.

### How does it work?

When Java encounters a String literal:

```java
String str = "Java";
```

the JVM checks whether an equivalent interned String already exists in the String Pool.

If it exists, the existing object can be reused.

If it does not exist, a new pooled String object is created.

### Example

```text
String str1 = "Java";
String str2 = "Java";

             String Pool
             ┌──────────┐
str1 ───────►│  "Java"  │◄─────── str2
             └──────────┘
```

### Important

String literals are automatically interned.

You can also explicitly request interning using:

```java
String str = new String("Java");

String pooled = str.intern();
```

[⬆ Back to Questions](#-questions)

---

### What are the different ways of creating String objects in Java?

There are several ways to create or obtain String objects.

### 1. String Literal

```java
String str = "Java";
```

String literals are stored in the String Pool and can be reused.

---

### 2. Using `new String()`

```java
String str = new String("Java");
```

This explicitly creates a new String object.

The object created by `new` is associated with the regular heap, while the literal `"Java"` may also exist in the String Pool.

---

### 3. Using `char[]`

```java
char[] chars = {'J', 'a', 'v', 'a'};

String str = new String(chars);
```

This converts a character array into a String.

---

### 4. Using `byte[]`

```java
byte[] bytes = {65, 66, 67};

String str = new String(bytes);

System.out.println(str);
```

Output:

```text
ABC
```

The byte array is decoded using the appropriate character encoding.

For predictable behavior with text data, specify a charset when appropriate.

---

### 5. Using StringBuilder

```java
StringBuilder builder = new StringBuilder();

builder.append("Java");
builder.append(" Backend");

String str = builder.toString();
```

This is useful when constructing strings dynamically.

---

### 6. Using StringBuffer

```java
StringBuffer buffer = new StringBuffer();

buffer.append("Java");
buffer.append(" Backend");

String str = buffer.toString();
```

This can be used when synchronized mutable string operations are required.

---

### 7. Using `concat()`

```java
String str1 = "Java";
String str2 = str1.concat(" Backend");
```

`concat()` returns a new String.

---

### 8. Using `+` Operator

```java
String str = "Java" + " Backend";
```

String concatenation using `+` is compiled/optimized by the Java compiler and JVM. For repeated dynamic concatenation, using `StringBuilder` is generally preferred.

### 9. Using `intern()`

```java
String str = new String("Java");

String pooledString = str.intern();
```

`intern()` returns the canonical pooled representation of the String.

### Summary

```text
String Literal
       ↓
String Pool

new String()
       ↓
New String Object

char[]
       ↓
String

byte[]
       ↓
String

StringBuilder
       ↓
toString()
       ↓
String

StringBuffer
       ↓
toString()
       ↓
String

concat()
       ↓
New String

+
       ↓
String Concatenation

intern()
       ↓
String Pool
```

[⬆ Back to Questions](#-questions)

---

### toCharArray() – What is it?

`toCharArray()` is a method of the `String` class that converts a String into a **character array (`char[]`)**.

### Example

```java
String str = "Java";

char[] chars = str.toCharArray();

for (char ch : chars) {
    System.out.println(ch);
}
```

### Output

```text
J
a
v
a
```

### Simple Definition

> `toCharArray()` converts a String into a character array.

### Important Point

The returned `char[]` is a separate mutable array. Modifying the array does not modify the original String.

[⬆ Back to Questions](#-questions)

---

### Which one is preferable for password storage – String or char[]?

For APIs that allow it, `char[]` has traditionally been preferred for handling sensitive password input because it is mutable and can be cleared after use.

### Why not String?

Strings are immutable.

For example:

```java
String password = "Secret123";
```

Once the String is created, the application cannot overwrite its contents.

If additional String copies are created during processing, those copies may remain in memory until garbage collection.

### Advantage of `char[]`

A character array can be explicitly cleared after use:

```java
char[] password = {'S', 'e', 'c', 'r', 'e', 't'};

try {
    // Use password
} finally {
    java.util.Arrays.fill(password, '\0');
}
```

The array contents can therefore be overwritten when they are no longer required.

### Important Correction

It is **not true** that printing a `char[]` will hide the password.

For example:

```java
char[] password = {'S', 'e', 'c', 'r', 'e', 't'};

System.out.println(password);
```

This can print:

```text
Secret
```

So `char[]` is not automatically safe from logging.

### Interview Answer

> `char[]` can be preferable for password handling because it is mutable and can be explicitly cleared after use, whereas String is immutable. However, secure password handling also depends on the API, logging practices, storage, transport, and overall application design.

[⬆ Back to Questions](#-questions)

---

### What is the difference between Array and ArrayList?

### Array

An array:

* Has a **fixed size** after creation.
* Can store **primitive data types** such as `int`, `char`, etc.
* Can also store objects.
* Provides direct indexed access.
* Has low overhead and is useful when the size is known.

Example:

```java
int[] numbers = new int[5];

numbers[0] = 10;
numbers[1] = 20;
```

The size remains `5`.

---

### ArrayList

`ArrayList` is a resizable implementation of the `List` interface.

It:

* Can grow or shrink dynamically.
* Stores **objects**, not primitive values directly.
* Uses wrapper classes for primitives.
* Provides many convenient collection methods.
* Has additional overhead compared with a raw array.

Example:

```java
ArrayList<Integer> numbers = new ArrayList<>();

numbers.add(10);
numbers.add(20);
numbers.add(30);
```

Here, `Integer` is used instead of `int`.

### Array vs ArrayList

| Feature         | Array                    | ArrayList                      |
| --------------- | ------------------------ | ------------------------------ |
| Size            | Fixed                    | Dynamic                        |
| Primitive types | Supported                | Not directly supported         |
| Objects         | Supported                | Supported                      |
| Resizing        | Manual                   | Automatic                      |
| Methods         | Limited                  | Many collection methods        |
| Performance     | Generally lower overhead | Additional collection overhead |
| Type            | Language construct       | Collection class               |

### Example

```java
int[] array = new int[3];

ArrayList<Integer> list = new ArrayList<>();
```

### Easy Way to Remember

```text
Array
→ Fixed Size
→ Primitive + Objects

ArrayList
→ Dynamic Size
→ Objects
→ Wrapper classes for primitives
```

[⬆ Back to Questions](#-questions)

---

### Apart from String class, do we have any other immutable classes in Java?

Yes.

Java provides several immutable classes.

### Examples

#### 1. Wrapper Classes

Most standard wrapper classes are immutable:

```text
Integer
Long
Short
Byte
Float
Double
Character
Boolean
```

Example:

```java
Integer number = 10;

number = 20;
```

The original `Integer` object is not modified. The reference points to another object/value.

---

#### 2. Date and Time API

Classes from the modern Java Date and Time API are generally immutable.

Examples:

```text
LocalDate
LocalTime
LocalDateTime
Instant
ZonedDateTime
```

Example:

```java
LocalDate date = LocalDate.of(2026, 9, 20);

LocalDate newDate = date.plusDays(1);
```

`plusDays()` does not modify the original `date`. It returns a new `LocalDate`.

---

#### 3. BigInteger

```java
BigInteger number = new BigInteger("100");

BigInteger result = number.add(BigInteger.TEN);
```

The original `number` is not modified.

---

#### 4. BigDecimal

`BigDecimal` is also immutable.

```java
BigDecimal price = new BigDecimal("100.50");

BigDecimal newPrice = price.add(new BigDecimal("10.00"));
```

The original object remains unchanged.

### Interview Answer

> Yes. Apart from String, Java provides many immutable classes such as wrapper classes, `LocalDate`, `LocalTime`, `LocalDateTime`, `Instant`, `BigInteger`, and `BigDecimal`.

[⬆ Back to Questions](#-questions)

---

# ⚡ Quick Interview Revision

| Topic                   | Key Point                                                                             |
| ----------------------- | ------------------------------------------------------------------------------------- |
| **String**              | Immutable sequence of characters                                                      |
| **StringBuilder**       | Mutable and not thread-safe                                                           |
| **StringBuffer**        | Mutable and thread-safe                                                               |
| **String Immutability** | Provides safe sharing, String Pool optimization, stable hash codes, and thread safety |
| **Immutable Class**     | Final class + private final fields + no setters + controlled initialization           |
| **String Pool**         | Pool of interned Strings maintained on the Java Heap                                  |
| **String Literal**      | Can be reused from String Pool                                                        |
| **`new String()`**      | Explicitly creates a new String object                                                |
| **`toCharArray()`**     | Converts String into `char[]`                                                         |
| **Password Handling**   | `char[]` can be cleared after use                                                     |
| **Array**               | Fixed-size collection supporting primitives and objects                               |
| **ArrayList**           | Resizable collection that stores objects                                              |
| **Wrapper Classes**     | Immutable classes such as Integer, Long, Boolean                                      |
| **Date/Time API**       | Classes such as LocalDate and LocalDateTime are immutable                             |
| **BigInteger**          | Immutable arbitrary-precision integer                                                 |
| **BigDecimal**          | Immutable arbitrary-precision decimal                                                 |

---

## 🎯 Interview Memory Map

```text
Strings & Arrays
│
├── String
│   ├── Immutable
│   ├── String Pool
│   └── Safe to Share
│
├── StringBuilder
│   ├── Mutable
│   └── Not Thread-Safe
│
├── StringBuffer
│   ├── Mutable
│   └── Thread-Safe
│
├── String Pool
│   └── Interned Strings
│
├── String Creation
│   ├── Literal
│   ├── new String()
│   ├── char[]
│   ├── byte[]
│   ├── StringBuilder
│   ├── StringBuffer
│   ├── concat()
│   ├── +
│   └── intern()
│
├── Array
│   ├── Fixed Size
│   ├── Primitive Types
│   └── Objects
│
├── ArrayList
│   ├── Dynamic Size
│   └── Objects / Wrapper Types
│
└── Immutable Classes
    ├── String
    ├── Wrapper Classes
    ├── LocalDate
    ├── LocalDateTime
    ├── BigInteger
    └── BigDecimal
```

