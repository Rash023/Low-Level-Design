package behavioral_design_patterns.chain_of_responsibility;

public class main {
    public static void main(String[] args) {
        Approver supervisor=new Supervisor();
        Approver manager=new Manager();
        Approver director=new Director();

        supervisor.setNextApprover(manager);
        manager.setNextApprover(director);

        supervisor.processLeaveRequest(3);
        supervisor.processLeaveRequest(6);
        supervisor.processLeaveRequest(12);
        supervisor.processLeaveRequest(30);


    }
}
