package behavioral_design_patterns.visitor_design_pattern;

public class main {
    public static void main(String[] args) {
        Patient[] patients = {
                new ChildPatient(), new AdultPatient(), new SeniorPatient()};
        Visitor diagnosisVisitor=new DiagnosisVisitor();
        Visitor billingVisitor=new BillingVisitor();

        for (Patient patient : patients) {
            patient.accept(diagnosisVisitor);
            patient.accept(billingVisitor);
        }


    }
}
