package behavioral_design_patterns.visitor_design_pattern;

public interface Patient {
    void accept(Visitor visitor);
}
