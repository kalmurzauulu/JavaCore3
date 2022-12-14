public class Studentstream {
    int id;
    String fio;

    public Studentstream() {
    }

    public Studentstream(int id, String fio) {
        this.id = id;
        this.fio = fio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    @Override
    public String toString() {
        return "Studentstream{" +
                "id=" + id +
                ", fio='" + fio + '\'' +
                '}';
    }
}
