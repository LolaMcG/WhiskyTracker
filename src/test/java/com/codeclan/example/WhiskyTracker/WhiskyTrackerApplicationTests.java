package com.codeclan.example.WhiskyTracker;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
//@ActiveProfiles("test") //Indicates it's a test profile so will not run DataLoader
@SpringBootTest
public class WhiskyTrackerApplicationTests {

	@Autowired
	WhiskyRepository whiskyRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canGetWhiskyByYear(){
		List<Whisky> foundWhiskies = whiskyRepository.findByYear(2018);
		assertEquals(6, foundWhiskies.size());
	}

}
