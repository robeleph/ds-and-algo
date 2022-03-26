class Power {
        public double myPow(double x, int n) {
        
          if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        long pow = Math.abs((long)n);
        double result = 1;
        while (pow > 0 ) {
            if (pow % 2 != 0) {
                result *= x;
            }
            x *= x;
            pow /= 2;
        }
        if (n < 0) {
            return 1.0 / result;
        }
        return result;
    }

}
