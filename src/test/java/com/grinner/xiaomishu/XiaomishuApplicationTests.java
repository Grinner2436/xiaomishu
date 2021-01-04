package com.grinner.xiaomishu;

import com.grinner.xiaomishu.schedule.Tips;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class XiaomishuApplicationTests {

	@Autowired
	private Tips tips;

	@Test
	void contextLoads() {
//		tips.getoff();
	}

}
