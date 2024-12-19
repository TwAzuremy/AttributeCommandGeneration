package display;

import java.util.List;
import java.util.stream.Collectors;

public class Name {
    List<TextAttributes> character;

    /**
     * Pass in a single or multiple different attributes.
     *
     * @param character Name
     */
    public Name(TextAttributes... character) {
        this.character = List.of(character);
    }

    /**
     * Passing in a list of many different attributes.
     *
     * @param character Name
     */
    public Name(List<TextAttributes> character) {
        this.character = character;
    }

    @Override
    public String toString() {
        return "\"[" +
                character.stream().map(TextAttributes::toString).collect(Collectors.joining(", "))
                + "]\"";
    }
}
