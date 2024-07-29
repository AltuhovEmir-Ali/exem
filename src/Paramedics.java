public class Paramedics extends Rescuers {
    FirstAidKLit firstAidKLit;


    public Paramedics(String name, String rung, int age, Satchel satchel) {
        super(name, rung, age, satchel);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public Satchel getSatchel() {
        return super.getSatchel();
    }

    @Override
    public void setSatchel(Satchel satchel) {
        super.setSatchel(satchel);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getRung() {
        return super.getRung();
    }

    @Override
    public void setRung(String rung) {
        super.setRung(rung);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }
}
