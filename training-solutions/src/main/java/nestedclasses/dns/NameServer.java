package nestedclasses.dns;

import java.util.ArrayList;
import java.util.List;

public class NameServer {

    private List<DnsEntry> dnsEntries = new ArrayList<>();

    public static class DnsEntry {

        private String hostName;
        private String hostIp;

        public DnsEntry(String hostName, String hostIp) {
            this.hostName = hostName;
            this.hostIp = hostIp;
        }

        public String getHostName() {
            return hostName;
        }

        public String getHostIp() {
            return hostIp;
        }
    }

    public void addEntry(String hostName, String hostIp) {
        if (isEntryExist(hostName, hostIp)) {
            throw new IllegalArgumentException("Already exists");
        }
        dnsEntries.add(new DnsEntry(hostName, hostIp));
    }

    private boolean isEntryExist(String hostName, String hostIp) {
        for (DnsEntry actual : dnsEntries) {
            if (hostName.equals(actual.hostName) || hostIp.equals(actual.hostIp)) {
                return true;
            }
        }
        return false;
    }

    public void removeEntryByName(String hostName) {
        DnsEntry result = getEntryByName(hostName);
        dnsEntries.remove(result);
    }

    private DnsEntry getEntryByName(String hostName) {
        for (DnsEntry actual : dnsEntries) {
            if (hostName.equals(actual.hostName)) {
                return actual;
            }
        }
        return null;
    }

    public void removeEntryByIp(String hostIp) {
        DnsEntry result = getEntryByIp(hostIp);
        dnsEntries.remove(result);
    }

    private DnsEntry getEntryByIp(String hostIp) {
        for (DnsEntry actual : dnsEntries) {
            if (hostIp.equals(actual.hostIp)) {
                return actual;
            }
        }
        return null;
    }

    public String getIpByName(String hostName) {
        DnsEntry result = getEntryByName(hostName);
        if (result == null) {
            throw new IllegalArgumentException("Element not found");
        }
        return result.getHostIp();
    }

    public String getNameByIp(String hostIp) {
        DnsEntry result = getEntryByIp(hostIp);
        if (result == null) {
            throw new IllegalArgumentException("Element not found");
        }
        return result.getHostName();
    }
}
