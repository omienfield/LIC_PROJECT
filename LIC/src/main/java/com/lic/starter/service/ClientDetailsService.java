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

		try (Reader reader = Files.newBufferedReader(Paths.get("D:\\abc.csv"));) {
			CsvToBean<ClientDetails> csvToBean = new CsvToBeanBuilder(reader).withType(ClientDetails.class)
					.withIgnoreLeadingWhiteSpace(true).build();
			List<ClientDetails> listt = csvToBean.parse();
			smr.saveAll(listt);

		} catch (Exception e) {

		}
	}
}
