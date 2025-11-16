# Kotlin Employee Salary Calculation
🧑‍💼 OOP | Inheritance | Polymorphism | mapOf

![Kotlin](https://img.shields.io/badge/Kotlin-1.9-blue?logo=kotlin&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen)
![License](https://img.shields.io/badge/License-MIT-lightgrey)

---

## 🚀 Overview
This Kotlin program demonstrates **object-oriented programming** concepts:

- Base class `Employee`
- Subclasses: `FullTimeEmployee` and `PartTimeEmployee`
- Salary calculation using method overriding
- Storing multiple employees in a `mapOf` and iterating through them

---

## 🧩 Features
- **Full-Time Employee:** base salary + bonus
- **Part-Time Employee:** hourly rate × hours worked
- Uses **mapOf** to store employees and their objects
- Prints each employee’s salary clearly

---

## 🏃 How to Run
### Kotlin Playground:
1. Go to https://play.kotlinlang.org
2. Paste code from `Main.kt`
3. Click **Run**

### Local Compiler:
```bash
kotlinc Main.kt -include-runtime -d app.jar
java -jar app.jar
