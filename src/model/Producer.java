package model;

public class Producer {
    private String prFirstname;
    public String prLastname;

    public Producer(String prFirstname, String prLastname) {
        this.prFirstname = prFirstname;
        this.prLastname = prLastname;
    }

    public Producer() {
    }

    public String getPrFirstname() {
        return prFirstname;
    }

    public void setPrFirstname(String prFirstname) {
        this.prFirstname = prFirstname;
    }

    public String getPrLastname() {
        return prLastname;
    }

    public void setPrLastname(String prLastname) {
        this.prLastname = prLastname;
    }

    @Override
    public String toString() {
        return "Producer{" +
                "prFirstname='" + prFirstname + '\'' +
                ", prLastname='" + prLastname + '\'' +
                '}';
    }
}
