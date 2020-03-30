package geometries;

import primitives.Point3D;
import primitives.Ray;
import primitives.Vector;


/**
 * class representing a Cylinder which is an extends class of Tube class
 * @author yeoshua and Dan
 */


public class Cylinder extends Tube {
    double _height;
    /**Constructor of Cylinder class with parameters : 2 doubles==>for radius and height , and one Ray*/
    public Cylinder(double _radius, Ray _axisRay, double _height) {
        super(_radius, _axisRay);
        this._height = _height;
    }

    /**function which return the height of Cylinder**/
    public double get_height() {
        return _height;
    }

    /**override method of toString for Cylinder class**/
    @Override
    public String toString() {
        return "Cylinder{" +
                "_height=" + _height +
                super.toString()+
                '}';
    }

    /**override method for getNormal which return a vector perpendicular to the given point in parameters**/
    @Override
    public Vector getNormal(Point3D pt) {
        return super.getNormal(pt);
    }

}
