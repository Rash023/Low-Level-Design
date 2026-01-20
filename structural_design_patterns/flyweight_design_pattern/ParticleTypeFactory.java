package structural_design_patterns.flyweight_design_pattern;

import java.util.HashMap;
import java.util.Map;

public class ParticleTypeFactory {
    private Map<String, ParticleType> particleTypes = new HashMap<>();
    public ParticleType getParticleType(String color, String sprite) {
        String key = color + "_" + sprite;
        return particleTypes.computeIfAbsent(key,
                k -> new ParticleType(color, sprite));
    }
}