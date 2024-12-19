import display.Display;
import minecraft.AttributeModifiers;

public class Give {
    private String item;
    private AttributeModifiers attributeModifiers;
    private Display display;

    public Give(String item, AttributeModifiers attributeModifiers, Display display) {
        this.item = item;
        this.attributeModifiers = attributeModifiers;
        this.display = display;
    }

    @Override
    public String toString() {
        return "give @p " + item + "{\n" +
                attributeModifiers +
                ",\n" + display +
                '}';
    }
}
