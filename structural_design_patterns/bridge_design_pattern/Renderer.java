package structural_design_patterns.bridge_design_pattern;

public interface Renderer {
    void renderCircle(double radius);
    void renderRectangle(double width, double height);
}