package com.covid19.covid19.response;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.covid19.covid19.dto.StateDto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ResponseObj {
	
	private HttpStatus httpStatus;
	private String error;
	private List<StateDto> stateDataList;
	

}
