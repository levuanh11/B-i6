package TwoD_ThreeD;

public class ThreeD extends TwoD {
    float z ;

    public ThreeD(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x , float y , float z){
        this.x =x ;
        this.y =y ;
        this.z =z ;
    }
    public float[] getXYZ(){
        float array1[] = new float[3];
        array1[0] = this.x;
        array1[1] = this.y;
        array1[2] = this.z;
        return new float[] {this.x,this.y,this.z};
    }

    @Override
    public String toString() {
        return "ThreeD{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
