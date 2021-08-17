import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleOperations {
    Rectangle rectangle;

    @BeforeEach
    public void createObject(){ rectangle = new Rectangle();}

    @Test
    void toGetAreaFiftyForLengthTenAndWidthFive(){
        assertEquals(50,rectangle.calculateArea(10,5));
    }
    @Test
    void toGetPerimeterThirtyForLengthTenAndWidthFive(){
        assertEquals(30,rectangle.calculatePerimeter(10,5));
    }
    @Test
    void toGetExceptionWhenNegativeValuePassedToArea(){
        assertEquals(-1,rectangle.calculateArea(-10,5));
    }
    @Test
    void toGetExceptionWhenNegativeValuePassedToPerimeter(){
        assertEquals(-1,rectangle.calculatePerimeter(-10,5));
    }
}