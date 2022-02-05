import java.util.Enumeration;

public abstract class Statement {
  public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String content[] = Content(aCustomer);
      
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

  public abstract String[] Content(Customer aCustomer);
}