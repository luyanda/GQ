import java.text.DecimalFormat;

public class GQ {
    public static void main(String []args){
        int [][] arr = {{1,2}};
        DecimalFormat decimalFormat = new DecimalFormat("#.######");
        int x=50,y=3;
        //double sum = Double.parseDouble();
        System.out.println(arr.length);
    }
    public Integer[] deleteElement(Integer [] arr, int index) {

        if(index<1 || index>arr.length)
            return null;
        Integer [] res=new Integer[arr.length-1];
        for(int i = 0,k=0;i<arr.length;i++){
            if(i == index-1){
                continue;
            }
            res[k++] = arr[i];
        }
        return res;
    }

    public Integer[] replaceElement(Integer[] arr, int index, int value) {
        if(arr == null || (index <1 && index > arr.length))
            return null;
        arr[index-1] = value;
        return arr;
    }

    public double QueryGraphs(Integer[] arr, int[][] edges, int [][] ops) {
        if(ops.length==0)
            return 0.0;
        double A = 0.0, big=0;
        int x = edges[0][0];
        int y = edges[0][1];
       // big = biggestWeight(big, edges, arr);
        return A;
    }

    protected double biggestWeight(int [][] vertices, int x, int y, Integer[] arr) {
        double big = 0;
        for (int i=0;i<vertices.length;i++){
            if(x == vertices[i][0] || x == vertices[i][1]){
                if(arr[vertices[i][0]-1] != null)
                    if(big < arr[vertices[i][0]-1])
                    big = arr[vertices[i][0]-1];
                if(arr[vertices[i][1]-1] != null)
                    if(big < arr[vertices[i][1]-1])
                    big = arr[vertices[i][1]-1];
            }else if(y == vertices[i][0] || y == vertices[i][1]){
                if(arr[vertices[i][0]-1] != null)
                    if(big < arr[vertices[i][0]-1])
                    big = arr[vertices[i][0]-1];
                if(arr[vertices[i][1]-1] != null)
                    if(big < arr[vertices[i][1]-1])
                        big = arr[vertices[i][1]-1];
            }
        }
        return big;
    }
}
