# Java OOPs and Basic Programs 🚀

This repository contains Java programs that demonstrate core **Object-Oriented Programming (OOP)** concepts along with a collection of **basic utility programs** for beginners. It is designed to provide hands-on examples for learning and revising Java fundamentals.

## 📂 Folder Structure

```
java-Oops/
└── java_new/
    └── src/
        └── com/
            └── java/
                ├── abstraction.java
                ├── encapsulation.java
                ├── inheritance.java
                ├── polymorphism.java
                ├── user_input.java
                └── programes.java
```

## 📘 Topics Covered

### 🔹 OOP Concepts
- ✅ **Abstraction**: Using abstract classes and/or interfaces
- ✅ **Encapsulation**: Using private fields and public getters/setters
- ✅ **Inheritance**: Demonstrating base and derived classes
  
Each file in this section demonstrates one of the four main Object-Oriented Programming principles using Java.

---

#### 🧱 Abstraction (`abstraction.java`)

Demonstrates:
- Abstract classes and methods
- Real-world examples with:
  - `animal` class and subclasses `lion` and `tiger`
  - `shape` class and subclasses `circle`, `Triangle`
  - `Bank` class and subclasses `SavingsAccount`, `CurrentAccount`

Key Concepts:
- Abstract methods must be implemented by subclasses.
- You cannot instantiate abstract classes.

---

#### 🔐 Encapsulation (`encapsulation.java`)

Demonstrates:
- Using private variables and public getters/setters for data hiding
- Examples:
  - `person`, `BankAccount`, `Rectangle`, `Employee`, `Car`, `Student`, and `Circle_` classes

Key Concepts:
- Encapsulation protects internal data by exposing controlled access via getter and setter methods.
- Promotes modularity and maintainability.

---

#### 🧬 Inheritance (`inheritance.java`)

Demonstrates:
- Single-level inheritance with classes `father` → `childern`
- Method overriding with `Animal` and `Cat` classes

Key Concepts:
- Subclasses inherit fields and methods from their parent classes.
- Overriding allows a subclass to provide a specific implementation of a method.

---

#### 🔁 Polymorphism (`polymorphism.java`)

Demonstrates:
- **Compile-time Polymorphism (Method Overloading)** — not present directly but can be extended
- **Run-time Polymorphism (Method Overriding)** using:
  - `Animalfamily` → `bird`, `cat_`
  - `shapes` → `circle_shape`, `rectangle`

Key Concepts:
- Polymorphism allows the same method to behave differently depending on the object calling it.
- Enhances flexibility and reusability of code.

### 🔹 Utility & Practice Programs (in `Programes.java`)
- Coin toss simulation
- Leap year check
- Finding factors of a number
- Quotient and remainder
- Swapping numbers
- Even or odd check
- Vowel or consonant check
- Finding the largest among three numbers
- Printing squares (power of 2)
- Harmonic number series

### 🔹 Input Handling (in `user_input.java`)
The `user_input.java` file demonstrates usage of the `Scanner` class to take various types of user input and perform basic operations like:

- Name confirmation loop
- Sum and product of integers
- Rectangle area calculation
- Printing user profile (name, roll number, interest)
- Square of a number
- Concatenating strings
- Perimeter of a square
- Equality check among three numbers
- Condition checking using `if-else`
- Marks input with validation (max 100 per subject)
- Percentage calculation


## ▶️ How to Run the Programs

1. **Clone the repo**:
   ```bash
   git clone https://github.com/your-username/java-Oops.git
   ```

2. **Navigate to the source folder**:
   ```bash
   cd java-Oops/java_new/src
   ```

3. **Compile and run a Java file**:
   ```bash
   javac com/java/Programs.java
   java com.java.Programs
   ```

> Make sure your terminal is in the `src` directory so the package paths resolve correctly.

## 🧠 Ideal For

- Java beginners learning OOP
- Students practicing for exams or interviews
- Quick revision of Java fundamentals through examples
