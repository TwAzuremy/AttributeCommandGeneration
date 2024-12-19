package display;

import java.util.List;
import java.util.stream.Collectors;

public class Name extends TextHandler {

    /**
     * Pass in a single or multiple different attributes.
     *
     * @param text Name
     */
    public Name(TextAttributes... text) {
        super(text);
    }

    /**
     * Passing in a list of many different attributes.
     *
     * @param text Name
     */
    public Name(List<TextAttributes> text) {
        super(text);
    }

    @Override
    public String toString() {
        return "\"[" +
                super.text.stream().map(TextAttributes::toString).collect(Collectors.joining(", "))
                + "]\"";
    }
}
