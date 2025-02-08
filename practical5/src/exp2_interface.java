interface i1{
}
interface i2{
}
interface i3 extends i1,i2{
}
interface i4{
}
class x implements i3{
}
class w extends x implements i4{
}
public class exp2_interface {
    public static void main(String[] args) {
        w w1 = new w();
        if (w1 instanceof i1) {
            System.out.println("obj is an instance of I1");
        } else {
            System.out.println("obj is not an instance of I1");
        }


        if (w1 instanceof i2) {
            System.out.println("obj is an instance of I2");
        } else {
            System.out.println("obj is not an instance of I2");
        }


        if (w1 instanceof i3) {
            System.out.println("obj is an instance of I3");
        } else {
            System.out.println("obj is not an instance of I3");
        }


        if (w1 instanceof i4) {
            System.out.println("obj is an instance of I4");
        } else {
            System.out.println("obj is not an instance of I4");
        }


        if (w1 instanceof x) {
            System.out.println("obj is an instance of X");
        } else {
            System.out.println("obj is not an instance of X");
        }
    }
}
