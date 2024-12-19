import display.Display;
import display.Lore;
import display.Name;
import display.TextAttributes;
import minecraft.Attribute;
import minecraft.AttributeModifiers;
import minecraft.attribute.ATTRIBUTES;
import minecraft.slot.SLOT;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // e.g
        AttributeModifiers attributeModifiers = new AttributeModifiers(
                new Attribute(1f, SLOT.HEAD, ATTRIBUTES.MAX_HEALTH)
        );

        Display display = new Display(
                new Name(new TextAttributes("Hello")),
                new Lore(List.of(
                        new TextAttributes("Hello"),
                        new TextAttributes("World")
                ))
        );

        Give command = new Give("minecraft:netherite_helmet", attributeModifiers, display);

        System.out.println(command);
    }
}