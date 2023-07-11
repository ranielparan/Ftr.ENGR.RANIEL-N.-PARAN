/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ohmslawcalculator;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class calculation extends Ohmslaw {
    
   
    
    public Double resistance(String a, String b, String c) {
        String voltageText = a;
        String currentText = b;
        String resistanceText = c;
        double voltage = Double.parseDouble(voltageText);
        double current = Double.parseDouble(currentText);
        double resistance = voltage / current;
        return resistance;
    }
    
    public Double current(String a, String b, String c) {
        String voltageText = a;
        String currentText = b;
        String resistanceText = c;
        double voltage = Double.parseDouble(voltageText);
        double resistance = Double.parseDouble(resistanceText);
        double current = voltage / resistance;
        return current;
    }
    
    public Double voltage(String a, String b, String c) {
        String voltageText = a;
        String currentText = b;
        String resistanceText = c;
        double current = Double.parseDouble(currentText);
        double resistance = Double.parseDouble(resistanceText);
        double voltage = current * resistance;
        return voltage;
    }
}
