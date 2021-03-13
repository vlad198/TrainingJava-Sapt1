package invoiceItem;

public class Main {
    public static void main(String[] args) {
        InvoiceItem invoiceItem = new InvoiceItem("123", "lorem ipsum", 100, 5);
        System.out.println(invoiceItem);

        System.out.println("invoiceItem qty : " + invoiceItem.getQty());
        invoiceItem.setQty(50);
        System.out.println("invoiceItem qty : " + invoiceItem.getQty());

        System.out.println("Total : " + invoiceItem.getTotal());
    }
}
