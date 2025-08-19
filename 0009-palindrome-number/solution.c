bool isPalindrome(int x) {
    if(x<0){
        return false;
    }
    else{
    long sum=0,rem,n=x;
    while(x!=0){
    rem=x%10;
    sum=sum*10+rem;
    x/=10;
    }
    if(n==sum){
        return true;
    }
    else{
        return false;
    }
}
}
