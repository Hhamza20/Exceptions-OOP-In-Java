public class test {
    public static void main(String[] args) {
        int[] arr;
        arr=new int[100];
        try{
            System.out.println(arr[101]);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Can't Access index that is not initialized");
        }
    }
}
