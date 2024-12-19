package display;

import java.util.List;
import java.util.stream.Collectors;

public class Lore {
    List<TextAttributes> lore;

    /**
     * Pass in a list of lore, each representing a new line.
     * @param lore List of lore, each representing a new line.
     */
    public Lore(List<TextAttributes> lore) {
        this.lore = lore;
    }

    @Override
    public String toString() {
        return "\"" + lore.stream().map(TextAttributes::toString).collect(Collectors.joining("\", \"")) + "\"";
    }
}
