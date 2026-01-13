package behavioral_design_patterns.visitor_design_pattern;

public class DiagnosisVisitor implements Visitor{
    @Override
    public void visit(ChildPatient childPatient){
        System.out.println("Diagnosing Child patient");
    }

    @Override
    public void visit(AdultPatient adultPatient){
        System.out.println("Diagnosing Adult patient");
    }

    @Override
    public void visit(SeniorPatient seniorPatient){
        System.out.println("Diagnosing Senior patient");
    }


}
