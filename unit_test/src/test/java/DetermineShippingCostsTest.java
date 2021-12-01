import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DetermineShippingCostsTest {
    private DetermineShippingCosts determineShippingCosts;

    @BeforeEach
    void setUp() {
        determineShippingCosts = new DetermineShippingCosts();
    }

    @Test
    void determineShippingCosts_calculateShippingCostsFalse_expectNoShippingCosts() {
        assertEquals(0.00, determineShippingCosts.determineShippingCosts(
                false,
                "FALSE",
                1501.00),
                "There should be no shipping costs!");
    }

    @Test
    void determineShippingCosts_groundShippingCosts_expectGroundShippingCosts() {
        assertEquals(100.00, determineShippingCosts.determineShippingCosts(
                true,
                ShippingType.GROUND,
                1500.00),
                "There should be 100.00 shipping costs!");
    }

    @Test
    void determineShippingCosts_groundStringShippingCosts_expectGroundShippingCosts() {
        assertEquals(100.00, determineShippingCosts.determineShippingCosts(
                        true,
                        "Ground",
                        1500.00),
                "There should be 100.00 shipping costs!");
    }

    @Test
    void determineShippingCosts_noGroundShippingCosts_expectNoGroundShippingCosts() {
        assertEquals(0.00, determineShippingCosts.determineShippingCosts(
                true,
                ShippingType.GROUND,
                1501.00),
                "There should be no shipping costs!");
    }

    @Test
    void determineShippingCosts_inStoreShippingCosts_expectInStoreShippingCosts() {
        assertEquals(50.00, determineShippingCosts.determineShippingCosts(
                true,
                ShippingType.IN_STORE,
                1500.00),
                "There should be 50.00 shipping costs!");
    }

    @Test
    void determineShippingCosts_noInStoreShippingCosts_expectNoInStoreShippingCosts() {
        assertEquals(0.00, determineShippingCosts.determineShippingCosts(
                true,
                ShippingType.IN_STORE,
                1501.00),
                "There should be no shipping costs!");
    }

    @Test
    void determineShippingCosts_nextDayAirShippingCosts_expectNextDayAirShippingCosts() {
        assertEquals(250.00, determineShippingCosts.determineShippingCosts(
                true,
                ShippingType.NEXT_DAY_AIR,
                1500.00),
                "There should be 250.00 shipping costs!");
    }

    @Test
    void determineShippingCosts_noNextDayAirShippingCosts_expectNoNextDayAirShippingCosts() {
        assertEquals(0.00, determineShippingCosts.determineShippingCosts(
                true,
                ShippingType.NEXT_DAY_AIR,
                1501.00),
                "There should be no shipping costs!");
    }

    @Test
    void determineShippingCosts_secondDayAirShippingCosts_expectSecondDayAirShippingCosts() {
        assertEquals(125.00, determineShippingCosts.determineShippingCosts(
                true,
                ShippingType.SECOND_DAY_AIR,
                1500.00),
                "There should be 125.00 shipping costs!");
    }

    @Test
    void determineShippingCosts_noSecondDayAirShippingCosts_expectNoSecondDayAirShippingCosts() {
        assertEquals(0.00, determineShippingCosts.determineShippingCosts(
                true,
                ShippingType.SECOND_DAY_AIR,
                1501.00),
                "There should be no shipping costs!");
    }

    @Test
    void determineShippingCosts_defaultShippingCosts_expectNoGroundShippingCosts() {
        assertEquals(0.00, determineShippingCosts.determineShippingCosts(
                        true,
                        ShippingType.DEFAULT,
                        1500.00),
                "There should be no shipping costs!");
    }
}