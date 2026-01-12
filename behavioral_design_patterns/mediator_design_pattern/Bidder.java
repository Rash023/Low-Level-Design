package behavioral_design_patterns.mediator_design_pattern;

public class Bidder {
    private String name;
    private AuctionMediator auctionMediator;

    public Bidder(AuctionMediator auctionMediator,String name){
        this.auctionMediator=auctionMediator;
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void placeBid(int amount){
        auctionMediator.placeBid(this,amount);
    }

    public void receiveBid(Bidder bidder,int amount){
        System.out.println(name+" is notified: "+bidder.getName()+" placed a bid of amount "+amount);
    }
}
