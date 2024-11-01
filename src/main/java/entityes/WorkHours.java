package entityes;

public class WorkHours {
    private String open;
    private String close;

    public void setClose(String close) {
        this.close = close;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getClose() {
        return close;
    }

    public String getOpen() {
        return open;
    }

    @Override
    public String toString() {
        return "\nopen: " + getOpen() + "\nclose: " + getClose();
    }
}
