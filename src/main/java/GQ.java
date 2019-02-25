public class GQ {
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
}
