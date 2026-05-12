class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList <Integer> al = new ArrayList<>();
        int indexOne = -1;
        int indexTwo = -1;
        int low = 0;
        int high = arr.length-1;
        while( low <= high ){
            int mid = ( low + high ) / 2;
            if( arr[mid] > x) high = mid-1;
            else if( arr[mid] < x) low = mid+1;
            else{
                indexOne = mid;
                high = mid-1;
            }
        }
        al.add(indexOne);
        low = 0;
        high = arr.length-1;

        while( low <= high ){
            int mid = ( low + high ) / 2;
            if( arr[mid] > x) high = mid-1;
            else if( arr[mid] < x) low = mid+1;
            else{
                indexTwo = mid  ;
                low = mid + 1;
            }
        }
        al.add(indexTwo);
        return al;
    }
}
