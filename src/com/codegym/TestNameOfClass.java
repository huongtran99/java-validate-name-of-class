package com.codegym;

public class TestNameOfClass {

    private static NameOfClass nameOfClass;

    public static final String[] validNameOfClass = new String[] { "C0318G" };
    public static final String[] invalidNameOfClass = new String[] { "M0318G", "P0323A" };

    public static void main(String args[]) {
        nameOfClass = new NameOfClass();
        for (String name : validNameOfClass) {
            boolean isvalid = nameOfClass.validate(name);
            System.out.println("NameOfClass is " + name +" is valid: "+ isvalid);
        }
        for (String name : invalidNameOfClass) {
            boolean isvalid = nameOfClass.validate(name);
            System.out.println("NameOfClass is " + name +" is valid: "+ isvalid);
        }
    }

}
