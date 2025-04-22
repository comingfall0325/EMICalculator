# 📊 EMI Calculator

This is a simple Java program that calculates the **Equated Monthly Installment (EMI)** for a loan based on the loan amount, annual interest rate, and loan tenure in years.

## 🚀 Features

- Takes input from the user via the command line.
- Calculates the monthly EMI using standard financial formulas.
- Outputs the monthly payment amount in USD.

## 🧮 Formula Used

\[
EMI = \frac{P \times R \times (1 + R)^N}{(1 + R)^N - 1}
\]

Where:
- **P** = Principal loan amount  
- **R** = Monthly interest rate  
- **N** = Loan tenure in months  

## 🛠️ How to Run

1. Make sure you have Java installed on your system.
2. Compile the program:
   ```bash
   javac EMICalculator.java
   ```
3. Run the program:
   ```bash
   java day4.EMICalculator
   ```

## 🧾 Sample Input/Output

```
Enter loan amount in USD
50000
Enter annual interest rate (in %)
7.5
Enter loan tenure in years
5
Your monthly payment is: 1001.90
```

## 📁 File Structure

```
day4/
├── EMICalculator.java
```

## 📌 Notes

- Interest rate should be entered in annual percentage form (e.g., 7.5 for 7.5%).
- Output EMI is a floating-point value, formatted to a few decimal places.
- This program does not handle input validation or edge cases like zero interest rate.

