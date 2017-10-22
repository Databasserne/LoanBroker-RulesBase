package com.databasserne.loanbroker;

import com.databasserne.loanbroker.controller.BankController;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(value = Parameterized.class)
public class BankControllerTest {

    private BankController bankController;
    private int creditScore;
    private double amount;
    private int duration;
    private int amountBanks;

    public BankControllerTest(int creditScore, double amount, int duration, int amountBanks) {
        this.creditScore = creditScore;
        this.amount = amount;
        this.duration = duration;
        this.amountBanks = amountBanks;
    }

    @BeforeClass
    public static void setUpClass() {}

    @AfterClass
    public static void tearDownClass() {}

    @Before
    public void setUp() {
        bankController = new BankController();
    }

    @After
    public void tearDown() {}

    @Parameterized.Parameters(name = "{index}: testAdd({0}+{1}) = {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {200, 2000, 12, 2},
                {800, 5000, 1, 4},
                {1000, 1000000, 24, 3}
        });
    }

    @Test
    public void getBanksAllTest() {
        assertThat(bankController.getBanks(creditScore, amount, duration).size(), is(amountBanks));
    }
}
