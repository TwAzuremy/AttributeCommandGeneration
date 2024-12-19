package display;

public class Display {
    private final Name name;
    private final Lore lore;

    public Display(Name name, Lore lore) {
        this.name = name;
        this.lore = lore;
    }

    @Override
    public String toString() {
        return "display: {" +
                "\n\tName: " + name +
                ",\n\tLore: [" + lore + "]" +
                "\n}";
    }
}
