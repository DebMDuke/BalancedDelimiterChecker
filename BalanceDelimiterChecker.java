import java.util.Stack;

/**
 * A class that checks whether the parentheses, brackets, and braces
 * in a string occur in left/right pairs.
 */
public class BalanceDelimiterChecker{
  /** Task: Determine whether the parentheses, brackets, and braces
   *        in a string occur in left/right pairs.
   *  @param expression  a string to be checked
   *  @return true if the delimiters are paired correctly */
  public static boolean checkBalance(String expression){
    // assume the expression is balanced
    boolean isBalanced = true;
    // create a stack object

    // examine each character in the list, quit if an imbalance is found

      // read a character

        // if the char is an opening delimiter, push it onto the stack

        // if the char is a closing delimiter...

          // if the stack is empty the expression is not balanced

          // pop the stack and check if the top of stack is a matching delimiter


        // if the character isn't a delimiter, continue the loop


    // after reading all the characters, if the stack isn't empty it's not balance

    return isBalanced;
  }

  /**
   *  Method:  isPaired
   *  Task: Detects whether two delimiters such as are a pair of parentheses ( ),
   *  brackets [ ], or braces { }.
   *  @param  open   a character
   *  @param  close  a character
   *  @return true   if open/close form a pair of parentheses, brackets,or braces
   */
  private static boolean isPaired(char open, char close) {

    return false;
  }

  public static void main(String[] args){
    System.out.println("Test string { [ (  ) ] } ) is balanced?" + checkBalance("{ [ (  ) ] } )"));
    System.out.println("/"{a[b+(c+2)/d]+e)+f}/" is balanced? " + checkBalance("{a[b+(c+2)/d]+e)+f}"));
    System.out.println("/"[a{b/(c-d)+e/f+g)}-h]/" is balanced? " + checkBalance("[a{b/(c-d)+e/f+g)}-h]"));
    System.out.println("/"[a{b+[c(d+e)-f]+g}/" is balanced? " + checkBalance("[a{b+[c(d+e)-f]+g}"));
  }
}
