public  class Cube extends Square implements Volume {
    public  Cube(String name, double side){
        super(side, name);
        this.name = name;

    }

    public Cube(double radius, String name) {
        super(radius, name);
    }

    @Override
    public void Volume() {

    }
}
