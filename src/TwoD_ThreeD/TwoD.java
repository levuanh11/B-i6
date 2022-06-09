package TwoD_ThreeD;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;

public class TwoD {
    float x ;
    float y ;

    public TwoD() {
    }

    public TwoD(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x , float y){
        this.x =x ;
        this.y =y ;
    }

    public float[] getXY() {
        float array[] = new float[2];
        array[0] = this.x;
        array[1] = this.y;
        return new float[] {this.x,this.y};
    }

    @Override
    public String toString() {
        return "TwoD{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}

