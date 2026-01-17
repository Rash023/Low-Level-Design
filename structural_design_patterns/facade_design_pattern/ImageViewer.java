package structural_design_patterns.facade_design_pattern;

public class ImageViewer {
    public void loadImageFile() {
        System.out.println("Image file loaded.");
    }
    public void applyScaling() {
        System.out.println("Image scaled.");
    }
    public void displayImage() {
        System.out.println("Image displayed.");
    }
}