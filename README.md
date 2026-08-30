🧩 Core Java – Basics
What is Java?
•	Java is a High Level, Class based, Object oriented, functional programming language, which is used to develop Web Application, Mobile Application, Desktop Application, Enterprise-level Application.
•	It was developed by James Gosling in Sun Microsystems in the year 1995.

Why Java is platform independent?
•	Java Compiler converts Source Code (Java Code) to Byte Code.
•	Byte Code can be run on any OS which has JVM, which enables Write Once Run Anywhere (WORA) capability.

What is the difference between JDK, JRE, and JVM?
JDK:
•	JDK stands for Java Development Kit.
•	It is used to develop Java Applications.
•	Complier comes in JDK.
JRE:
•	JRE stands for Java Runtime Environment.
•	It is used to run Java Application.
•	It contains JAR files like multiple packages which contains pre-defined Classes and Interfaces.
JVM:
•	JVM stands for Java Virtual Machine.
•	It is used to execute Java Byte Code.

What are access modifiers in Java?
•	Controls the access of Classes, Methods & Fields.
Modifier	Class	Package	Subclass	World
private	✅	❌	❌	❌
default	✅	✅	❌	❌
protected	✅	✅	✅	❌
public	✅	✅	✅	✅

Difference between == and .equals()?
•	== - comparison of References(Memory Address)
•	.equals() - comparison of the value of objects
Example:
//String Literals
String a = "Hello";
String b = "Hello";
System.out.println(a == b); //true
System.out.println(a.equals(b)); //true

//New Keyword
String c = new String("Hello");
String d = new String("Hello");
System.out.println(c == d); //false
System.out.println(c.equals(d)); //true

//Integer
Integer a1 = 100;
Integer b1 = 100;
System.out.println(a1 == b1); //true
System.out.println(a1.equals(b1)); //true
//cache range is between -128 to 127 so it uses same value

Integer c1 = 200;
Integer d1 = 200;
System.out.println(c1 == d1); //false
System.out.println(c1.equals(d1)); //true
//cache range exceeds and new object gets created

//Primitive Data Types
int x = 24;
int y = 24;
System.out.println(x == y);

What is the difference between final, finally, and finalize()?
final:
•	It makes variables, methods, or classes unchangeable.
Where used	Meaning	Example
Variable	Value cannot be changed (constant)	final int x = 10;
Method	Cannot be overridden by subclass	final void show() {}
Class	Cannot be inherited	final class Animal {}
finally:
•	It is executed after the try-catch block.
•	It will executes even exception occurs or not occurs.
•	It is used for closing db connections, files.
•	To stop Finally block should use System.exit(0).
finalize:
•	Comes under GC (Garbage Collection)
•	Used for cleaning up the object memory space before it gets destroyed.
•	It got deprecated after Java 9.

Can a Java application be run without installing JRE?
No, because it has the essential tools and libraries the application needs to work.

Is Java 100% object-oriented programming language?
No, because we have primitive data types and static are not treated as objects.

What exactly is System.out.println in Java?
•	System: Is a final class in java.lang package.
•	out: Is a static member of the System class and is an instance of PrintStream.
•	println: Is a method of the PrintStream class used to print to the console.

How Primitive Data Types are stored in memory?
It stores values directly
Local Variable: stores in Stack 
public static void main(String[] args) {
    int a = 10;
}
Stack
-----
a = 10

Instance Variable: stores in Heap
class Student {
    int a = 10;
}

Heap
----
Student object
--------------
a = 10

Static Variable: stores in Method Area
class test {
    static int count = 50;
}

Method Area
----
count = 50

