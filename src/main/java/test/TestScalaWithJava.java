package test;

//我们可以理解scala 在运行时，做了一个包装.
public class TestScalaWithJava {

        public static void main(String[] paramArrayOfString) {
            //TestScala..MODULE$.main(paramArrayOfString);
            TestScalaWithJava$.MODULE$.main(paramArrayOfString);
        }
}

final class TestScalaWithJava$ {
    public static final TestScalaWithJava$  MODULE$;

    static
    {
        MODULE$ = new TestScalaWithJava$();
    }

    public void main(String[] args)
    {
        System.out.println("hello,scala, idea...");

    }
    //private TestScala$() { MODULE$ = this; }

}