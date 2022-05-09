class BinaryNumberWithAlternatingBits {
    public boolean hasAlternatingBits(int n) {
        StringBuilder str = new StringBuilder();
        int res = 0;
        if(n == 1) return true;
        while(n > 0){
            if(n % 2 == 0){
                str.append("0");
            }else{
                str.append("1");
            }
            n = n / 2;
        }
        System.out.println(str);
        
        for(int i = 0; i < str.length() - 1; i++){
            char c = str.charAt(i);
            if(c != str.charAt(i+1)){
                res++;
            }else{
                return false;
            }
        }
        if(res != 0) return true;
        return false;
        
        
    }
}
