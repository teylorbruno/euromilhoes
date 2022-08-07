package com.example.euromilhoes.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Randomizer {

	private static final Logger LOG = LogManager.getLogger(Randomizer.class);

	private Randomizer() {
	}

	public static void randomNumbers(int totalRandomNumbers, int listSize) {
		List<Integer> resultSet = new ArrayList<>();
		for (int i = 1; i <= listSize; i++) {
			resultSet.add((int) Math.ceil(Math.random() * totalRandomNumbers));
		}
		LOG.info(resultSet);
	}

}
