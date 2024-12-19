package display;

import java.util.List;

public abstract class TextHandler {
    protected List<TextAttributes> text;

    public TextHandler(List<TextAttributes> text) {
        this.text = text;
    }

    public TextHandler(TextAttributes... text) {
        this.text = List.of(text);
    }

    @Override
    public abstract String toString();
}
