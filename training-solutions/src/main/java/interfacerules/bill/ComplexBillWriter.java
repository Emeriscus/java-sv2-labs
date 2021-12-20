package interfacerules.bill;

import java.util.List;

public class ComplexBillWriter implements BillWriter {

    @Override
    public String writeBill(List<String> billItems) {
        StringBuilder sb = new StringBuilder();
        for (String actual : billItems) {
            String[] parts = actual.split(";");
            sb.append(parts[0] + "; darabszám: " + parts[2] + ", egységár: " + parts[1] + ", összesen: "
                    + Integer.parseInt(parts[1]) * Integer.parseInt(parts[2]) + " Ft\n");
        }
        return sb.toString();
    }
}
