

public class mobilePhone {public String model;public String developer;public double price;public String owner;public String information;private static String n95="N95, nokia ,1300.40, Borislav Ivov Vaptsarov, none";public static String getN95() { return n95;}public mobilePhone(String model){ this(model,null);}public mobilePhone(String model,String developer){ this(model,developer,0.0);}public mobilePhone(String model,String developer,double price){ this(model,developer,price,null);}public mobilePhone(String model,String developer,double price,String owner){ this(model,developer,price,owner,null);}public mobilePhone(String model,String developer,double price,String owner,String information){ this.model = model; this.developer = developer; this.price = price; this.owner = owner; this.information = information;}public void getMobilePhoneInfo(){ System.out.printf("Model:%s ,developer:%s,price:%g,owner:%s,other information: %s",this.model,this.developer,this.price,this.owner,this.information);}

public String displayInfo()
{
	String s = "Model: " + this.model + " ,developer: " + this.developer + ",price: " + this.price + ",owner: " + this.owner + ",other information: " + this.information + " ";
	return s;
}public static void main(String[] args){ mobilePhone nokia = new mobilePhone("Nokia n95","nokia",1930,null,null); System.out.println(getN95()); nokia.getMobilePhoneInfo(); }}