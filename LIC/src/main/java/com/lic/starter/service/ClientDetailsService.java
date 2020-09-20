package com.lic.starter.service;

import java.io.FileReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.lic.starter.jpa.entities.ClientDetails;
import com.lic.starter.jpa.repositories.ClientDetailsRepository;
import com.opencsv.CSVReader;
import com.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;

@Service
public class ClientDetailsService {

	@Autowired
	private ClientDetailsRepository smr;

	private static Logger logger = LogManager.getLogger(ClientDetailsService.class);

	public void insert() {
		
		try (
				Reader reader = Files.newBufferedReader(Paths.get("D:\\abc.csv"));
				){
		CsvToBean<ClientDetails> csvToBean = new CsvToBeanBuilder(reader)
				.withType(ClientDetails.class)
				.withIgnoreLeadingWhiteSpace(true)
				.build();

		List<ClientDetails> listt= csvToBean.parse();
		for (ClientDetails s: listt)
		{
			System.out.println(s.getPolicyNo());
			System.out.println(s.getName());
	   System.out.println(s.getCommencementDate());
			System.out.println(s.getPlanTerm());
			//System.out.println(s.getMode());

			
			
			
			
			
			
			System.out.println(s.getPremium());

			
		    // ClientDetails s1= new ClientDetails(s.getRoll(),s.getName(),s.getHobby());
		}
		
//
//		// Hashmap to map CSV data to
//		// Bean attributes.
//		Map<String, String> mapping = new HashMap<String, String>();
//		mapping.put("policyno", "policyNo");
//		//mapping.put("name", "name");
//	//	mapping.put("doc", "commencementDate");
//		//mapping.put("planterm", "planTerm");
//		//mapping.put("mode", "mode");
//		//mapping.put("premium", "premium");
//
//		// HeaderColumnNameTranslateMappingStrategy
//		// for ClientDetails class
//		HeaderColumnNameTranslateMappingStrategy<ClientDetails> strategy = new HeaderColumnNameTranslateMappingStrategy<ClientDetails>();
//		strategy.setType(ClientDetails.class);
//		strategy.setColumnMapping(mapping);
//
//		CSVReader csvReader = null; 
//		
//		try 
//		{
//			csvReader = new CSVReader(new FileReader 
//		            ("D:\\abc.csv"));
//			
//
//		}
//		catch(Exception e)
//		{
//			
//		}
//		
//		CsvToBean ctb = new CsvToBean();
//		List<ClientDetails> clientDetails = ctb.parse(strategy,csvReader);
//		smr.saveAll(clientDetails);
//		
	}catch(Exception e)
		{
			
		}
}}
