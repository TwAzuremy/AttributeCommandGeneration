package display;

import display.color.COLOR;

public class TextAttributes {
    private String text;
    // Minecraft defaults
    private Boolean bold = false;
    private String color;
    // Minecraft defaults
    private Boolean italic = true;

    /**
     * Set the item name, and the rest of the properties are the default values.
     * @param text Item name
     */
    public TextAttributes(String text) {
        this.text = text;
    }

    /**
     * Set the name attribute.
     * @param text Item name
     * @param bold Bold of the font, default is false
     * @param color Color of the font, the structure is hexadecimal, e.g. #FFFFFF.
     * @param italic Italic of the font, default is true
     */
    public TextAttributes(String text, Boolean bold, String color, Boolean italic) {
        this.text = text;
        this.bold = bold;
        this.color = color;
        this.italic = italic;
    }

    /**
     * Set the name attribute.
     * @param text Item name
     * @param bold Bold of the font, default is false
     * @param color Color of the font, Use the enum COLOR.
     * @param italic Italic of the font, default is true
     */
    public TextAttributes(String text, Boolean bold, COLOR color, Boolean italic) {
        this.text = text;
        this.bold = bold;
        this.color = color.toString();
        this.italic = italic;
    }

    @Override
    public String toString() {
        return "{" +
                "\\\"text\\\": \\\"" + text + "\\\"" +
                (bold ? ", \\\"bold\\\": true" : "") +
                ((color != null && !color.isEmpty()) ? ", \\\"color\\\": \\\"" + color + "\\\"" : "") +
                (!italic ? ", \\\"italic\\\": false" : "") +
                "}";
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setBold(Boolean bold) {
        this.bold = bold;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setColor(COLOR color) {
        this.color = color.toString();
    }

    public void setItalic(Boolean italic) {
        this.italic = italic;
    }
}
