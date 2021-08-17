public class Rectangle {
    public long calculateArea(int length,int width){
        if(length<=0 || width<=0){
           // return -1;
            throw new IllegalArgumentException("Length or width of rectangle should not be zero or less than zero");
        }
        else{
            return (length*width);
        }
    }
    public long calculatePerimeter(int length,int width){
        if(length<=0 || width<=0){
            throw new IllegalArgumentException("Length or width of rectangle should not be zero or less than zero");
        }
        else{
            return (2*(length+width));
        }
    }
}
