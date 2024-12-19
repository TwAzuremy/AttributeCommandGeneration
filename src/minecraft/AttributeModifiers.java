package minecraft;

import java.util.List;
import java.util.stream.Collectors;

public class AttributeModifiers {
    private List<Attribute> attributes;

    public AttributeModifiers(Attribute... attributes) {
        this.attributes = List.of(attributes);
    }

    public AttributeModifiers(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "AttributeModifiers: ["+
                attributes.stream().map(Attribute::toString).collect(Collectors.joining(", "))
                + "]";
    }
}
