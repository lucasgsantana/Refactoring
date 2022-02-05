import java.util.Enumeration;

public class TextStatement extends Statement {
  public String[] Content(Customer aCustomer) {
      String content[] = 
      {
        "Rental Record for ",
        "\n","\t","\t",
        "\n","Amount owed is ",
        "\n You earned ",
        " frequent renter points"
      };
      return content;
   }
}