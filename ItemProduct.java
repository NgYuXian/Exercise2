package lab5;

import java.io.Serializable;

public class ItemProduct implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	private	int itemProductId;
	private String name;
	private float price;

	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
		
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public int getItemProductId() {
		// TODO Auto-generated method stub
		return this.itemProductId;
	}

	public void setPrice(float price) {
		// TODO Auto-generated method stub
		this.price = price;
		
	}

	public void setItemProductId(int itemProductId) {
		// TODO Auto-generated method stub
		this.itemProductId = itemProductId;
		
	}

}
