package behavioral_design_patterns.chain_of_responsibility;

public abstract class Approver {
    protected Approver nextApprover;

    public void setNextApprover(Approver approver){
        this.nextApprover=approver;
    }

    abstract void processLeaveRequest(int leaveDays);

}
