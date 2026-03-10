package Jobsheet5;

public class NilaiMahasiswa {
    int maxUTS(int arr[],int l, int r){
        if(l == r){
            return arr[l];
        } else {
            int mid = (l + r) / 2;
            int leftMax = maxUTS(arr, l, mid);
            int rightMax = maxUTS(arr, mid + 1, r);
            return Math.max(leftMax, rightMax);
        }
    }
    int minUTS(int arr[],int l, int r){
        if(l == r){
            return arr[l];
        } else {
            int mid = (l + r) / 2;
            int leftMin = minUTS(arr, l, mid);
            int rightMin = minUTS(arr, mid + 1, r);
            return Math.min(leftMin, rightMin);
        }
    }
    double rataUAS(int arr[]){
        int total = 0;
        for (int i=0; i<arr.length; i++){
            total += arr[i];
        }
        return (double) total / arr.length;
    }
}
