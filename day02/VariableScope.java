package day02;

public class VariableScope {

    static int staticVariable = 10;

    int instanceVariable = 20;

    public void showScope() {

        int localVariable = 30;

        System.out.println("Static Variable: " + staticVariable);
        System.out.println("Instance Variable: " + instanceVariable);
        System.out.println("Local Variable: " + localVariable);
    }

    public static void main(String[] args) {

        VariableScope obj = new VariableScope();

        obj.showScope();

        System.out.println("\nAccessing static variable directly: " + staticVariable);
        System.out.println("Accessing instance variable using object: " + obj.instanceVariable);
    }
}
