package invoiceItem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

public @AllArgsConstructor
@Getter
@ToString
class InvoiceItem {
    private final String id;
    private final String desc;
    private int qty;
    private double unitPrice;

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return unitPrice * qty;
    }
}
