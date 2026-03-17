package LAB7;

/*
Q.5)Suppose it is required to build a project consisting of a number of classes possibly using a large number of
programmers.It is necessary to make sure that every class from whih all the other classes in the project will be
inherited .Since any new classes in the project must inherit from the base class .Programmers are not free to
create any interface.Therefore,it can be guaranted that all the classes in the project will respond to the same
debugging commands.
*/

abstract class ProjectBase
{
    void debug()
    {
        System.out.println("Debugging information displayed.");
    }

    abstract void execute();
}

class ModuleA extends ProjectBase
{
    void execute()
    {
        System.out.println("Executing Module A");
    }
}

class ModuleB extends ProjectBase
{
    void execute()
    {
        System.out.println("Executing Module B");
    }
}

public class L75 
{
    public static void main(String[] args)
    {
        ProjectBase obj1 = new ModuleA();
        ProjectBase obj2 = new ModuleB();

        obj1.execute();
        obj1.debug();

        System.out.println();

        obj2.execute();
        obj2.debug();
    }
}







