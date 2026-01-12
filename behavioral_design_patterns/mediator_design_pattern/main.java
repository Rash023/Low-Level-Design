package behavioral_design_patterns.mediator_design_pattern;

public class main {
    public static void main(String[] args) {
        AuctionHouse auctionHouse=new AuctionHouse();
        Bidder bidder1=new Bidder(auctionHouse,"Alice");
        Bidder bidder2=new Bidder(auctionHouse,"Bob");

        auctionHouse.registerBidder(bidder1);
        auctionHouse.registerBidder(bidder2);

        auctionHouse.placeBid(bidder1,100);
        auctionHouse.placeBid(bidder2,200);
        auctionHouse.placeBid(bidder1,150);
        auctionHouse.placeBid(bidder1,201);


    }
}
