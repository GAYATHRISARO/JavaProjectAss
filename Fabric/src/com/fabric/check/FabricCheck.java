package com.fabric.check;

import com.fabric.exception.*;
import com.fabric.types.Fabric;

public class FabricCheck implements FabricInter {

	@Override
	public Fabric[] getAll() {
		// TODO Auto-generated method stub
		return clothing();
	}

	@Override
	public Fabric getByColor(String col) throws ColorNotFoundException{
		boolean flag = false;
		Fabric fb = null;
		for(Fabric fabrics:clothing()) {
			if( fabrics.getColor().equals(col))
			{
				flag=true;
				fb=fabrics;
			}
		}
		if (flag == false)
			throw new ColorNotFoundException("Invalid color");
		return fb;
		
	}

	@Override
	public Fabric getByFname(String name) throws FabricNotAvailableException {
		boolean flag = false;
		Fabric fn = null;
		for(Fabric fabr:clothing()) {
			if(fabr.getFabricname().equals(name))
			{
				flag=true;
				fn=fabr;
			}
		}
		if (flag == false)
			throw new FabricNotAvailableException("Fabric is not available");
		return fn;
	}

	@Override
	public Fabric getById(int id) throws IdNotFoundException {
		boolean flag = false;
		Fabric fi = null;
		for(Fabric fc:clothing()) {
			if(fc.getFid()==id)
			{
				flag=true;
				fi=fc;
			}
		}
		if (flag == false)
			throw new IdNotFoundException("Invalid id");
		return fi;
	}
	@Override
	public Fabric getByPrice(double pr) throws FabricNotAvailableException {
		boolean flag = false;
		Fabric p = null;
		for(Fabric price:clothing()) {
			if(price.getPrice()==pr)
			{
				flag=true;
				price=p;
			}
		}
		if (flag == false)
			throw new FabricNotAvailableException("Fixed price no offer");
		
		return p;
	}
	private Fabric[] clothing(){
		Fabric[] fab=new Fabric[4];
		fab[0]=new Fabric("Silk",4,200,"Green");
		fab[1]=new Fabric("Velvet",6,400,"Pink");
		fab[2]=new Fabric("Chiffon",2,600,"Blue");
		fab[3]=new Fabric("Cotton",1,800,"white");
		return fab;
	}

	


}
