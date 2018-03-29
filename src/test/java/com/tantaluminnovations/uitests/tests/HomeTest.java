package com.tantaluminnovations.uitests.tests;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HomeTest extends BaseTest {
    @Test(groups = {"android"})
    public void myFirstHomeTest() {
        assertThat(true).isEqualTo(true);
    }

    @Test(groups = {"ios"})
    public void mySecondHomeTest() {
        assertThat(true).isEqualTo(true);
    }

    @Test
    public void myThirdHomeTest() {
        assertThat(true).isEqualTo(true);
    }
}
