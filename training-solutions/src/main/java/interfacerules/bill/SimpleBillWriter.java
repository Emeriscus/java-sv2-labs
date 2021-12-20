package interfacerules.bill;

import java.util.List;

public class SimpleBillWriter implements BillWriter {

    @Override
    public String writeBill(List<String> billItems) {
        StringBuilder sb = new StringBuilder();
        for (String actual : billItems) {
            String[] parts = actual.split(";");
            sb.append(parts[0] + ", " + parts[2] + " * " + parts[1] + " = "
                    + Integer.parseInt(parts[1]) * Integer.parseInt(parts[2]) + " Ft\n");
        }
        return sb.toString();
    }
}
