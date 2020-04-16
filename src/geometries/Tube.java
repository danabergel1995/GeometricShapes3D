package geometries;

import primitives.Point3D;
import primitives.Ray;
import primitives.Util;
import primitives.Vector;

import java.util.List;


/**
 * class representing a vector on a Tube
 * @author yeoshua and Dan
 */


public class Tube extends RadialGeometry {
    Ray _axisRay;

    /**
     * builds tube out of a ray
     * @param _axisRay ray
     */


    //Constructor of class Tube with parameters of double and Ray
    public Tube(double _radius, Ray _axisRay) {
        super(_radius);
        this._axisRay =new Ray(_axisRay);
    }

    //function which return the ray _axisRay
    public Ray get_axisRay() {
        return _axisRay;
    }


    //override method toString of Tube class
    @Override
    public String toString() {
        return "Tube{" +
                "_axisRay=" + _axisRay + "_center"+super.toString()+
                '}';
    }
    @Override
    public Vector getNormal(Point3D point)
    {
        //The vector from the point of the cylinder to the given point
        Point3D point1 = _axisRay.getPoint();
        Vector vector1 = _axisRay.getVector();
        Vector vector2 = point.subtract(point1);

        //We need the projection to multiply the _direction unit vector
        double projection = vector2.dotProduct(vector1);
        if(!Util.isZero(projection))
        {
            // projection of P-O on the ray:
            point1.add(vector1.Scale(projection));
        }

        //This vector is orthogonal to the _direction vector.
        Vector check = point.subtract(point1);
        return check.normalize();
    }

    @Override
    public List<Point3D> findIntsersections(Ray ray) {
        return null;
    }
}
