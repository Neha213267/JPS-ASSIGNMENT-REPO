package com.springREST.info;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class InformationService {
	
	private List<Information> info = Arrays.asList(
			new Information("Goa","Panaji","India","403108"),
            new Information("Uttar Pradesh","Ghaziabad","India","201014"),
            new Information("Kerala","Thiruvananthapuram","India","364135")
            );
			
			public List<Information> getAllInfo(){
				return info;
			}
			public Information getInfo(String zip) {
				 return info.stream().filter(i->i.getZip().equals(zip)).findFirst().get();
			}
			

}
