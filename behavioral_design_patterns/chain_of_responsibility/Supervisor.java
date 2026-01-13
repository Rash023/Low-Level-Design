package behavioral_design_patterns.chain_of_responsibility;

public class Supervisor extends Approver{
    @Override
    public void processLeaveRequest(int leaveDays){
        if(leaveDays<=3){
            System.out.println("Leave request approved by Supervisor for "+leaveDays);
        }
        else{
            nextApprover.processLeaveRequest(leaveDays);
        }
    }
}
