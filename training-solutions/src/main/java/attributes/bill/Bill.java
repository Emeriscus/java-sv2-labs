package attributes.bill;

public class Bill {
    public static void main(String[] args) {

        BillItem billItem = new BillItem("book", 100, 3, 1.27);

        System.out.println(billItem.calculateTotalPrice());


    }
}
