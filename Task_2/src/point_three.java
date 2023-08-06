public class point_three {
    public int divide(int a,int b) throws DivisionbyZeroException{
        if (b==0){
            throw new DivisionbyZeroException("2nd Number should be greater than zero!");
        }
        else {
            return a/b;
        }
    }

    public static void main(String[] args) {
        point_three obj=new point_three();
        try {
          System.out.println(obj.divide(12, 0));
        }
        catch (DivisionbyZeroException e){
            System.out.println(e);
        }
    }
}
