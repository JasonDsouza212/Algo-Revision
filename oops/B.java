package oops;

abstract public class B extends A {
     int m;

    public B(int m) {
        this.m = m;
    }

    @Override

    void print() {
        System.out.println("Im in B");
    }

}
