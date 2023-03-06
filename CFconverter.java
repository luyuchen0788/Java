// standard Algonquin header goes here.
package pkgUnitConverter;

/*
Student Name: luyu chen
Student Number: 040986748
Course & Section #: 22S_CST8288_xxx
Declaration:
*/
public class CFconverter implements UnitCoverterInterface{
	private final double convFactor=1.8;
	private final double convOrigin=32.0;
	/**
	 * @param celsius value in Celsius to be converted
	 * @return equivalent in Fahrenheit
	 */
           @Override
	public double convert(double celsius) {
		return celsius*convFactor + convOrigin;
	}
        @Override
        public String unitToString(){
            return"%5.2f in CELSIUS IS %5.2f Fahrenheit\n";
        }
}

