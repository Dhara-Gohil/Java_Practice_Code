
    interface Animal{
        // Default method
        default void say(){
            System.out.println("Hello, this is default method");
        }
        // Abstract method
        void bark();
    }
    public class interface1 implements Animal{

        @Override
        public void bark() {
            System.out.println("Dog barks!");
        }
        public static void main(String[] args) {
            interface1 obj1 = new interface1();
            obj1.bark();
            obj1.say();

        }


    }

