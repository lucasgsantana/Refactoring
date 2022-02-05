import java.util.Enumeration;

public class HtmlStatement extends Statement {
  public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String content[] = 
      {
        "<H1>Rentals for <EM>",
        "</EM></H1><P>\n",": ","<BR>\n",
        "<P>You owe <EM>","</EM><P>\n",
        "On this rental you earned <EM>",
        "</EM> frequent renter points<P>"
      };
      String result = content[0] + aCustomer.getName() +
      content[1];
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for each rental
         result += each.getMovie().getTitle()+ content[2] +
         String.valueOf(each.getCharge()) + content[3];
      }
      //add footer lines
      result += content[4] +
      String.valueOf(aCustomer.getTotalCharge()) + content[5];
      result += content[6] + 
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      content[7];
      return result;
   }
}