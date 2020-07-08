package com9.assignment;

import org.junit.jupiter.api.AfterEach;

import model.*;
import service.AnimalCountService;
import service.SingService;
import utils.LanguageEnums;
import utils.SoundEnums;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

	
	

    private static final Logger LOGGER = LoggerFactory.getLogger(SolutionTest.class);

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeAll
    public static void setUp() {
        System.out.println("@BeforAll - Executes");
    }

    @BeforeEach
    public void init() {
        System.out.println("@BeforeEach - Executes");
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void walk() {

        new Bird().canWalk();
        assertThat(outContent.toString(), containsString("I am walking"));
        new Chicken().canWalk();
        assertThat(outContent.toString(), containsString("I am walking"));
        new Duck().canWalk();
        assertThat(outContent.toString(), containsString("I am walking"));
        new Rooster().canWalk();
        assertThat(outContent.toString(), containsString("I am walking"));
        new Butterfly().canWalk();
        assertThat(outContent.toString(), containsString("I am walking"));
    }

    @Test
    void fly() {
        new Duck().canFly();
        assertThat(outContent.toString(), containsString("flying"));
        new Parrot().canFly();
        assertThat(outContent.toString(), containsString("flying"));
        new Butterfly().canFly();
        assertThat(outContent.toString(), containsString("flying"));

        new Butterfly().canFly();
        assertThat(outContent.toString(), containsString("I cant Fly"));
        new Butterfly().transform();

        new Butterfly().canFly();
        assertThat(outContent.toString(), containsString("flying"));
    }

    @Test
    void sing() {
        new Bird().callSound();
        assertThat(outContent.toString(), containsString("I am singing"));
        new Duck().callSound();
        assertThat(outContent.toString(), containsString("Quack, quack"));
        new Chicken().callSound();
        assertThat(outContent.toString(), containsString("Cluck, cluck"));

        new Chicken(new SingService(SoundEnums.CHICKEN)).callSound();
        assertThat(outContent.toString(), containsString("Cluck, cluck"));
        new Rooster().callSound();
        assertThat(outContent.toString(), containsString("Cock-a-doodle-doo"));
        new Rooster(LanguageEnums.DANISH).callSound();
        assertThat(outContent.toString(), containsString("kykyliky"));

        new Dog(new SingService(SoundEnums.DOG)).callSound();
        assertThat(outContent.toString(), containsString("Woof, woof"));
        new Cat(new SingService(SoundEnums.CAT)).callSound();
        assertThat(outContent.toString(), containsString("Meow"));

        new Parrot().callSound();
        assertThat(outContent.toString(), containsString("I am singing"));
        new Parrot(new SingService(SoundEnums.DOG)).callSound();
        assertThat(outContent.toString(), containsString("Woof, woof"));
        new Parrot(new SingService(SoundEnums.CAT)).callSound();
        assertThat(outContent.toString(), containsString("Meow"));
        new Parrot(new SingService(SoundEnums.ROOSTER)).callSound();
        assertThat(outContent.toString(), containsString("Cock-a-doodle-doo"));

        new Butterfly().callSound();
        assertThat(outContent.toString(), containsString("caterpillar"));
        new Butterfly().transform();
        new Butterfly().callSound();
        assertThat(outContent.toString(), containsString(""));


    }

    @Test
    void swim() {
        new Duck().canSwim();
        assertThat(outContent.toString(), containsString("I am swimming"));
        new Fish().canSwim();
        assertThat(outContent.toString(), containsString("I am swimming"));
        new Dolphin().canSwim();
        assertThat(outContent.toString(), containsString("I am swimming"));
    }


    @Test
    void bodyColor() {
        assertEquals(new Fish().bodyColor(), null);
        assertEquals(new Shark().bodyColor(), "grey");
        assertEquals(new Clownfish().bodyColor(), "orange");

    }

    @Test
    void bodySize() {
        assertEquals(new Fish().bodySize(), null);
        assertEquals(new Shark().bodySize(), "large");
        assertEquals(new Clownfish().bodySize(), "small");
    }

    @Test
    void extraFishTest() {
        new Shark().canEat();
        assertThat(outContent.toString(), containsString("I eat fish"));
        new Clownfish().makeClownFish();
        assertThat(outContent.toString(), containsString("I can make Joke"));
    }

    @Test
    void CountingAnimals() {

        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Dolphin(),
                new Frog(),
                new Dog(),
                new Butterfly(),
                new Cat()
        };
        AnimalCountService animalService = new AnimalCountService(animals);

        assertEquals(animalService.getf_animal(), 6);
        assertEquals(animalService.getw_animal(), 12);
        assertEquals(animalService.getspeak_animal(), 12);
        assertEquals(animalService.getswim_animal(), 6);


    }
}
