/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fj.ohsmlawcalc;
     
        
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author raniel
 */

  
public class OhmsLawCalculator extends JFrame {

    private JTextField voltageField;
    private JTextField currentField;
    private JTextField resistanceField;
    private JButton calculateButton;

    public OhmsLawCalculator() {
        setTitle("Ohm's Law Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel voltageLabel = new JLabel("Voltage (V): ");
        voltageField = new JTextField();
        JLabel currentLabel = new JLabel("Current (I): ");
        currentField = new JTextField();
        JLabel resistanceLabel = new JLabel("Resistance (R): ");
        resistanceField = new JTextField();
        calculateButton = new JButton("Calculate");

        panel.add(voltageLabel);
        panel.add(voltageField);
        panel.add(currentLabel);
        panel.add(currentField);
        panel.add(resistanceLabel);
        panel.add(resistanceField);
        panel.add(new JLabel()); // Empty label for spacing
        panel.add(calculateButton);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        });

        add(panel);
    }

    private void calculate() {
        String voltageText = voltageField.getText();
        String currentText = currentField.getText();
        String resistanceText = resistanceField.getText();

        try {
            if (!voltageText.isEmpty() && !currentText.isEmpty()) {
                double voltage = Double.parseDouble(voltageText);
                double current = Double.parseDouble(currentText);
                double resistance = voltage / current;
                resistanceField.setText(String.valueOf(resistance));
            } else if (!voltageText.isEmpty() && !resistanceText.isEmpty()) {
                double voltage = Double.parseDouble(voltageText);
                double resistance = Double.parseDouble(resistanceText);
                double current = voltage / resistance;
                currentField.setText(String.valueOf(current));
            } else if (!currentText.isEmpty() && !resistanceText.isEmpty()) {
                double current = Double.parseDouble(currentText);
                double resistance = Double.parseDouble(resistanceText);
                double voltage = current * resistance;
                voltageField.setText(String.valueOf(voltage));
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input! Please enter numbers only.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new OhmsLawCalculator().setVisible(true);
            }
        });
    }
}