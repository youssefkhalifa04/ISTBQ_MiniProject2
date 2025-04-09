package org.example;

public class MyClass {
    public boolean exist(int a, String[] list) {
        for (String i : list) {
            try {
                if (Integer.parseInt(i) == a) {
                    return true;
                }
            } catch (NumberFormatException e) {
                //nothing
            }
        }
        return false;
    }
}
