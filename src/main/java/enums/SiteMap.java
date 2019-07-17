package enums;

public enum SiteMap {
    ZONKY_MP_LOANS("https://api.zonky.cz/loans/marketplace");
	
    SiteMap(String url){
        this.url = url;
    }
    private String url;

    public String getUrl() {
        return url;
    }
}
