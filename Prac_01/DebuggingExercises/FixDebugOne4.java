import javax.swing.JOptionPane;
public class FixDebugOne4  // change DebugOne4 to FixDebugOne4
{
  public static void main(String[] args)    // missing void
  {
     JOptionPane.showMessageDialog(null, "First GUI program");  // missing inverted commas and wrong sign used (! instead of ;)
  }
}
