# Calculus-1 Derivative Problems & Solutions in Java

This repository contains the software implementation for the **Calculus-1 (Matematik-1)** assignment for the Software Engineering Department at Kırklareli University.

The project demonstrates the solution of **10 distinct derivative problems**, implementing them using Java with an algorithmic mindset rather than simple static calculations.

## 🚀 Overview

This project goes beyond hardcoded answers. It simulates a "computational" approach to solving calculus problems:
* **Step-by-Step Explanations:** The program prints the logic behind each solution (e.g., Chain Rule, Quotient Rule) to the console.
* **Algorithmic Differentiation:** Uses loops and arrays to calculate higher-order derivatives (e.g., calculating the 4th derivative of a polynomial iteratively).
* **Numerical & Analytical Hybrid:** Combines formulaic logic with numerical verification where applicable.

## 📂 Problem List

The code provides solutions for the following mathematical problems:

1.  **General Derivative:** Roots and fractional powers ($f(x) = \sqrt[3]{x^2} - 1/\sqrt{x}$)
2.  **Parametric Derivative:** Finding $dy/dx$ at a specific $t$ point ($x(t)=t^2+1, y(t)=t^3-t$).
3.  **Logarithmic Differentiation:** Handling functions where both base and exponent are variables ($f(x) = x^{\cos(x)}$).
4.  **Tangents & Normals:** Finding roots based on parallel slopes (Application of derivatives).
5.  **Optimization:** Finding the absolute maximum value in a closed interval $[-2, 3]$.
6.  **Quotient Rule:** Differentiation of rational functions ($\frac{u}{v}$).
7.  **Parametric Slope Calculation:** Repeated application of parametric rules for specific points.
8.  **Trigonometric/Logarithmic Derivative:** $f(x) = x^{\sin(x)}$
9.  **Higher Order Derivatives:** A custom algorithm to find the $4^{th}$ derivative of a polynomial ($y = 6x^5 - 8x^4...$).
10. **Exponential Functions:** Derivative at a specific point ($x=0$) for $f(x) = \frac{e^x}{x+1}$.

## 🛠️ Technologies

* **Language:** Java (JDK 8+)
* **Encoding:** UTF-8 (Required for mathematical symbols like `√`, `²`, `³`, `⁵`)
* **Concept:** Functional Programming & Object-Oriented Principles

## 💻 How to Run

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/YOUR_USERNAME/Calculus1-Derivative-Solutions-Java.git](https://github.com/YOUR_USERNAME/Calculus1-Derivative-Solutions-Java.git)
    ```
2.  **Navigate to the project directory:**
    ```bash
    cd Calculus1-Derivative-Solutions-Java
    ```
3.  **Compile the Java file:**
    ```bash
    javac MatematikOdev.java
    ```
4.  **Run the application:**
    ```bash
    java MatematikOdev
    ```

## 📷 Output Preview

When you run the program, it provides a structured, "student-logic" output. Here is an example of the **4th Derivative Algorithm** (Question 9):

```text
[SORU 9] y = 6x⁵ - 8x⁴ + 2x³ - 3x + 5 (4. Türev)
--------------------------------------------------
[Algoritma] Bu soru döngü kullanılarak çözüldü.
            Polinom, bir matris dizisi olarak tanımlandı.
Başlangıç: 6x⁵ - 8x⁴ + 2x³ - 3x + 5 
1. Türev -> 30x⁴ - 32x³ + 6x² - 3 
2. Türev -> 120x³ - 96x² + 12x 
3. Türev -> 360x² - 192x + 12 
4. Türev -> 720x - 192 

[Sonuç Analizi] 4. türev sonunda x'li terim ve sabit sayı kalmıştır.
>>> CEVAP: 720x - 192
==================================================
