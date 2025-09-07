class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int n=mat.length;
        int r=n;
        int c=mat[0].length;
        int arr[]=new int[2];

        
        int index=0;
        int max=0;
        for(int i=0;i<r;i++){
            int count=0;
            for(int j=0;j<c;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            if(max<count){
                max=count;
                index=i;
            }
        }

        arr[0]=index;
        arr[1]=max;

        return arr;
    }
}