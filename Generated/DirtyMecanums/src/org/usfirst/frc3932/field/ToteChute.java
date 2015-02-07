package org.usfirst.frc3932.field;

/**
 * 
 * >b>Each TOTE CHUTE opening is 1 ft. 3.25 in. tall by 1 ft. 6.5 in. wide</b>, 
 * with the bottom of the opening located 1 ft. 6.5 in. above the carpet.
 * The TOTE CHUTE is installed behind the TOTE CHUTE opening 
 * (i.e. on the outside of the FIELD) and consists of an 2 ft. 6 in. long
 * ramp of HDPE, at a 22 degree incline, with a upper edge that is 2 ft. 6.625 in. 
 * from the floor. The ramp is covered with a shield of clear polycarbonate. A clear polycarbonate CHUTE DOOR is installed over the TOTE CHUTE opening and prevents a TOTE in the TOTE CHUTE from sliding out into the playing FIELD. Once a TOTE is loaded in to the TOTE CHUTE, the CHUTE DOOR can be opened using a handle located on either side of the CHUTE DOOR. This allows a TOTE loaded in the TOTE CHUTE to slide onto the FIELD.
 *
 */
public class ToteChute {
	private static final double INCHES_TO_FEET = 12d;
	public static final double TOP_EDGE_DIST_FROM_FLOOR_INCHES = (2d * INCHES_TO_FEET) + .65d;
	public static final double BOTTOM_EDGE_DIST_FROM_FLOOR_INCHES = (1d * INCHES_TO_FEET) + .65d;
	public static final double WIDTH_INCHES = (1d * INCHES_TO_FEET) + 6.5d;
	public static final double HEIGHT_INCHES = (1d * INCHES_TO_FEET) + 3.25d;
}
