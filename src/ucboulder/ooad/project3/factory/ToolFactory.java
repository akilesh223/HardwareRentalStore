package ucboulder.ooad.project3.factory;

import ucboulder.ooad.project3.entities.AccessoryKit;
import ucboulder.ooad.project3.entities.Concrete;
import ucboulder.ooad.project3.entities.ExtensionCord;
import ucboulder.ooad.project3.entities.Painting;
import ucboulder.ooad.project3.entities.Plumbing;
import ucboulder.ooad.project3.entities.ProtectiveGearPack;
import ucboulder.ooad.project3.entities.Tool;
import ucboulder.ooad.project3.entities.Woodwork;
import ucboulder.ooad.project3.entities.Yardwork;

public class ToolFactory {

	public static Tool getTool(String type,String name,int nytNo) {
		
		if(type.equalsIgnoreCase("Concrete")) return Concrete.getInstance(name,nytNo);
		if(type.equalsIgnoreCase("Painting")) return Painting.getInstance(name,nytNo);
		if(type.equalsIgnoreCase("Plumbing")) return Plumbing.getInstance(name,nytNo);
		
		if(type.equalsIgnoreCase("Woodwork")) return Woodwork.getInstance(name,nytNo);
		if(type.equalsIgnoreCase("Yardwork")) return Yardwork.getInstance(name,nytNo);
		
		else 
			
		return null;	
	}
	
	
	public static Tool getAddOnTool(String type,String name,Tool tool) {
	     	
		if(type.equalsIgnoreCase("AccessoryKit")) return new AccessoryKit(tool, name);
		if(type.equalsIgnoreCase("ExtensionCord")) return new ExtensionCord(tool, name);
		if(type.equalsIgnoreCase("ProtectiveGearPack")) return new ProtectiveGearPack(tool, name);
		else
		return null;
		
	}
	

	
}