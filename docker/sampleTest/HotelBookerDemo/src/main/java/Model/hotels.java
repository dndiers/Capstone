package Model;

import java.util.*;

public class Hotels {
	ArrayList<String> bch = new ArrayList<String>();
	ArrayList<String> cty = new ArrayList<String>();
	ArrayList<String> advntr = new ArrayList<String>();
	
	public Hotels()
	{
		bch.add("The Residence Maldives");		
		bch.add("Baros");
		bch.add("The Beach House");
		bch.add("Cheval Blanc");
		
		cty.add("Hotel Plaza Athenee");
		cty.add("The Lucerne Hotel");
		cty.add("The Colonnade Hotel");
		cty.add("Miramar Barcelona");
		cty.add("Gramercy Park Hotel");
		
				
		advntr.add("Hostel Margouya Patagonia");
		advntr.add("Leobo Private Reserve");
		advntr.add("Bosco Alto-Salento");
	}
	public ArrayList<String> results(String str)
	{
		if(str.equals("beach") || str.equals("Beach"))
			return bch;
		if(str.equals("city") || str.equals("City"))
			return cty;
		if(str.equals("adventure") || str.equals("Adventure"))
			return advntr;
		return null;
		
	}
}
