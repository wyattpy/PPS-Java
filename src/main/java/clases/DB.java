package clases;

public class DB {
    String url;
    String user;
    String contra;
    String driver;

    public DB(){
        this.url="jdbc:postgresql://ec2-23-20-70-32.compute-1.amazonaws.com:5432/dfk5mta8dkdtbl";
        this.user="sgtxpfhzquxnoq";
        this.contra="8f88fdcf053384491c02727cf5f8464bc939a7663ac934e6e10f03c44963808b";
        this.driver="org.postgresql.Driver";
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }
}
