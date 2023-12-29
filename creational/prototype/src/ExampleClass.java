public class ExampleClass implements Prototype {
    int x;
    int y;
    int z;
ExampleClass(int x, int y, int z){
    this.x=x;
    this.y=y;
    this.z=z;
}
    @Override
    public Prototype getClone() {
        return new ExampleClass(this.x, this.y, this.z);
    }
}
