### AppWorks School Android Class Remote Assignment W3

##### 1. What is ​**Encapsulation**​? Try to list out the benefits of Encapsulation.

Encapsulation in definition is a Capsule which contain variables and functions.

- Reduce the complicity of code

- Increase the reusability of code 

- Reduce the possibility of human error

- Protects an Object from unwanted access by clients

- Make the code more easy to understand. 

##### 2. Try to explain what is ​**enum**​ and why we use them.

Enum is a data type which allows a variable to hold a value only from a set of predefined constants. The common usage is to represent different types of one object.
Enum provides a more clean and readable code, when an object has multiple types, it is much more easy to read with a concise value.

##### 3. How to use ​**enum**​ in Kotlin? Attach a sample code that use enum in Kotlin.

enum class LastName {
	Wong, Lee, Sun, Chen
}

enum class Number(val arabicNumber: Int) {
	One(1), 
	Two:(2), 
	Three:(3)
}
##### 4. What are the ​differences​ between ​**LinearLayout**​ and ​**RelativeLayout**​? Try to explain in details.

- Linear Layout can align views one by one, both vertically and horizontally (puts every child, one after another within a line)

- Relative Layout is based on the relationships( Parent, child ) of views

##### 5. Try to explain the benefits of ​**ConstraintLayout**​. Why you should use it?

The main advantage of Constraint Layout is it allows you to make large and complex layouts with a NO nested flat view hierarchy. By using define position based relationship between different views found  in the layout.
ConstraintLayout is actually a upgraded version of RelativeLayout but with a better performance (Solving the major problem of double taxation), it is more free and easy to arrange a complex UI layout.
