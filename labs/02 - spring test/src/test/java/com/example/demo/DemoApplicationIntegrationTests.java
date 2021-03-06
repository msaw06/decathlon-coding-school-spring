package com.example.demo;

import com.example.demo.repository.TransferRepository;
import com.example.demo.service.TransferService;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationIntegrationTests {

    @Autowired
    private TransferService transferService;

    @Test
    public void should_return_5() {
        int transferCount = transferService.getTransferCount();
        Assertions.assertThat(transferCount).isEqualTo(5);
    }

    @Test
    public void should_transferRepository_not_be_null() {
        //TODO: Complete this function
        TransferRepository transferRepository = null;
        Assertions.assertThat(transferRepository).isNotNull();
    }

}
