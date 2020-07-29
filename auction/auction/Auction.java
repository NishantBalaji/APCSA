import java.util.ArrayList;

/**
 * A simple model of an auction.
 * The auction maintains a list of lots of arbitrary length.
 *
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 */
public class Auction
{
    // The list of Lots in this auction.
    private ArrayList<Lot> lots;
    // The number that will be given to the next lot entered
    // into this auction.
    private int nextLotNumber;

    /**
     * Create a new auction.
     */
    public Auction()
    {
        lots = new ArrayList<>();
        nextLotNumber = 1;
    }

    /**
     * Enter a new lot into the auction.
     * @param description A description of the lot.
     */
    public void enterLot(String description)
    {
        lots.add(new Lot(nextLotNumber, description));
        nextLotNumber++;
    }

    /**
     * Show the full list of lots in this auction.
     */
    public void showLots()
    {
        for(Lot lot : lots) {
            System.out.println(lot.toString());
        }
    }
    
    /**
     * Make a bid for a lot.
     * A message is printed indicating whether the bid is
     * successful or not.
     * 
     * @param lotNumber The lot being bid for.
     * @param bidder The person bidding for the lot.
     * @param value  The value of the bid.
     */
    public void makeABid(int lotNumber, Person bidder, long value)
    {
        Lot selectedLot = getLot(lotNumber);
        if(selectedLot != null) {
            Bid bid = new Bid(bidder, value);
            boolean successful = selectedLot.bidFor(bid);
            if(successful) {
                System.out.println("The bid for lot number " +
                                   lotNumber + " was successful.");
            }
            else {
                // Report which bid is higher.
                Bid highestBid = selectedLot.getHighestBid();
                System.out.println("Lot number: " + lotNumber +
                                   " already has a bid of: " +
                                   highestBid.getValue());
            }
        }
    }

    /**
     * Return the lot with the given number. Return null
     * if a lot with this number does not exist.
     * @param lotNumber The number of the lot to return.
     */
    public Lot getLot(int lotNumber)
    {
        for(Lot lot : lots){
            if(lot.getNumber() == lotNumber){
                System.out.println(lot);
                return lot;
            }
        }
        System.out.println("Lot number: " + lotNumber +
                               " does not exist.");
            return null;
    }
    public void close() {
        for(Lot lot : lots) {
            if(lot.getHighestBid() != null){
                System.out.println("Lot " + lot.getNumber() + 
                " is sold to " + lot.getHighestBid().getBidder().getName() + " . " + 
                "Here is the description: " + lot.toString());
            }
            else{
                System.out.println("Lot " + lot.getNumber() + " is not sold yet.");
            }   
        }   
    }
    public ArrayList<Lot> getUnsold(){
        ArrayList<Lot> unsoldLots = new ArrayList<>();
        for(Lot lot : lots) {
            if(lot.getHighestBid() == null){
                unsoldLots.add(lot);
            }
        }
        return unsoldLots;
    }
    public Lot removeLot(int number){
      for(int j = 0; j <lots.size(); j++){
          if(lots.get(j).getNumber() == number)
          {
          System.out.println("Lot "  + number + " was removed.");
          lots.remove(j);
          return lots.get(j);
        }
    }
        return null;
    }
}