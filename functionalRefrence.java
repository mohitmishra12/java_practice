class mynewclass{
  public void mymethod(){
      System.out.println("hello new world .... how are you");

    }
}
public class functionalRefrence {
    public static void main(String[] args) {
        mynewclass yess = new mynewclass();
        Runnable y = yess::mymethod;
        y.run();

    }
}
