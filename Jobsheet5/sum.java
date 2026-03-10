package Jobsheet5;

public class sum {
    double keuntungan[];
    sum(int el){
        keuntungan = new double[el];
    }
    double totalBF(){
        double total = 0;
        for (int i=0; i<keuntungan.length; i++){
            total += keuntungan[i];
        }
        return total;
    }
    double totalDC(int l, int r){
        if(l == r){
            return keuntungan[l];
        } else {
            int mid = (l + r) / 2;
            double leftSum = totalDC(l, mid);
            double rightSum = totalDC(mid + 1, r);
            return leftSum + rightSum;
        }
    }
}
