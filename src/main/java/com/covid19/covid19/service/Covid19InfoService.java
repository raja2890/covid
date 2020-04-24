package com.covid19.covid19.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.covid19.covid19.dto.StateDto;
import com.covid19.covid19.response.ResponseObj;

@Service
public class Covid19InfoService {

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	private Environment env;

	public ResponseObj stateWiseInfo() {

		List<StateDto> stateDtoList = null;
		ResponseObj responseObj = new ResponseObj();

		try {

			final String uri = env.getProperty("stateWiseInfoUrl");
			ResponseEntity<StateDto[]> responseEntity = restTemplate.getForEntity(uri, StateDto[].class);
			stateDtoList = Arrays.asList(responseEntity.getBody());

			responseObj.setHttpStatus(HttpStatus.OK);
			responseObj.setStateDataList(stateDtoList);

		} catch (Exception exception) {
			responseObj.setHttpStatus(HttpStatus.INTERNAL_SERVER_ERROR);
			responseObj.setError("Error occurred while getting stateWiseInfo ");
		}

		return responseObj;
	}

}
