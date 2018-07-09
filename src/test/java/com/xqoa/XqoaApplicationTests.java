package com.xqoa;
import com.xqoa.common.Assist;
import com.xqoa.entity.Personnel;
import com.xqoa.service.PersonnelService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class XqoaApplicationTests {

	@Resource
	private PersonnelService personnelService;

	@Test
	public void contextLoads() {
        Personnel p  = null;
        List<Personnel> list = new ArrayList<>();
        for (int i=0;i<10;i++){
            String s = Integer.toString(i);
            p= new Personnel(s);
            list.add(p);
        }

        list.forEach(e->{
            System.out.println(e.getName());
        });

    }

}
