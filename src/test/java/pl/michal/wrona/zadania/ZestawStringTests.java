package pl.michal.wrona.zadania;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ZestawStringTests {
    public ZestawString zestawString = new ZestawString();

    @Test
    public void test1Zadanie27(){
        assertThat(zestawString.zadanie27("programowanie")).isEqualTo("pprrooggrraammoowwaanniiee");


    }

    @Test
    public void test2Zadanie27(){
        assertThat(1).isEqualTo(0);


    }

    @Test
    public void test3Zadanie27(){
        assertThat(1).isEqualTo(1);


    }
}
