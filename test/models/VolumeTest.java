package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {
    @Test
    void fromGallonToLitres() {
//        Volume volume = new Volume(1);
        Volume inLitres1 = Volume.fromGallon(1);
        Volume inLitres2 = Volume.fromLitres(3.78);

        assertEquals(inLitres1,inLitres2);
    }
}