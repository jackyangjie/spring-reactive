package com.yj;

import com.yj.controller.SpringActiveController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;


@RunWith(SpringRunner.class)
@WebFluxTest(controllers = SpringActiveController.class)
public class DemoTests {

    @Autowired
    WebTestClient client;

    @Test
    public void showAllMsg(){

        client.get().uri("/").exchange().expectStatus().isOk();
    }
}
