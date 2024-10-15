import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TaxCalculator {

    // Method to calculate tax based on total income (Old Regime)
    public double calculateTaxOld(double totalIncome) {
        double tax = 0.0;

        if (totalIncome <= 250000) {
            tax = 0;
        } else if (totalIncome <= 500000) {
            tax = (totalIncome - 250000) * 0.05;
        } else if (totalIncome <= 1000000) {
            tax = 250000 * 0.05 + (totalIncome - 500000) * 0.2;
        } else {
            tax = 250000 * 0.05 + 500000 * 0.2 + (totalIncome - 1000000) * 0.3;
        }

        return tax;
    }

    // Method to calculate tax based on total income (New Regime)
    public double calculateTaxNew(double totalIncome) {
        double tax = 0.0;

        if (totalIncome <= 300000) {
            tax = 0;
        } else if (totalIncome > 300000 && totalIncome <= 600000) {
            tax = (totalIncome - 300000) * 0.05;
        } else if (totalIncome > 600000 && totalIncome <= 900000) {
            tax = 300000 * 0.05 + (totalIncome - 600000) * 0.1;
        } else if (totalIncome > 900000 && totalIncome <= 1200000) {
            tax = 300000 * 0.05 + 300000 * 0.1 + (totalIncome - 900000) * 0.15;
        } else if (totalIncome > 1200000 && totalIncome <= 1500000) {
            tax = 300000 * 0.05 + 300000 * 0.1 + 300000 * 0.15 + (totalIncome - 1200000) * 0.2;
        } else if (totalIncome > 1500000 && totalIncome <= 1800000) {
            tax = 300000 * 0.05 + 300000 * 0.1 + 300000 * 0.15 + 300000 * 0.2 + (totalIncome - 1500000) * 0.25;
        } else {
            tax = 300000 * 0.05 + 300000 * 0.1 + 300000 * 0.15 + 300000 * 0.2 + 300000 * 0.25 + (totalIncome - 1800000) * 0.3;
        }

        return tax;
    }
}

public class IncomeTaxCalculator {

    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Income Tax Calculator");
        frame.setSize(700, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(240, 248, 255));  // Light blue

        // Create labels and text fields for different income sources
        JLabel salaryLabel = new JLabel("Income from Salary:");
        salaryLabel.setBounds(50, 50, 200, 30);
        salaryLabel.setFont(new Font("Arial", Font.BOLD, 14));
        frame.add(salaryLabel);

        JLabel deductionStandardLabel = new JLabel("Standard Deduction:");
        deductionStandardLabel.setBounds(50, 100, 200, 30);
        frame.add(deductionStandardLabel);

        JTextField deductionStandardField = new JTextField("50000");
        deductionStandardField.setBounds(300, 100, 200, 30);
        frame.add(deductionStandardField);

        JTextField salaryField = new JTextField();
        salaryField.setBounds(300, 50, 200, 30);
        frame.add(salaryField);

        JLabel businessLabel = new JLabel("Income from Business/Profession:");
        businessLabel.setBounds(50, 150, 250, 30);
        businessLabel.setFont(new Font("Arial", Font.BOLD, 14));
        frame.add(businessLabel);

        JTextField businessField = new JTextField();
        businessField.setBounds(300, 150, 200, 30);
        frame.add(businessField);

        JLabel propertyLabel = new JLabel("Income from House Property:");
        propertyLabel.setBounds(50, 200, 250, 30);
        propertyLabel.setFont(new Font("Arial", Font.BOLD, 14));
        frame.add(propertyLabel);

        JTextField propertyField = new JTextField();
        propertyField.setBounds(300, 200, 200, 30);
        frame.add(propertyField);

        JLabel capitalGainLabel = new JLabel("Income from Capital Gains:");
        capitalGainLabel.setBounds(50, 250, 250, 30);
        capitalGainLabel.setFont(new Font("Arial", Font.BOLD, 14));
        frame.add(capitalGainLabel);

        JTextField capitalGainField = new JTextField();
        capitalGainField.setBounds(300, 250, 200, 30);
        frame.add(capitalGainField);

        JLabel otherSourceLabel = new JLabel("Income from Other Sources:");
        otherSourceLabel.setBounds(50, 300, 250, 30);
        otherSourceLabel.setFont(new Font("Arial", Font.BOLD, 14));
        frame.add(otherSourceLabel);

        JTextField otherSourceField = new JTextField();
        otherSourceField.setBounds(300, 300, 200, 30);
        frame.add(otherSourceField);

        // Create deduction labels and text fields for Chapter 4 deductions (only applicable for Old Regime)
        JLabel deductionLabel = new JLabel("Deductions under Chapter 4 (Old Scheme):");
        deductionLabel.setBounds(50, 350, 350, 30);
        deductionLabel.setFont(new Font("Arial", Font.BOLD, 16));
        frame.add(deductionLabel);

        JLabel deduction80CLabel = new JLabel("80C:");
        deduction80CLabel.setBounds(50, 400, 50, 30);
        frame.add(deduction80CLabel);

        JTextField deduction80CField = new JTextField();
        deduction80CField.setBounds(100, 400, 100, 30);
        frame.add(deduction80CField);

        JLabel deduction80CCALabel = new JLabel("80CCA:");
        deduction80CCALabel.setBounds(220, 400, 70, 30);
        frame.add(deduction80CCALabel);

        JTextField deduction80CCAField = new JTextField();
        deduction80CCAField.setBounds(300, 400, 100, 30);
        frame.add(deduction80CCAField);

        JLabel deduction80CCBLabel = new JLabel("80CCD:");
        deduction80CCBLabel.setBounds(420, 400, 70, 30);
        frame.add(deduction80CCBLabel);

        JTextField deduction80CCBField = new JTextField();
        deduction80CCBField.setBounds(500, 400, 100, 30);
        frame.add(deduction80CCBField);

        JLabel deduction80DLabel = new JLabel("80D:");
        deduction80DLabel.setBounds(50, 450, 50, 30);
        frame.add(deduction80DLabel);

        JTextField deduction80DField = new JTextField();
        deduction80DField.setBounds(100, 450, 100, 30);
        frame.add(deduction80DField);

        JLabel deduction80GLabel = new JLabel("80G:");
        deduction80GLabel.setBounds(220, 450, 50, 30);
        frame.add(deduction80GLabel);

        JTextField deduction80GField = new JTextField();
        deduction80GField.setBounds(300, 450, 100, 30);
        frame.add(deduction80GField);

        JLabel deduction80ILabel = new JLabel("80I:");
        deduction80ILabel.setBounds(420, 450, 50, 30);
        frame.add(deduction80ILabel);

        JTextField deduction80IField = new JTextField();
        deduction80IField.setBounds(500, 450, 100, 30);
        frame.add(deduction80IField);

        // Standard deduction text field with default value of 50000
        

        // Create labels for displaying gross total income, total deductions, total income, and tax
        JLabel grossIncomeLabel = new JLabel("Gross Total Income: ₹0");
        grossIncomeLabel.setBounds(50, 550, 300, 30);
        grossIncomeLabel.setFont(new Font("Arial", Font.BOLD, 16));
        frame.add(grossIncomeLabel);

        JLabel totalIncomeLabel = new JLabel("Total Income: ₹0");
        totalIncomeLabel.setBounds(50, 600, 300, 30);
        totalIncomeLabel.setFont(new Font("Arial", Font.BOLD, 16));
        frame.add(totalIncomeLabel);

        JLabel result1 = new JLabel("Health and Educational Cess: ₹0");
        result1.setBounds(50, 650, 300, 30);
        result1.setFont(new Font("Arial", Font.BOLD, 16));
        frame.add(result1);

        JLabel resultLabel = new JLabel("Your Tax: ₹0");
        resultLabel.setBounds(50, 700, 300, 30);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 16));
        frame.add(resultLabel);

        // Create a dropdown for selecting tax regime (Old or New Scheme)
        JLabel schemeLabel = new JLabel("Select Tax Scheme:");
        schemeLabel.setBounds(300, 550, 150, 30);
        frame.add(schemeLabel);

        String[] schemes = {"Old Scheme", "New Scheme"};
        JComboBox<String> schemeComboBox = new JComboBox<>(schemes);
        schemeComboBox.setBounds(450, 550, 150, 30);
        frame.add(schemeComboBox);

        // Add checkbox for government exemption scheme
        JCheckBox exemptionCheckBox = new JCheckBox("Government Exemption");
        exemptionCheckBox.setBounds(300, 600, 300, 30);
        frame.add(exemptionCheckBox);

        // Add action listener for calculating tax when the button is clicked
        JButton calculateButton = new JButton("Calculate Tax");
        calculateButton.setBounds(450, 650, 150, 40);
        frame.add(calculateButton);

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Parse income values
                    double salaryIncome = Double.parseDouble(salaryField.getText().isEmpty() ? "0" : salaryField.getText());
                    double businessIncome = Double.parseDouble(businessField.getText().isEmpty() ? "0" : businessField.getText());
                    double propertyIncome = Double.parseDouble(propertyField.getText().isEmpty() ? "0" : propertyField.getText());
                    double capitalGainIncome = Double.parseDouble(capitalGainField.getText().isEmpty() ? "0" : capitalGainField.getText());
                    double otherIncome = Double.parseDouble(otherSourceField.getText().isEmpty() ? "0" : otherSourceField.getText());
                    double grossTotalIncome = salaryIncome + businessIncome + propertyIncome + capitalGainIncome + otherIncome;

                    // Parse deduction values
                    double deduction80C = Double.parseDouble(deduction80CField.getText().isEmpty() ? "0" : deduction80CField.getText());
                    double deduction80CCA = Double.parseDouble(deduction80CCAField.getText().isEmpty() ? "0" : deduction80CCAField.getText());
                    double deduction80CCB = Double.parseDouble(deduction80CCBField.getText().isEmpty() ? "0" : deduction80CCBField.getText());
                    double deduction80D = Double.parseDouble(deduction80DField.getText().isEmpty() ? "0" : deduction80DField.getText());
                    double deduction80G = Double.parseDouble(deduction80GField.getText().isEmpty() ? "0" : deduction80GField.getText());
                    double deduction80I = Double.parseDouble(deduction80IField.getText().isEmpty() ? "0" : deduction80IField.getText());
                    double standardDeduction = Double.parseDouble(deductionStandardLabel.getText().isEmpty() ? "50000" : deductionStandardLabel.getText());

                    // Calculate total deductions and total income
                    double totalDeductions = deduction80C + deduction80CCA + deduction80CCB + deduction80D + deduction80G + deduction80I + standardDeduction;
                    double totalIncome = grossTotalIncome - totalDeductions;

                    // Update labels with calculated values
                    grossIncomeLabel.setText("Gross Total Income: ₹" + grossTotalIncome);
                    totalIncomeLabel.setText("Total Income: ₹" + totalIncome);

                    // Create TaxCalculator object
                    TaxCalculator taxCalculator = new TaxCalculator();
                    double tax;
                    double taxh;

                    // Determine which scheme is selected and calculate tax accordingly
                    String selectedScheme = (String) schemeComboBox.getSelectedItem();
                    if (selectedScheme.equals("Old Scheme")) {
                        tax = taxCalculator.calculateTaxOld(totalIncome);
                    } else {
                        tax = taxCalculator.calculateTaxNew(grossTotalIncome - standardDeduction); // Deductions do not apply in the New Scheme
                    }

                    boolean flag = false;
                    if (exemptionCheckBox.isSelected()) {
                        if (selectedScheme.equals("Old Scheme") && totalIncome <= 500000) {
                            flag = true;
                        } else if (selectedScheme.equals("New Scheme") && totalIncome <= 700000) {
                            flag = true;
                        }
                    }

                    // Apply government tax exemption if applicable
                    if (flag) {
                        tax = 0;
                    }
                    taxh = 0.04 * tax;
                    tax = tax + taxh;

                    // Display the calculated tax
                    result1.setText("Health and Educational Cess: ₹" + taxh);
                    resultLabel.setText("Your Tax: ₹" + tax);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input. Please enter valid numbers.");
                }
            }
        });

        // Add listener to update standard deduction when salary is entered
        salaryField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!salaryField.getText().isEmpty()) {
                    deductionStandardLabel.setText("50000"); // Set standard deduction to 50000 when salary is entered
                }
            }
        });

        // Make frame visible
        frame.setVisible(true);
    }
}
