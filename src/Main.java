public class Main {

  public static void main(String[] args) {
    System.out.println((Main.class.getSimpleName() + ".class").toString());
    System.out.println(Main.class.getResource(Main.class.getSimpleName() + ".class").toString());
  }
}
