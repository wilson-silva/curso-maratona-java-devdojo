package academy.devdojo.maratonajava.javacore.zzk_junit.dominio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MangaTest {
    private Manga manga1;
    private Manga manga2;

    @BeforeEach
    public void setUP(){
        manga1 = new Manga("Kimetsu no Yaiba", 24);
        manga2 = new Manga("Kimetsu no Yaiba", 24);
    }

    @Test
    public void accessorsReturnDataWhenInitialized(){
        assertEquals("Kimetsu no Yaiba", manga1.name());
        assertEquals(24, manga1.episodes());
    }

    @Test
    public void equalsReturnTrueWhenObjectsAreTheSame(){
        assertEquals(manga1, manga2);
    }

    @Test
    public void hashCodeReturnTrueWhenObjectsAreTheSame(){
        assertEquals(manga1.hashCode(), manga2.hashCode());
    }

    @Test
    public void constructorThrowNullPointerExceptionWhenNameIsNull(){
        assertThrows(NullPointerException.class, () -> new Manga(null, 24));
    }

    @Test
    public void isRecordReturnTrueWhenCalledFromManga(){
        assertTrue(Manga.class.isRecord());
    }

}