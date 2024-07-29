public class Firefighter extends Rescuers {
    Equipment equipment;

    public Firefighter(String name, String rung, int age, Satchel satchel) {
        super(name, rung, age, satchel);
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

