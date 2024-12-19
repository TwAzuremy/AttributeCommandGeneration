package minecraft.operation;

public enum OPERATION {
    ADD_VALUE(0),
    ADD_MULTIPLE_VALUE(1),
    ADD_MULTIPLE_TOTAL(2);

    private final int value;

    OPERATION(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
