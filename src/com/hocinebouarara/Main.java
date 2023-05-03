package com.hocinebouarara;

public class Main {

    public static void main(String[] args) {

//        TextBox textBox1 = new TextBox();
//        textBox1.setText("fist name textBox");
//        System.out.println(textBox1.text.toUpperCase());
//
//        TextBox textBox2 = new TextBox();
//        textBox2.setText("last name textBox");

        Employee employee = new  Employee();
        employee.setBaseSalary(-1);
        employee.setHourlyRate(20);
        int wage = employee.calculateWage(10);

        System.out.println(wage);




    }
}
