package app.metahozierservice.controller;

import app.metahozierservice.TestBase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static app.metahozierservice.data.ConstantLyrics.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ServiceControllerTest extends TestBase {

    @Autowired
    ServiceController serviceController;

    @Before
    public void setUp() {
        createData();
    }

    @After
    public void tearDown() {
        deleteData();
    }

    @Test
    public void getSongTest() {
        ResponseEntity<String> response = serviceController.getSong("Take Me to Church");
        Assert.assertEquals(HttpStatus.OK, response.getStatusCode());
        Assert.assertEquals(TAKE_ME_TO_CHURCH, response.getBody());
    }

    @Test
    public void getSongsTest() {
        ResponseEntity<List<String>> response = serviceController.getSongs(OTHER_SONGS);
        Assert.assertEquals(HttpStatus.OK, response.getStatusCode());
        Assert.assertEquals(2, response.getBody().size());
    }

}
