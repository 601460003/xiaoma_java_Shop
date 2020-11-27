package com.xiaoma.mall;

import com.xiaoma.mall.dao.GoodDao;
import com.xiaoma.mall.entity.Good;
import com.xiaoma.mall.service.GoodService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class MallApplicationTests {
    @Autowired
	GoodService goodService;
	@Test
	void contextLoads() {
	}
//	测试新增得方法
	@Test
	public void addGood(){
		Good good = new Good();
		good.setName("8号电池");
		good.setPrice(new BigDecimal(2.5));
		goodService.add(good);
	}

}
