/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgUnitConverter;

/**
 *
 * @author luyuc
 */
public class UnitConvert {
    private UnitCoverterInterface  unitConverter;
        
        public UnitConverter()
        {
            this.unitConverter = new CFconverter();
	}
	
    	public double convert(double input) 
        {
            return this.unitConverter.convert(input);
	}
        
        
        public void changeUnitTo(UnitCoverterInterface  u)
        {
		// ToDo: Detect and prevent nulls
		this.unitConverter = u;
	}
        
	public void toString(double d){
		 System.out.printf(this.unitConverter.unitToSting(), d, this.unitConverter.convert(d));
	}}