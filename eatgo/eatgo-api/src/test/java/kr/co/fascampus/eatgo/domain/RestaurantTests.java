package kr.co.fascampus.eatgo.domain;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.*;


class RestaurantTests {
    @Test
    public void creation(){
        Restaurant restaurant = new Restaurant(1000L, "Bob zip", "");

        assertThat(restaurant.getId(), is(1000L));
        assertThat(restaurant.getName(), is("Bob zip"));
        assertThat(restaurant.getAddress(), is(""));
    }

    @Test
    public void information(){
        Restaurant restaurant = new Restaurant(1000L, "Bob zip", "Seoul");

        assertThat(restaurant.getInformation(), is("Bob zip in Seoul"));
    }
}