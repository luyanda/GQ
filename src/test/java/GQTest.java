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
    @DisplayName("Should Delete Element")
    public void testDeleteElement(){
        Integer [] arr ={10,20,30,40,50};
        int [] res ={10,20,30,50};
        assertNotEquals(res[3], arr[3]);
        arr = gq.deleteElement(arr,4);
        assertEquals(res[3], arr[3]);
    }
    @Test
    @DisplayName("Should replace values")
    void testShouldReplaceElement(){
        Integer [] arr ={10,20,30,40,50};
        int [] res ={60,20,60,40,50};
        arr = gq.replaceElement(arr,1,60);
        assertEquals(res[0], arr[0]);
    }

    @Test
    @DisplayName("Query weight of Larges")
    void testAvereageQuerie(){
        Integer [] arr ={10,20,30,50};
        int [][] edges ={{1,1},{1,2},{1,3}};
        int x = 1,y = 1;
        int [][] query = {{1,1},{1,2},{1,3}};
        double res = 25.000000;
        assertEquals(gq.QueryGraphs(arr,edges, query),res);
    }

    @Test
    void testBigestWeight(){
        Integer [] arr ={10};
        int [][] edges ={{1,1},{1,2},{1,3}};
        int [][] vertices = {{1,2},{2,3},{1,3},{2,4}};
        int x = 1,y = 2;
        int [][] opes = {{1,1},{1,2},{1,3}};
        double res = 25.000000;
        double big =0.0;
        assertEquals(10.00,gq.biggestWeight(vertices,x,y,arr));

    }
}
