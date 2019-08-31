package com.lixuelian.hrm;

import com.lixuelian.hrm.domain.Systemdictionary;
import com.lixuelian.hrm.service.ISystemdictionaryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App9001.class)
public class SysmanageTest {
    @Autowired
    private ISystemdictionaryService systemdictionaryService;
    @Test
    public void test1(){
        for (Systemdictionary systemdictionary : systemdictionaryService.selectList(null)) {
            System.out.println(systemdictionary);
        }
    }
}
