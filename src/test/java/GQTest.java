import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@Nested
public class GQTest {
    GQ gq;
    @BeforeEach
    public void setGq(){
        gq = new GQ();
    }
    @Test
    @DisplayName("Should be equal")
    public void testDeleteElement(){
        Integer [] arr ={10,20,30,40,50};
        int [] res ={10,20,30,50};
        assertNotEquals(res[3], arr[3]);
        arr = gq.deleteElement(arr,4);
        assertEquals(res[3], arr[3]);
    }
    @Test
    @DisplayName("Shout replace values")
    void testDeleteEquals(){
        Integer [] arr ={10,20,30,40,50};
        int [] res ={10,20,60,40,50};
        arr = gq.replaceElement(arr,3,60);
        assertEquals(res[2], arr[2]);
    }

    @Test
    @DisplayName("Query weight of Larges")
    void testAvereageQuerie(){

    }
}
