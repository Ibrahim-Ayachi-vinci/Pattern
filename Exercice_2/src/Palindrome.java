public class Palindrome implements Strategy{

  @Override
  public boolean estValide(String mot) {
    if (mot == null)
      return false;
    StringBuffer stringbuffer = new StringBuffer(mot);
    return mot.equals(stringbuffer.reverse().toString());
  }
}
