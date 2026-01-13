package behavioral_design_patterns.visitor_design_pattern;

public class AdultPatient implements Patient{
    @Override
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
