package at.ac.tuwien.auto.iotsys.gateway.obix.objects.bacnet;

import obix.IObj;
import obix.Real;

public interface AnalogInput extends IObj {
	
	public static final String CONTRACT="iot:AnalogInput";
	
	public static final String valueContract = "<real name='value' href='value' val='0'/>";
	public Real value();
}
