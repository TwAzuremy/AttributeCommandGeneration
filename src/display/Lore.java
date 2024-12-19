package display;

import java.util.List;
import java.util.stream.Collectors;

public class Lore extends TextHandler {

    /**
     * Pass in a list of lore, each representing a new line.
     * @param text List of lore, each representing a new line.
     */
    public Lore(List<TextAttributes> text) {
        super(text);
    }

    @Override
    public String toString() {
        return "\"" + super.text.stream().map(TextAttributes::toString).collect(Collectors.joining("\", \"")) + "\"";
    }
}
