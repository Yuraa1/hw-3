class ATM {
    public int countBanknotes(int sum) {
        int a =0;
        while(sum>0){
            a++;
            if(sum>500) {
                sum=sum-500;
            }
            else if(sum>200) {
                sum=sum-200;
            }
            else if(sum>100) {
                sum=sum-100;
            }
            else if(sum>50) {
                sum=sum-50;
            }
            else if(sum>20) {
                sum=sum-20;
            }
            else if(sum>10) {
                sum=sum-10;
            }
            else if(sum>5) {
                sum=sum-5;
            }
            else if(sum>2) {
                sum=sum-2;
            }
            else {
                sum=sum-1;
            }
        }
        return a;
    }
}
