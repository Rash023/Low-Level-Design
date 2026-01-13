package behavioral_design_patterns.visitor_design_pattern;

public interface Visitor {

    void visit(ChildPatient patient);
    void visit(AdultPatient patient);

    void visit(SeniorPatient patient);

}
