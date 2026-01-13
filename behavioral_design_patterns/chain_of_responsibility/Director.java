package behavioral_design_patterns.chain_of_responsibility;

public class Director extends Approver{
    @Override
    public void processLeaveRequest(int leaveDays){
        if(leaveDays<=14){
            System.out.println("Leave Request approved by Director for "+leaveDays);
        }
        else{
            System.out.println("Leave Request Rejected...");
        }
    }
}
