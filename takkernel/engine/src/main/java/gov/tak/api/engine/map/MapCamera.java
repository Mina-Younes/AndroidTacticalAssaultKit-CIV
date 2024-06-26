package gov.tak.api.engine.map;

import gov.tak.api.engine.math.IMatrix;
import gov.tak.api.engine.math.PointD;

public final class MapCamera {

    /**
     * The projection matrix.
     */
    public IMatrix projection;
    
    /**
     * The model-view matrix.
     */
    public IMatrix modelView;
    
    /**
     * The camera's location, in model coordinates.
     */
    public PointD location;
    
    /**
     * The camera's pointing target, in model coordinates.
     */
    public PointD target;
    
    /**
     * The roll angle, in degrees along the vector between {@link #location} and
     * {@link #target}.
     */
    public double roll;

    public double elevation;
    public double azimuth;

    public double fov;
    /** height:width */
    public double aspectRatio;
    /** `z` value corresponding to the near plane */
    public double near;
    /** `z` value corresponding to the far plane */
    public double far;
    /** near distance from camera, in nominal display meters */
    public double nearMeters;
    /** far distance from camera, in nominal display meters */
    public double farMeters;

    public boolean perspective;
}
