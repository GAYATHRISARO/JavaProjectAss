
package com.fabric.types;

public class Fabric {
	String fabricname;
	int fid;
	double price;
	String color;


	

	public Fabric() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fabric(String fabricname, int fid, double price, String color) {
		super();
		this.fabricname = fabricname;
		this.fid = fid;
		this.price = price;
		this.color = color;
	}

	public String getFabricname() {
		return fabricname;
	}

	public void setFabricname(String fabricname) {
		this.fabricname = fabricname;
	}

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Fabric [fabricname=" + fabricname + ", fid=" + fid + ", price=" + price + ", color=" + color + "]";
	}
}
