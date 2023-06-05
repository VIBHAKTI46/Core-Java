//program to demonstrate on hierachical Inheritance
package org.tnsif.hierachical;

public class SnowCone extends Android{
 private int VersionName;
 private String modelName;
public int getVersionName() {
	return VersionName;
}
public void setVersionName(int versionName) {
	VersionName = versionName;
}
public String getModelName() {
	return modelName;
}
public void setModelName(String modelName) {
	this.modelName = modelName;
}
public SnowCone() {
	System.out.println("Default constructor for child class one");
}
public SnowCone(int versionName, String modelName) {
	super();
	VersionName = versionName;
	this.modelName = modelName;
}
@Override
public String toString() {
	return "SnowCone [VersionName=" + VersionName + ", modelName=" + modelName + ", getBrand()=" + getBrand()
			+ ", getOwnerName()=" + getOwnerName() + "]";
}

 
}
