package java.tm.gameRepo.domain;

public class Game extends Entity {

    private String name;
    private PEGI pegi;
    private Boolean haveDemo;

    public Game(String name, PEGI pegi, Boolean haveDemo) {
        this.name = name;
        this.pegi = pegi;
        this.haveDemo = haveDemo;
    }
    public Game(String name, PEGI pegi) {
        this.name = name;
        this.pegi = pegi;
        this.haveDemo = false;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PEGI getPegi() {
        return pegi;
    }

    public void setPegi(PEGI pegi) {
        this.pegi = pegi;
    }

    public Boolean getHaveDemo() {
        return haveDemo;
    }

    public void setHaveDemo(Boolean haveDemo) {
        this.haveDemo = haveDemo;
    }
}
