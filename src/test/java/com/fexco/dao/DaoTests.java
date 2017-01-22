package com.fexco.dao;

import com.fexco.dto.EirCode;
import com.fexco.dto.Premise;
import com.fexco.service.ApiService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("dev")
public class DaoTests {

	@Autowired
	private IWSDao wsDao;

	@Test
	public void testRetrieveEirCode() {
		EirCode eirCode = new EirCode();
		eirCode.setAddressline1("Dept of Communications, Climate Change and Natural Resources");
		eirCode.setAddressline2("29-31 Adelaide Road");
		eirCode.setOrganisation("Dept of Communications, Climate Change and Natural Resources");
		eirCode.setStreet("Adelaide Road");
		eirCode.setPosttown("Dublin 2");
		eirCode.setCounty("Dublin");
		eirCode.setPostcode("D02 X285");
		eirCode.setSummaryline("Dept of Communications, Climate Change and Natural Resources, 29-31 Adelaide Road, Dublin 2, D02 X285");
		eirCode.setNumber("29-31");
		eirCode.setPremise("29-31");
		eirCode.setLatitude("53.332067");
		eirCode.setLongitude("-6.255492");
		eirCode.setWhat3words("lease.wiped.life");
		EirCode[] expectedResult = new EirCode[]{eirCode};

        final String host = "http://localhost:8080";
		final String endPoint = host + "/pcw/PCW45-12345-12345-1234X/addressgeo/ie/D02X285?format=json&lines=3&addtags=w3w";

        EirCode[] result = wsDao.retrieveEirCodeFromWS(endPoint);

		assertEquals(Arrays.toString(expectedResult), Arrays.toString(result));
	}

	@Test
	public void testRetrievePremise() {
		Premise premise = new Premise();
		premise.setAddressline1("Allies Computing Ltd");
		premise.setAddressline2("Manor Farm Barns, Fox Road");
		premise.setAddressline3("Framingham Pigot");
        premise.setSummaryline("Allies Computing Ltd, Manor Farm Barns, Fox Road, Framingham Pigot, Norwich, Norfolk, NR14 7PZ");
        premise.setOrganisation("Allies Computing Ltd");
        premise.setBuildingname("Manor Farm Barns");
        premise.setPremise("Manor Farm Barns");
        premise.setStreet("Fox Road");
        premise.setDependentlocality("Framingham Pigot");
        premise.setPosttown("Norwich");
        premise.setCounty("Norfolk");
        premise.setPostcode("NR14 7PZ");
        Premise[] expectedResult = new Premise[]{premise};

		final String host = "http://localhost:8080";
		final String endPoint = host + "/pcw/PCW45-12345-12345-1234X/address/uk/NR147PZ?format=json&lines=3";

		Premise[] result = wsDao.retrievePremiseFromWS(endPoint);

		assertEquals(Arrays.toString(expectedResult), Arrays.toString(result));
	}

}
