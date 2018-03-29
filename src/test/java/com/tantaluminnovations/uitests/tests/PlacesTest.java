package com.tantaluminnovations.uitests.tests;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PlacesTest extends BaseTest {
    @Test(groups = {"android"})
    public void myFirstPlacesTest() {
        assertThat(true).isEqualTo(true);
    }

    @Test(groups = {"ios"})
    public void mySecondPlacesTest() {
        assertThat(true).isEqualTo(true);
    }

    @Test
    public void myThirdPlacesTest() {
        assertThat(true).isEqualTo(true);
    }
}
