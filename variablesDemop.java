public class variablesDemop {
    int instanceVar=10;
    static String staticVar="I am static";
    public void showVariables()
    {
        int localVar=5;
        system.out.println("Instance Variable:"+instanceVar);
        syatem.out.println("Static Variable:"+localVar);
    }
    public static void main(string[] args)
    {
        VariablesDemo obj1=new VariablesDemo();
        obj1.showVariables();
        System.out.println("Accessing Static Variable via class:"+VariablesDemo.staticVar);
    }
}