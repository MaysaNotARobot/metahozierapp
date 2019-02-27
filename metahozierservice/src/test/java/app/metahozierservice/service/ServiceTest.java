package app.metahozierservice.service;

import app.metahozierservice.TestBase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static app.metahozierservice.data.ConstantLyrics.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ServiceTest extends TestBase {

    @Autowired
    Service service;

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
        Assert.assertEquals(BETTER_LOVE, service.getSong("Better Love"));
        Assert.assertEquals(CHERRY_WINE, service.getSong("Cherry wine"));
    }

    @Test
    public void getSongsTest() {
        Assert.assertEquals(3, service.getSongs(ALBUM_HOZIER).size());
    }
}
