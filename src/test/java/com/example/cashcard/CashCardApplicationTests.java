package com.example.cashcard;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CashCardApplicationTests {

	@Test
	public void myFirstTest() {
		assertThat(1).isEqualTo(1);
	}

}

//package example.cashcard;
//
//import org.junit.jupiter.api.Test;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//public class CashCardJsonTest {
//
//@Test
//    public void myFirstTest() {
//        assertThat(1).isEqualTo(42);
//    }
//}