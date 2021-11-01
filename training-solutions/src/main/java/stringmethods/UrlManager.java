package stringmethods;

import stringbasic.university.University;

import java.util.Locale;

public class UrlManager {

    private String protocol;
    private int port;
    private String host;
    private String path;
    private String query;
    private String url;

    public UrlManager(String url) {
        this.url = url;
    }

    public String getProtocol() {
        return protocol;
    }

    public int getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    private void setProtocol() {
        protocol = url.substring(0, url.indexOf("://")).toLowerCase();
        url = (url.substring(url.indexOf("://") + 3));
    }

    private void setHost() {
        if (!(url.indexOf(":") == -1)) {
            host = url.substring(0, url.indexOf(":"));
        } else {
            host = url.substring(0, url.indexOf("/"));
        }
//        url = url.substring(url.indexOf(":"));
    }

    private void setPort() {
        if (url.indexOf(":") == -1) {
            port = 0;
        } else {
            String portString = url.substring(((url.indexOf(":")) + 1), url.indexOf("/"));
            port = Integer.parseInt(portString);
        }
        url = (url.substring(url.indexOf("/") + 1));
    }

    private void setPath() {
        if (url.indexOf("?") == -1) {
            path = url;
        } else {
            path = url.substring(0, url.indexOf("?"));
        }
    }

    private void setQuery() {
        if (url.indexOf("?") == -1) {
            query = "";
        } else {
            query = url.substring((url.indexOf("?")) + 1);
        }
    }

    public boolean hasProperty(String key) {


        return true;
    }

    public String getProperty(String key) {


        return key;
    }

    public String getUrl() {
        return url;
    }

    public static void main(String[] args) {

        UrlManager urlManager = new UrlManager
                ("https://earthquake.usgs.gov:8080/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02");

//        System.out.println(urlManager.getUrl());
        urlManager.setProtocol();
        System.out.println(urlManager.getProtocol());
//        System.out.println(urlManager.getUrl());

        urlManager.setHost();
        System.out.println(urlManager.getHost());
//        System.out.println(urlManager.getUrl());

        urlManager.setPort();
        System.out.println(urlManager.getPort());
//        System.out.println(urlManager.getUrl());

        urlManager.setPath();
        System.out.println(urlManager.getPath());
//        System.out.println(urlManager.getUrl());

        urlManager.setQuery();
        System.out.println(urlManager.query);

    }
}