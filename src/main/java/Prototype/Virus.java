package Prototype;

public class Virus extends Program{
    public Virus(String name, String version){
        super(name, version);
    }

    @Override
    public Program clone() {
        return new Virus(this.name, this.version);
    }

    @Override
    public boolean equals(Program p) {
        if (p.getClass() != Virus.class)
            return false;
        return p.name.equals(this.name)  && p.version.equals(this.version);
    }
}
