package behavioral_design_patterns.mediator_design_pattern;

public interface AuctionMediator {
    void registerBidder(Bidder bidder);
    void placeBid(Bidder bidder,int amount);
}
