package test;

/**
 * @program: scalastudy
 * @package: test
 * @filename: A.java
 * @create: 2020/10/08 18:28
 * @author: 29314
 * @description: .
 **/

public class A implements B{
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public int getP() {
        return 0;
    }
}
