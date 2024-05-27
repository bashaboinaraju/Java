/*class finalvar{
  public static void main(String[] args) {

    // create a final variable
    int AGE = 32;

    // try to change the final variable
    AGE = 45;
    System.out.println("Age: " + AGE);
  }
}*/


// Final Method Demo
class FinalMeth {
    // create a final method
    public void display() {
      System.out.println("This is a final method.");
    }
}

class Main1 extends FinalMeth {
  // try to override final method
  public void display() {
    System.out.println("The final method is overridden.");
  }

  public static void main(String[] args) {
    Main1 obj = new Main1();
    obj.display();
  }
}





/* create a final class
final class FinalClass {
  public void display() {
    System.out.println("This is a final method.");
  }
}

// try to extend the final class
class Main extends FinalClass {
  public  void display() {
    System.out.println("The final method is overridden.");
  }

  public static void main(String[] args) {
    Main obj = new Main();
    obj.display();
  }
}
*/
