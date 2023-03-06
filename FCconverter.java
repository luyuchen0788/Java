// standard Algonquin header goes here.
package pkgUnitConverter;
/**
 * class to convert Fahrenheit to Celsius
 * @author kriger
 */
public class FCconverter implements UnitCoverterInterface
{
	private final double convFactor=1.8;
	private final double convOrigin=32.0;
        
	
	/**
	 * @param fahrenheit value in Fahrenheit to be converted
	 * @return equivalent in Celsius
	 */
        @Override
	public double convert(double fahrenheit) 
        {
            return (fahrenheit - convOrigin)/convFactor;
	}
        
      @Override
	public String unitToSting(){
		return "%5.2f in Fahrenheit is %5.2f Celsius\n";
	}

}
