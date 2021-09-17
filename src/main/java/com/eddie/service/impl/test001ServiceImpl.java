package com.eddie.service.impl;

import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.eddie.service.test001Service;
import com.eddie.vo.test001RequestVO;
import com.google.gson.Gson;

public class test001ServiceImpl implements test001Service {

	private static Logger logger = LoggerFactory.getLogger(test001ServiceImpl.class);
	private Gson gson = new Gson();
	private String functionUri = "eddie/test001";
	private String functionName = "測試api001";

	public void test001(Exchange exchange) {
		try {
			logger.info(functionUri + functionName + " start");
			String request = exchange.getIn().getBody(String.class);
			logger.info("{}  request msg: {} ", functionName, request);
			test001RequestVO test001RequestVO = gson.fromJson(request, test001RequestVO.class);
			logger.info(test001RequestVO.getId());
			String responseBody = "{\"status\":\"0000\",\"message\":\"成功\"}";
			exchange.getOut().setBody(responseBody);
		} catch (Exception e) {
			String responseBody = "{\"status\":\"9999\",\"message\":\"" + e.getMessage() + "\"}";
			exchange.getOut().setBody(responseBody);
		}
	}

}
