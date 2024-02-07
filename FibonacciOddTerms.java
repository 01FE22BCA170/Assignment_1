public class FibonacciOddTerms {
    
    public static void main(String[] args) {
        int n = 10; // Number of terms in the series
        int a = 0, b = 1;
        
        System.out.println("Fibonacci series with only odd terms:");
        
        for (int i = 1; i <= n; i++) {
            int sum = a + b;
            a = b;
            b = sum;
            
            if (sum % 2 != 0) {
                System.out.print(sum + " ");
            }
        }
    }
}

git add .
git commit -m "Your commit message here"
git push origin main
git pull origin main
