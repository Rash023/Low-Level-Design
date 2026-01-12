package behavioral_design_patterns.mediator_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class AuctionHouse implements AuctionMediator{
    private List<Bidder> bidders=new ArrayList<>();
    private int amount=0;
    public void registerBidder(Bidder bidder){
        bidders.add(bidder);
    }

    public void placeBid(Bidder bidder,int amount){
        if(amount<this.amount){
            System.out.println("Unable to place bid, smaller than current price!");
            return;
        }
        System.out.println(bidder.getName()+" placed a bid of amount "+amount);
        this.amount=amount;
        for(Bidder b:bidders){
            if(b!=bidder){
                b.receiveBid(bidder,amount);
            }
        }
    }
}
