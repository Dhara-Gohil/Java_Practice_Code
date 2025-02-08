package dpack;

import bpack.B;
import cpack.C;

public class protecteddemo {
    public static void main(String[] args) {
        B b1 = new B();
        C c1 = new C();
        System.out.println("Object b display method:");
        b1.display();
        System.out.println("Object c display method:");
        c1.display();
    }
}
