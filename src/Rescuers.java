public abstract class Rescuers {
    Satchel satchel;
    private String name;
    private String rung;
    private int age;

    public Rescuers( String name, String rung, int age, Satchel satchel) {
        this.satchel =satchel ;
        this.name = name;
        this.rung = rung;
        this.age = age;

}

    public Satchel getSatchel() {
        return satchel;
    }

    public void setSatchel(Satchel satchel) {
        this.satchel = satchel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRung() {
        return rung;
    }

    public void setRung(String rung) {
        this.rung = rung;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

