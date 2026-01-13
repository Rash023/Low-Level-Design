package behavioral_design_patterns.visitor_design_pattern;

public class BillingVisitor implements Visitor{
    @Override
    public void visit(ChildPatient childPatient){
        System.out.println("Billing for the Child patient");
    }

    @Override
    public void visit(AdultPatient adultPatient){
        System.out.println("Billing for the Adult patient");
    }

    @Override
    public void visit(SeniorPatient seniorPatient){
        System.out.println("Billing for the Senior patient");
    }
}
