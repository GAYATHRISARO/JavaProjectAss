package com.fabric.check;

import com.fabric.exception.*;
import com.fabric.types.Fabric;
public interface FabricInter {
Fabric[] getAll();
Fabric getByColor(String col) throws ColorNotFoundException;
Fabric getByFname(String name) throws FabricNotAvailableException;
Fabric getById(int id) throws IdNotFoundException;
Fabric getByPrice(double pr) throws FabricNotAvailableException;

}
