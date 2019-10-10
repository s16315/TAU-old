package main.java.pl.tmnich.gamescatalog.domain;

class PEGI extends Entity{
    private String name;
    private String description;

    public PEGI(String name, String description, int id) {
        this.name = name;
        this.description = description;
        this.setId(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
