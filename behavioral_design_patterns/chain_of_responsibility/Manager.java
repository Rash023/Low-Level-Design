package behavioral_design_patterns.chain_of_responsibility;

public class Manager extends Approver{

    @Override
    public void processLeaveRequest(int leaveDays){
        if(leaveDays<=7){
            System.out.println("Leave Request approved by Manager for "+leaveDays);
        }
        else{
            nextApprover.processLeaveRequest(leaveDays);
        }
    }
}
