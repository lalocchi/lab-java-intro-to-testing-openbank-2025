import com.ironhack.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class PlayerTest {
           // 1. Odd Integers testi
        @Test
        void testGetOddNumbers() {
            int[] expected = {1, 3, 5};
            assertArrayEquals(expected, Player.getOddNumbers(5));
        }

        // 2. Java Keywords testi
        @Test
        void testHasJavaKeyword() {
            assertTrue(Player.hasJavaKeyword("Don't break my heart")); // break keyword-dür
            assertFalse(Player.hasJavaKeyword("I love to breakdance")); // breakdance keyword deyil
        }

        // 3. Player Attack və Health testi
        @Test
        void testAttackAndHealth() {
            Warrior warrior = new Warrior(100, 3, 20, 50);

            Elf enemy = new Elf(30, 2, 10, 100);

            warrior.attack(enemy); //should equal 10
            assertEquals(10, enemy.getHealth());
        }

        // 4. Mockito ilə Wizard testi
        @Test
        void testWizardCastRandomSpell() {
            // Mock yaratmaq
            SpellLibrary mockLibrary = mock(SpellLibrary.class);
            // Stubbing
            when(mockLibrary.getRandomSpell()).thenReturn("Fireball");

            Wizard wizard = new Wizard(100, 10, 3, "Magic", mockLibrary);

            // Yoxlama
            assertEquals("Casting Fireball", wizard.castRandomSpell());
            verify(mockLibrary, times(1)).getRandomSpell();
        }
}
