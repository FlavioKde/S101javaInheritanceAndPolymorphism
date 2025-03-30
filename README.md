# S101javaInheritanceAndPolymorphism

## 📄 Description - Exercise Statement
This repository contains several programming exercises focused on practicing Object-Oriented Programming (OOP) concepts in Java. The exercises involve implementing different classes, inheritance, abstract methods, interfaces, and static elements.

### **Level 1**
#### **Exercise 1**
A music group has different types of musical instruments: wind, string, and percussion.
- All instruments have attributes: name and price.
- They have an abstract method `play()`, implemented in the subclasses:
  - Wind instruments: "A wind instrument is playing."
  - String instruments: "A string instrument is playing."
  - Percussion instruments: "A percussion instrument is playing."

Additionally, demonstrate that a class is loaded only once and how it can be triggered either by creating an instance or accessing a static member.

#### **Exercise 2**
Create a `Car` class with:
- **Attributes:**
  - `brand` (static final)
  - `model` (static)
  - `power` (final)
- Demonstrate the differences between these attributes and which can be initialized in the constructor.
- Implement two methods:
  - `brake()`: A static method printing "The vehicle is braking."
  - `accelerate()`: A non-static method printing "The vehicle is accelerating."
- Show how to call both methods from the `main()` method.

### **Level 2**
#### **Exercise 1**
Create a `Phone` class with attributes `brand` and `model`, and a method `call(String number)`, which prints "Calling [number]".

Create two interfaces:
- `Camera`: Contains a method `takePhoto()` printing "A photo is being taken."
- `Watch`: Contains a method `alarm()` printing "The alarm is ringing."

Create a `Smartphone` class that extends `Phone` and implements both interfaces. Instantiate a `Smartphone` in `main()` and call all its methods.

### **Level 3**
#### **Exercise 1**
A sports news editorial has categorized news articles by sport: football, basketball, tennis, F1, and motorcycling.

- **Editors** have attributes: `name`, `DNI` (cannot change), and `salary` (initially 1500€, applies equally to all editors).
- **News articles** have: `headline`, `text` (initially empty), `score`, and `price`.

##### **News Pricing Rules:**
- **Football:** Base price: 300€, Champions League: +100€, Barcelona or Madrid: +100€, Ferran Torres or Benzema: +50€.
- **Basketball:** Base price: 250€, EuroLeague: +75€, Barcelona or Madrid: +75€.
- **Tennis:** Base price: 150€, Federer, Nadal, or Djokovic: +100€.
- **F1:** Base price: 100€, Ferrari or Mercedes: +50€.
- **Motorcycling:** Base price: 100€, Honda or Yamaha: +50€.

##### **News Scoring Rules:**
- **Football:** Base: 5 points, Champions League: +3, League: +2, Barcelona/Madrid: +1, Ferran Torres/Benzema: +1.
- **Basketball:** Base: 4 points, EuroLeague: +3, ACB: +2, Barcelona/Madrid: +1.
- **Tennis:** Base: 4 points, Federer/Nadal/Djokovic: +3.
- **F1:** Base: 4 points, Ferrari/Mercedes: +2.
- **Motorcycling:** Base: 3 points, Honda/Yamaha: +3.

##### **Menu Options:**
1. Add an editor.
2. Remove an editor.
3. Add a news article to an editor.
4. Remove a news article (by editor and headline).
5. Show all news articles per editor.
6. Calculate news score.
7. Calculate news price.

---

## 💻 Technologies Used
- Java 17+
- IntelliJ IDEA / Eclipse
- Git & GitHub
- Object-Oriented Programming (OOP)
- Interfaces and Abstract Classes

---

## 📋 Requirements
- Java Development Kit (JDK) 17+
- IntelliJ IDEA / Eclipse (optional)
- Git installed (optional for version control)

---

## 🛠️ Installation
1. Clone the repository:
   ```sh
   git clone https://github.com/your-username/S101javaInheritanceAndPolymorphism
   ```
2. Open the project in IntelliJ IDEA or Eclipse.
3. Ensure Java 17+ is installed.

---

## ▶️ Execution
1. Compile and run the `Main` class.
2. Follow the console menu instructions.

---

## 🌐 Deployment
This is a console-based Java project, so deployment is not required. However, it can be packaged as a `.jar` file and executed on any machine with Java installed:
```sh
javac Main.java
java Main
```

---

## 🤝 Contributions
Contributions are welcome! To contribute:
1. Fork the repository.
2. Create a new branch (`feature-new`).
3. Commit your changes (`git commit -m 'Added a new feature'`).
4. Push to your branch (`git push origin feature-new`).
5. Create a Pull Request.

---

### **Objectives**
- Learn and apply Object-Oriented Programming (OOP) principles in Java.
- Practice working with inheritance, interfaces, abstract classes, and static methods.
- Develop a structured and modular Java application.


