package academy.learnrpogramming;

public class Main {

    public static void main(String[] args)
    {
        testPrime(10,50);
        testPrime(500,1000);
        testPrime(600000,600500);
    }

    public static void testPrime(int startingPoint, int stoppingPoint)
    {
        int count=0;
        for(int j=startingPoint; j<=stoppingPoint; j++)
        {
            if(isPrime(j))
            {
                count++;
                System.out.println("Number " + j + " is a prime number.");
                if(count>=3)
                {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n)
    {
        if(n==1)
        {
            return false;
        }
        for(int i=2; i <= n/2; i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }


}
