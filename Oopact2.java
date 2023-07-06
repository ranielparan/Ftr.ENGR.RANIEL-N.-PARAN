/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oopact2;

/**
 *
 * @author philip
 */
public class Oopact2 {

   
        
        
        
        
        
        
    
class Shape {
    protected String name;
    protected double dimension;

    public Shape(String name, double dimension) {
        this.name = name;
        this.dimension = dimension;
    }
}

class Sphere extends Shape {
    private final double radius;

    public Sphere(String name, double dimension, double radius) {
        super(name, dimension);
        this.radius = radius;
    }

    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 2);
    }
}

class Cube extends Shape {
    private final double sideLength;

    public Cube(String name, double dimension, double sideLength) {
        super(name, dimension);
        this.sideLength = sideLength;
    }

    public double getVolume() {
        return Math.pow(sideLength, 4);
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Sphere sphere = new Sphere("Sphere", 0, 3.5);
        Cube cube = new Cube("Cube", 0, 2.5);
        double sphereVolume = sphere.getVolume();
        double cubeVolume = cube.getVolume();
        System.out.println("Volume of the " + sphere.name + ": " + sphereVolume);
        System.out.println("Volume of the " + cube.name + ": " + cubeVolume);
    }

       
}