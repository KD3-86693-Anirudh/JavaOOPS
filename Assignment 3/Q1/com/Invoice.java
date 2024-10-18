package com;

class Invoice{
	String partNo;
	String partdesc;
	int quantity;
	double price;
	
	
	Invoice(String partNo, String partdesc, int quantity, double price){
		this.partNo = partNo;
		this.partdesc = partdesc;
		this.quantity = quantity;
		this.price = price;
	}
	
	void setpartNo(String partNo){
      this.partNo = partNo;
	}
	
void setpartdesc(String partdesc){
	this.partdesc = partdesc;	
	}

void setquantity(int quantity){
 this.quantity = quantity ; 	
}

void setprice(double price){
 this.price = price;	
}

 String getpartNo(){
   return partNo;	
 }

String getpartdesc(){
 return partdesc;	
}

int getquantity(){
 return quantity;
}

Double getprice(){
 return price;
}

}


