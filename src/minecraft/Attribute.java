package minecraft;

import minecraft.attribute.ATTRIBUTES;
import minecraft.operation.OPERATION;
import minecraft.slot.SLOT;
import minecraft.uuid.UUIDGenerator;

public class Attribute {
    private OPERATION operation;
    private float amount;
    private String UUID;
    private SLOT slot;
    private ATTRIBUTES attributeName;

    public Attribute(OPERATION operation, float amount, String UUID, SLOT slot, ATTRIBUTES attributeName) {
        this.operation = operation;
        this.amount = amount;
        this.slot = slot;
        this.attributeName = attributeName;
        this.UUID = UUID;
    }

    public Attribute(float amount, SLOT slot, ATTRIBUTES attributeName) {
        this.operation = OPERATION.ADD_VALUE;
        this.amount = amount;
        this.slot = slot;
        this.attributeName = attributeName;
        this.UUID = UUIDGenerator.getUUIDByUrl();
    }

    @Override
    public String toString() {
        return "{" +
                "\n\tOperation: " + operation.getValue() +
                ", \n\tAmount: " + amount +
                ", \n\tUUID: " + UUID +
                ", \n\tSlot: \"" + slot.toString().toLowerCase() + "\"" +
                ", \n\tAttributeName: \"generic." + attributeName.toString().toLowerCase() + "\"" +
                "\n}";
    }
}
